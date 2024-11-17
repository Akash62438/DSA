
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ReverseBinaryTree {

    public static class Node {

        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static class BinaryTree {

        Node root;

        // Method to reverse the binary tree (mirror it)
        public void reverse(Node root) {
            if (root == null) {
                return;
            }

            // Swap the left and right children
            Node temp = root.left;
            root.left = root.right;
            root.right = temp;

            // Recursively reverse the left and right subtrees
            reverse(root.left);
            reverse(root.right);
        }

        public void buildTree() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter root node data:");
            int rootData = scanner.nextInt();
            root = new Node(rootData);

            Queue<Node> queue = new LinkedList<>();
            queue.add(root);

            while (!queue.isEmpty()) {
                Node currentNode = queue.poll();

                System.out.println("Enter left child of " + currentNode.data + " (-1 for no child):");
                int leftData = scanner.nextInt();
                if (leftData != -1) {
                    currentNode.left = new Node(leftData);
                    queue.add(currentNode.left);
                }

                System.out.println("Enter right child of " + currentNode.data + " (-1 for no child):");
                int rightData = scanner.nextInt();
                if (rightData != -1) {
                    currentNode.right = new Node(rightData);
                    queue.add(currentNode.right);
                }
            }
        }

        // Pre-order traversal to print the tree
        public void preOrder(Node root) {
            if (root == null) {
                return;
            }
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.buildTree();

        System.out.println("Original Tree (Pre-order): ");
        tree.preOrder(tree.root);
        System.out.println();

        // Reverse the tree
        tree.reverse(tree.root);

        System.out.println("Reversed Tree (Pre-order): ");
        tree.preOrder(tree.root);
        System.out.println();
    }
}
