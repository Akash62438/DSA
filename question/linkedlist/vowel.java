
import java.util.Scanner;

public class vowel {

    public static class Node {

        char data;
        Node next;

        Node(char data) {
            this.data = data;
        }
    }

    public static class linkedlist {

        Node head = null;
        Node tail = null;
        int size = 0;

        void add(char data) {
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

        // Function to display the linked list (optional for testing)
        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string:");
        String str = sc.nextLine();

        linkedlist ll = new linkedlist();

        // Add characters to the linked list
        for (int i = 0; i < str.length(); i++) {
            ll.add(str.charAt(i));
        }

        // Count vowels
        int countA = 0, countE = 0, countI = 0, countO = 0, countU = 0;
        int cout = 0;
        Node temp = ll.head;

        while (temp != null) {
            char ch = temp.data;
            switch (ch) {
                case 'a':
                case 'A':
                    countA++;
                    cout++;
                    break;
                case 'e':
                case 'E':
                    countE++;
                    cout++;
                    break;
                case 'i':
                case 'I':
                    countI++;
                    cout++;
                    break;
                case 'o':
                case 'O':
                    countO++;
                    cout++;
                    break;
                case 'u':
                case 'U':
                    countU++;
                    cout++;
                    break;
                default:
                    break;
            }
            temp = temp.next;
        }

        // Output the vowel counts
        System.out.println("Count of 'a': " + countA);
        System.out.println("Count of 'e': " + countE);
        System.out.println("Count of 'i': " + countI);
        System.out.println("Count of 'o': " + countO);
        System.out.println("Count of 'u': " + countU);
        System.out.println("Count of total vowel: " + cout);
    }
}
