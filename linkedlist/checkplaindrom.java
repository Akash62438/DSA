
import java.util.*;

public class checkplaindrom {

    public static class node {

        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class linkedlist {

        node head;
        node tail;

        void insert(int data) {
            node Newnode = new node(data);

            if (head == null) {
                head = Newnode;
                tail = Newnode;
            } else {
                tail.next = Newnode;
                tail = tail.next;
            }
        }

        public boolean isPalindrome() {
            Stack<Integer> stack = new Stack<>();

            node temp = head;
            while (temp != null) {
                stack.push(temp.data);
                temp = temp.next;
            }

            temp = head;

            while (temp != null) {
                if (temp.data != stack.pop()) {
                    return false;
                }
                temp = temp.next;
            }

            return true;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        linkedlist ll = new linkedlist();
        System.out.println("enter the element (enter ok if u not wnat to eneter)");
        while (sc.hasNextInt()) {
            int value = sc.nextInt();
            ll.insert(value);
        }

        if (ll.isPalindrome()) {
            System.out.println("given linked list is plaindrome");
        } else {
            System.out.println("given linked list is not plaindrome");
        }

    }
}
