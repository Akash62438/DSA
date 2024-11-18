
import java.util.*;

class Node {

    int data;
    Node left, right;

    public Node(int key) {
        this.data = key;
        left = right = null;
    }
}

public class BinarySearchTree {

    Node root;

    public BinarySearchTree() {
        root = null;
    }

    int search(int val, Node root) {
        if (root == null) {
            System.out.println("Key not found.");
            return -1; // Not found
        }

        if (root.data == val) {
            System.out.println("Key found: " + root.data);
            return root.data;
        }

        if (val < root.data) {
            return search(val, root.left);
        } else {
            return search(val, root.right);
        }
    }

    Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }

        if (val < root.data) {
            root.left = insert(root.left, val);
        } else if (val > root.data) {
            root.right = insert(root.right, val);
        }
        return root;
    }

    void delete(int val) {
        root = deleteRec(root, val);
    }

    Node deleteRec(Node root, int val) {
        if (root == null) {
            System.out.println("Key not found.");
            return root;
        }

        if (val < root.data) {
            root.left = deleteRec(root.left, val);
        } else if (val > root.data) {
            root.right = deleteRec(root.right, val);
        } else {
            // Node with one child or no child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // Node with two children
            root.data = minValue(root.right);
            root.right = deleteRec(root.right, root.data);
        }
        return root;
    }

    // Helper function to find the minimum value in a subtree
    int minValue(Node root) {
        int minVal = root.data;
        while (root.left != null) {
            root = root.left;
            minVal = root.data;
        }
        return minVal;
    }

    // Build the BST interactively
    public void buildTree() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of nodes:");
        int n = scanner.nextInt();

        System.out.println("Enter " + n + " values to build the BST:");
        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
            root = insert(root, value); // Correctly call insert with the current root
        }
    }

    // Inorder traversal to display the BST
    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Build the Binary Search Tree:");
        bst.buildTree();

        System.out.println("\nInorder traversal of the BST:");
        bst.inorder(bst.root);

        System.out.println("\n\nEnter a value to search:");
        int val = scanner.nextInt();
        bst.search(val, bst.root);

        System.out.println("\nEnter a value to delete:");
        int delVal = scanner.nextInt();
        bst.delete(delVal);

        System.out.println("\nInorder traversal after deletion:");
        bst.inorder(bst.root);
    }
}
