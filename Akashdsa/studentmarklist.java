
import java.util.Scanner;

// Student class to store student information
class Student {

    String name;
    int id;
    int subject1, subject2, subject3;
    int totalMarks;

    Student(String name, int id, int subject1, int subject2, int subject3) {
        this.name = name;
        this.id = id;
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
        this.totalMarks = subject1 + subject2 + subject3;
    }
}

// Node class for BST
class Node {

    Student student;
    Node left, right;

    public Node(Student student) {
        this.student = student;
        left = right = null;
    }
}

// BinarySearchTree class
class BinarySearchTree {

    Node root;

    BinarySearchTree() {
        root = null;
    }

    // Insert student based on total marks (highest marks at root)
    void insert(Student student) {
        root = insertRec(root, student);
    }

    Node insertRec(Node root, Student student) {
        if (root == null) {
            root = new Node(student);
            return root;
        }
        // Insert student based on total marks in descending order
        if (student.totalMarks > root.student.totalMarks) {
            root.left = insertRec(root.left, student);
        } else {
            root.right = insertRec(root.right, student);
        }
        return root;
    }

    // Traverse BST in descending order (Left -> Root -> Right)
    void rankList(LinkedList rankList) {
        rankListRec(root, rankList);
    }

    void rankListRec(Node root, LinkedList rankList) {
        if (root != null) {
            rankListRec(root.left, rankList);
            rankList.add(root.student);
            rankListRec(root.right, rankList);
        }
    }
}

// Linked list class to store rank list
class LinkedList {

    class ListNode {

        Student student;
        ListNode next;

        ListNode(Student student) {
            this.student = student;
            this.next = null;
        }
    }

    private ListNode head;

    public LinkedList() {
        head = null;
    }

    // Add student to linked list
    public void add(Student student) {
        ListNode newNode = new ListNode(student);
        if (head == null) {
            head = newNode;
        } else {
            ListNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Display the rank list
    public void display() {
        ListNode current = head;
        int rank = 1;
        System.out.println("Rank List:");
        while (current != null) {
            Student s = current.student;
            System.out.println("Rank " + rank + ": " + s.name + " (ID: " + s.id + "), Total Marks: " + s.totalMarks);
            System.out.println("Subject Marks: " + s.subject1 + ", " + s.subject2 + ", " + s.subject3);
            current = current.next;
            rank++;
        }
    }
}

// Main class
public class studentmarklist {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinarySearchTree bst = new BinarySearchTree();
        LinkedList rankList = new LinkedList();

        System.out.println("Enter the number of students:");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Input student details
        for (int i = 0; i < n; i++) {
            System.out.println("Enter name, ID, and marks for 3 subjects of student " + (i + 1) + ":");
            String name = scanner.nextLine();
            int id = scanner.nextInt();
            int subject1 = scanner.nextInt();
            int subject2 = scanner.nextInt();
            int subject3 = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            // Create a student object and insert it into the BST
            Student student = new Student(name, id, subject1, subject2, subject3);
            bst.insert(student);
        }

        // Generate rank list by traversing the BST
        bst.rankList(rankList);

        // Display the rank list
        rankList.display();

        scanner.close();
    }
}
