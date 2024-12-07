
import java.util.*;

public class level_binarytree {

    public class node {

        int data;
        node left;
        node right;

        node(int data) {
            this.data = data;
            left = null;
            right = null;
        }

    }

    public class binary_tree {

        node root;

        public void buildTree() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter root node data:");
            int rootData = scanner.nextInt();
            root = new node(rootData);

            Queue<node> queue = new LinkedList<>();
            queue.add(root);

            while (!queue.isEmpty()) {
                node currentnode = queue.poll();

                System.out.println("Enter left child of " + currentnode.data + " (-1 for no child):");
                int leftData = scanner.nextInt();
                if (leftData != -1) {
                    currentnode.left = new node(leftData);
                    queue.add(currentnode.left);
                }

                System.out.println("Enter right child of " + currentnode.data + " (-1 for no child):");
                int rightData = scanner.nextInt();
                if (rightData != -1) {
                    currentnode.right = new node(rightData);
                    queue.add(currentnode.right);
                }
            }
        }

        
        public int level_binary(node root) {
            if (root == null) {
                return 0;
            }
            return 1 + Math.max(level_binary(root.left), level_binary(root.right));
        }

        
        public void level_of(node root, int curr, int level) {
            if (root == null) {
                return;
            }
            if (curr == level) {
                System.out.print(root.data + " ");
            }
            level_of(root.left, curr + 1, level);
            level_of(root.right, curr + 1, level);
        }

       
        void levelorder(node root) {
            int n = level_binary(root);
            for (int i = 1; i <= n; i++) {
                level_of(root, 1, i);
                System.out.println();
            }
        }

    }

    public static void main(String[] args) {
        level_binarytree level = new level_binarytree();
        binary_tree tree = level.new binary_tree();

        // Build the binary tree
        tree.buildTree();

        // Print all levels of the binary tree
        System.out.println("Level-order traversal of the binary tree:");
        tree.levelorder(tree.root);
    }
}
