
import java.util.Scanner;

public class lab2 {

    static class Node {

        char data;
        Node prev;
        Node next;

        Node(char data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    public static class DoublyLinkedList {

        Node head;
        Node tail;

        // Add node to the end of the doubly linked list
        void add(char data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
            }
        }

        // Method to print the list from head to tail
        void display() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }

    }

    public static boolean checkPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        // Creating a doubly linked list
        DoublyLinkedList list = new DoublyLinkedList();

        // Adding characters to the doubly linked list
        for (int i = 0; i < input.length(); i++) {
            list.add(input.charAt(i));
        }

        // Checking if the string is a palindrome
        boolean isPalindrome = checkPalindrome(input);

        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        // Display the characters in the doubly linked list
        System.out.println("The characters in the doubly linked list:");
        list.display();

        // Close the scanner
        scanner.close();
    }

    // Method to check if a string is a palindrome
}
