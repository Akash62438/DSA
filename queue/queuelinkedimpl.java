
import java.util.*;

public class queuelinkedimpl {

    public static class node {

        int data;
        node next;

        node(int d) {
            data = d;
            next = null;
        }

    }

    public static class queue {

        node head = null;
        node tail = null;
        int size = 0;

        public void add(int value) {
            node temp = new node(value);
            if (size == 0) {
                head = temp;
                tail = temp;
            } else {
                tail.next = temp;
                tail = temp;

            }
            size++;
        }

        public int remove() {

            if (size == 0) {
                System.out.println("queue is empty");
                return -1;
            } else {

                int x = head.data;
                head = head.next;
                size--;
                return x;

            }

        }

        public int peek() {

            if (size == 0) {
                System.out.println("queue is empty");
                return -1;
            } else {

                int x = head.data;
                System.err.println(x);
                return x;

            }

        }

        public void display() {

            if (size == 0) {
                System.out.println("queue is empty");
            } else {
                node temp = head;
                while (temp != null) {
                    System.err.print(temp.data + " ");
                    temp = temp.next;
                }
                System.err.println("");

            }

        }

    }

    public static void main(String[] args) {
        queue q1 = new queue();

        Scanner sc = new Scanner(System.in);
        int choice, value;

        do {
            System.out.println("\n--- Queue Operations ---");
            System.out.println("1. Add");
            System.out.println("2. Remove");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to add: ");
                    value = sc.nextInt();
                    q1.add(value);
                    q1.display();
                    break;

                case 2:
                    q1.remove();
                    q1.display();
                    break;

                case 3:
                    q1.peek();
                    q1.display();
                    break;

                case 4:
                    q1.display();
                    break;

                case 5:
                    System.out.println("Exitin...");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 5);

        sc.close();

    }

}
