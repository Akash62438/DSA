
public class implement {

    public static class node {

        int data;
        node next;

        node(int d) {
            data = d;
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
            node t = new node(value);
            node temp = head;
            for (int i = 1; i < index - 1; i++) {
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;

            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                temp.next = head;
                head = temp;
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

    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        
        ll.insertAtEnd(5);
        ll.insertAtEnd(8);
        ll.insertAtEnd(12);
        ll.display();
        ll.insertAtHead(45);
        ll.display();
    }

}
