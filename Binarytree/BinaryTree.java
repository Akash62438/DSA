
public class BinaryTree {

    public class Node { // Capitalize class names for consistency

        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public class Tree {

        Node root = null;

        public void insert(int data) {

            Node newNode = new Node(data);

            if (root == null) {
                root = newNode; // Setting root correctly
            } else {
                Node current = root;
                Node parent;

                while (true) {
                    parent = current;

                    if (data <= current.data) {
                        current = current.left;
                        if (current == null) {
                            parent.left = newNode;
                            return;
                        }
                    } else {
                        current = current.right;
                        if (current == null) {
                            parent.right = newNode;
                            return;
                        }
                    }
                }
            }
        }

        // Correct parameter type to match 'Node' class
        public void preorder(Node root) {
            if (root == null) {
                return;
            }
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }

        public void postorder(Node root) {
            if (root == null) {
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }

        // Correct method name to 'inorder' and parameter to 'Node' class
        public void inorder(Node root) {
            if (root == null) {
                return;
            }
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        Tree tree = binaryTree.new Tree();

        // Test insertion
        tree.insert(10);
        tree.insert(5);
        tree.insert(15);
        tree.insert(2);
        tree.insert(7);

        System.out.println("Binary tree created with nodes inserted.");

        System.out.print("Preorder traversal: ");
        tree.preorder(tree.root);
        System.out.println();

        System.out.print("Inorder traversal: ");
        tree.inorder(tree.root);
        System.out.println();

        System.out.print("Postorder traversal: ");
        tree.postorder(tree.root);
        System.out.println();
    }
}
