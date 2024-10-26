
import java.util.Scanner;

public class user {

    public static class node {

        int data;
        node next;

        node(int d) {
            data = d;
            next = null;
        }
    }

    public static class linkedlist {

        node head = null;
        node tail = null;

        void insertAtEnd(int value) {
            node temp = new node(value);

            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
        }

        void insertAtHead(int value) {
            node temp = new node(value);

            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                temp.next = head;
                head = temp;
            }
        }

        void insertAt(int value, int index) {
            if (index == 1) {
                insertAtHead(value);
                return;
            }

            node t = new node(value);
            node temp = head;
            for (int i = 1; i <= index - 1; i++) {
                if (temp != null) {
                    temp = temp.next;
                } else {
                    System.out.println("Index out of bounds");
                    return;
                }
            }

            if (temp != null && temp.next != null) {
                t.next = temp.next;
                temp.next = t;
            } else {
                insertAtEnd(value); // If the index is at the end, treat it as an insertion at the end.
            }
        }

        void display() {
            node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        void deleteat(int idx) {

            node temp = head;
            for (int i = 0; i < idx - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }

        int size() {

            int cout = 0;
            while (head != null) {
                cout++;
                head = head.next;
            }
            return cout;
        }

        int getat(int idx) {
            if (idx < 1 || idx > size()) {
                System.err.println("Wrong index");
                return -1;
            }

            node temp = head;
            for (int i = 1; i < idx; i++) {
                temp = temp.next;
            }
            return temp.data;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        linkedlist ll = new linkedlist();

        // Manually adding nodes a, b, c, d to the linked list
        ll.insertAtEnd(6);
        ll.insertAtEnd(8);
        ll.insertAtEnd(9);
        ll.insertAtEnd(10);

        // Display the initial list (nodes a, b, c, d)
        System.out.print("Initial list: ");
        ll.display();

        while (true) {
            System.out.println("1. Insert at end");
            System.out.println("2. Insert at head");
            System.out.println("3. Insert at specific index");
            System.out.println("4. Display list");
            System.out.println("5. Delete at");
            System.out.println("6. get at");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert at end: ");
                    int valueEnd = sc.nextInt();
                    ll.insertAtEnd(valueEnd);
                    System.out.println("............after adding element new linked list is........  ");
                    ll.display();
                    System.out.println();
                    break;

                case 2:
                    System.out.print("Enter value to insert at head: ");
                    int valueHead = sc.nextInt();
                    ll.insertAtHead(valueHead);
                    System.out.println("............after adding element new linked list is........  ");
                    ll.display();
                    System.out.println();
                    break;

                case 3:
                    System.out.print("Enter value to insert: ");
                    int value = sc.nextInt();
                    System.out.print("Enter index: ");
                    int index = sc.nextInt();
                    ll.insertAt(value, index);
                    System.out.println("............after adding element new linked list is........  ");
                    ll.display();
                    System.out.println();
                    break;

                case 4:
                    ll.display();
                    break;
                case 5:
                    System.out.print("enter index at which element should be deleted");
                    int x = sc.nextInt();
                    ll.deleteat(x);
                    ll.display();

                case 6:
                    System.out.print("enter the index element should get");
                    int y = sc.nextInt();
                    ll.getat(y);
                    ll.display();

                case 7:
                    System.out.println("Exiting...");
                    ll.display();
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice, try again.");
                    break;
            }
        }
    }
}
