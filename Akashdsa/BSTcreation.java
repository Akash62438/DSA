
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BSTcreation {

    public static class Node {

        Integer data; // Use Integer instead of int
        Node left, right;

        Node(Integer data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static class BinaryTree {

        Node root;

        public void buildTree() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter root node data (null for no root):");
            String rootDataInput = scanner.nextLine();
            if (rootDataInput.equalsIgnoreCase("null")) {
                root = null; // No root node
                return;
            }
            root = new Node(Integer.parseInt(rootDataInput));

            Queue<Node> queue = new LinkedList<>();
            queue.add(root);

            while (!queue.isEmpty()) {
                Node currentNode = queue.poll();

                System.out.println("Enter left child of " + currentNode.data + " (null for no child):");
                String leftDataInput = scanner.nextLine();
                if (!leftDataInput.equalsIgnoreCase("null")) {
                    currentNode.left = new Node(Integer.parseInt(leftDataInput));
                    queue.add(currentNode.left);
                }

                System.out.println("Enter right child of " + currentNode.data + " (null for no child):");
                String rightDataInput = scanner.nextLine();
                if (!rightDataInput.equalsIgnoreCase("null")) {
                    currentNode.right = new Node(Integer.parseInt(rightDataInput));
                    queue.add(currentNode.right);
                }
            }
        }

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
    }
}
