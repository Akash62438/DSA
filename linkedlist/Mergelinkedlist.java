
public class Mergelinkedlist {

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
        int size = 0;

        void add(int data) {
            node temp = new node(data);

            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
            size++;

        }

        int remove(int idx) {

            if (size == 0) {
                return -1;
            } else {
                node temp = head;
                for (int i = 0; i < idx; i++) {
                    temp = temp.next;
                }
                temp.next = temp.next.next;
                return 1;
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

    }

    public static class merge {

        node mergelist(node head1, node head2) {
            node extra = new node(100);
            node tempm = extra;

            node temp1 = head1;
            node temp2 = head2;

            while (temp1 != null && temp2 != null) {

                if (temp1.data >= temp2.data) {
                    tempm.next = temp2;
                    tempm = temp2;
                    temp2 = temp2.next;
                } else {
                    tempm.next = temp1;
                    tempm = temp1;
                    temp1 = temp1.next;
                }

            }

            if (temp1 == null) {
                tempm.next = temp2;
            } else {
                tempm.next = temp1;
            }

            return extra.next;

        }

    }

    public static void main(String[] args) {
        linkedlist ll1 = new linkedlist();
        linkedlist ll2 = new linkedlist();
        merge m2 = new merge();
        // System.out.println("enter linked1" + " ");
        // for (int i = 0; i < 5; i++) {
        //     Scanner sc = new Scanner(System.in);

        //     int x = sc.nextInt();
        //     ll1.add(x);
        // }
        // System.out.println("enter linked2");
        // for (int i = 0; i < 6; i++) {
        //     Scanner sc = new Scanner(System.in);
        //     int y = sc.nextInt();
        //     ll2.add(y);
        // }
        ll1.add(1);
        ll1.add(3);
        ll1.add(5);
        ll1.add(7);
        ll1.add(9);
        ll2.add(2);
        ll2.add(4);
        ll2.add(6);
        ll2.add(8);
        ll1.display();
        ll2.display();

        node mergedHead = m2.mergelist(ll1.head, ll2.head);

        System.out.print("Merged List: ");
        node temp = mergedHead;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();

    }

}
