
import java.util.Scanner;

public class lab3 {

    static class Node {

        int data;  // Changed to int since we're adding integers
        Node prev;
        Node next;

        Node(int data) {  // Constructor now accepts int
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    public static class DoublyLinkedList {

        Node head;
        Node tail;

        public void addNode(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
            }
        }

        // Delete the nth node from the end
        public void deleteNthFromEnd(int n) {
            if (head == null) {
                return;
            }

            Node first = head, second = head;

            // Move second n steps ahead
            for (int i = 0; i < n; i++) {
                if (second == null) {
                    return;
                }
                second = second.next;
            }

            // If second is null, delete head (when n is equal to the length of the list)
            if (second == null) {
                head = head.next;
                if (head != null) {
                    head.prev = null;
                } else {
                    tail = null; // List is now empty
                }
                return;
            }

            // Move both pointers until second reaches the end
            while (second.next != null) {
                first = first.next;
                second = second.next;
            }

            // Delete the node after first
            Node toDelete = first.next;
            if (toDelete != null) {
                first.next = toDelete.next;
                if (toDelete.next != null) {
                    toDelete.next.prev = first;
                } else {
                    tail = first;  // Update tail if the last node was deleted
                }
            }
        }

        // Display the list
        public void display() {
            for (Node temp = head; temp != null; temp = temp.next) {
                System.out.print(temp.data + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DoublyLinkedList dll = new DoublyLinkedList();

        System.out.println("Enter number of nodes:");
        int numNodes = scanner.nextInt();

        System.out.println("Enter elements:");
        for (int i = 0; i < numNodes; i++) {
            dll.addNode(scanner.nextInt());
        }

        System.out.println("Enter value of n (to delete nth node from end):");
        int n = scanner.nextInt();

        System.out.println("Original List:");
        dll.display();

        dll.deleteNthFromEnd(n);

        System.out.println("List after deletion:");
        dll.display();

        scanner.close();
    }
}
