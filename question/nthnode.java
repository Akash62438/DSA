
import java.util.Scanner;

public class nthnode {

    public static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }

    }

    public static class linkedlist {

        Node head = null;
        Node tail = null;
        int size = 0;

        void add(int data) {
            Node temp = new Node(data);

            if (head == null) {
                head = temp;
                tail = temp;
            } else {

                tail.next = temp;
                tail = temp;
            }

            size++;

        }

        void display() {
            Node temp = head;

            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }

            System.out.println("");
        }

        int delete(int idx) {
            Node temp = head;
            for (int i = 0; i < idx; i++) {
                temp = temp.next;
            }
            int x = temp.data;
            temp.data = temp.next.data;
            temp.next = temp.next.next;
            return x;
        }

        int print(int idx) {
            Node temp = head;
            for (int i = 0; i < idx; i++) {
                temp = temp.next;
            }
            int x = temp.data;
            System.out.println(x);
            return x;
        }

        int printlast(int idx) {
            int size = 0;
            Node temp = head;

            while (temp != null) {
                size++;
                temp = temp.next;

            }

            int s = size - idx + 1;

            temp = head;

            for (int i = 1; i < s; i++) {
                temp = temp.next;

            }

            if (s == 1) {
                int x = head.data;
                head = head.next; // Move the head to the next node
                size--;
                return x;
            } else if (temp.next == null) {

                int x = temp.data;
                System.out.println(x);
                temp.data = 0;
                return x;
            } else {
                int x = temp.data;
                temp.data = temp.next.data;
                temp.next = temp.next.next;
                System.out.println(x);

                return x;
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        linkedlist list = new linkedlist();

        // System.out.println("enter the element");
        // int n = sc.nextInt();
        // list.add(n);
        // int m = sc.nextInt();
        // list.add(m);
        // int p = sc.nextInt();
        // list.add(p);
        // int q = sc.nextInt();
        // list.add(q);
        // int r = sc.nextInt();
        // list.add(r);
        // list.display();
        list.add(13);
        list.add(14);
        list.add(15);
        list.add(16);
        list.add(17);
        list.display();
        // System.out.println("enter idx which u want to delete");
        // int w = sc.nextInt();
        // list.delete(w);
        // System.out.println("linked list after deletion");
        // list.display();
        // System.out.println("enter idx which u want to print");
        // int k = sc.nextInt();
        // list.print(k);
        list.printlast(4);
        list.display();
    }
}
