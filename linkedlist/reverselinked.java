
import java.util.*;

public class reverselinked {

    public static class node {

        int value;
        node next;

        node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public static class linkedlist {

        node head;
        node tail;

        void insert(int data) {
            node node = new node(data);

            if (head == null) {
                head = node;
                tail = node;
            } else {
                tail.next = node;
                tail = tail.next;
            }

        }

        void display() {
            node temp = head;
            while (temp != null) {
                System.out.print(temp.value + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        // node reverse(node head){
        //     while(head.next==null) {
        //          System.out.println();
        //          return head;
        //     }
        //     node newhead = reverse(head.next);
        //     head.next.next=head;
        //     head.next=null;
        //     return newhead;
        // }
        // void reverseList() {
        //     head = reverse(head);
        // }
        public void reverse() {
            node previous = null;
            node current = head;
            node next = null;
            while (current != null) {
                next = current.next;
                current.next = previous;
                previous = current;
                current = next;
            }
            head = previous;
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        linkedlist ll = new linkedlist();

        System.out.println("Enter elements of the linked list (type 'done' to end):");

        while (sc.hasNextInt()) {
            int data = sc.nextInt();
            ll.insert(data);
        }

        System.out.println("Original Linked List:");
        ll.display();

        ll.reverse();

        System.out.println("Reversed Linked List:");
        ll.display();

    }
}
