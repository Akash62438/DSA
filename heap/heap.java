
import java.util.*;

public class heap {

    public static class queue {

        Scanner sc = new Scanner(System.in);
        int[] array;
        int f = 0;
        int r = 0;
        int size = 0;

        public queue() {
            System.out.println("Enter the size of the queue:");
            int x = sc.nextInt(); // Get size from user
            array = new int[x];
        }

        public void add(int value) {

            if (r == array.length) {
                System.out.println("Queue is full, can't add.");
            } else {

                if (r < array.length) {
                    array[r] = value;
                    r++;
                } else {
                    r = 0;
                    array[r] = value;
                    r++;
                }
                size++;
            }
        }

        public int remove() {

            if (size == 0) {
                System.out.println("Queue is empty, can't remove.");
                return -1;
            } else {
                int val = array[f];
                if (f == array.length - 1) {
                    f = 0;
                } else {
                    f++;
                }
                size--; // Decrease the size after removing
                return val;
            }
        }

        public int peek() {

            if (size == 0) {
                System.out.println("Queue is empty.");
                return -1;
            }
            int p = array[f];
            System.out.println(p);
            return p;
        }

        public void display() {

            if (size == 0) {
                System.out.println("Queue is empty, can't display.");
            } else if (r > f) {

                for (int i = f; i < r; i++) {
                    System.out.print(array[i] + " ");
                }
            } else {

                for (int i = f; i < array.length; i++) {
                    System.out.print(array[i] + " ");
                }

                for (int i = 0; i < r; i++) {
                    System.out.print(array[i] + " ");
                }

            }
            System.out.println("");
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
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 5);

        sc.close();
    }

}
