//import java.lang.runtime.TemplateRuntime;

public class last {

    public static class node {

        int data;
        node next;

        node(int data) {
            this.data = data;
        }
    }

    public static class linkedlist {

        node head = null;
        node tail = null;

        void add(int data) {
            node temp = new node(data);

            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
        }

        void display() {

            node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println("");
        }

        int nthnodefromend(int idx) {

            node fast = head;
            node slow = head;

            for (int i = 1; i <= idx; i++) {
                fast = fast.next;
            }

            if (fast == null) {
                int x = head.data;
                head = head.next;
                return x;
            }

            while (fast.next != null) {
                slow = slow.next;
                fast = fast.next;
            }
            int x = slow.data;
            slow.next = slow.next.next;
            return x;

        }

        int middle() {
            node fastt = head;
            node sloww = head;

            while (fastt != null && fastt.next != null) {

                sloww = sloww.next;
                fastt = fastt.next.next;
            }

            int x = sloww.data;
            System.out.println(x);
            return x;
        }

        int middledelete() {
            node f = head;
            node l = head;

            while (f.next.next != null && f.next.next.next != null) {
                l = l.next;
                f = f.next.next;
            }
            l.next = l.next.next;
            return 0;
        }

    }

    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.add(12);
        ll.add(15);
        ll.add(17);
        ll.add(19);
        ll.add(10);
        ll.add(21);
        ll.add(13);
        ll.display();
        ll.middle();
        ll.middledelete();
        ll.display();

    }
}
