
import java.util.*;

public class DiameterTree {

    public static class Node {

        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    public class BinaryTree {

        Node root = null;
        int max_diameter = 0;

        public int level_tree(Node root) {
            if (root == null) {
                return 0;
            }
            return 1 + Math.max(level_tree(root.left), level_tree(root.right));
        }

        public int diameter_tree(Node root) {
            if (root == null) {
                return 0;
            }

            int sum = level_tree(root.left) + level_tree(root.right);
            max_diameter = Math.max(sum, max_diameter);
            diameter_tree(root.left);
            diameter_tree(root.right);
            return max_diameter;
        }

        // Method to build the tree from user input
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
    }

    public static void main(String[] args) {

        DiameterTree treeInstance = new DiameterTree();
        BinaryTree tree = treeInstance.new BinaryTree();

        // Set root and calculate diameter
        tree.buildTree();

        // Calculate and display the diameter
        int diameter = tree.diameter_tree(tree.root);
        System.out.println("Diameter of the tree: " + diameter);
    }
}
