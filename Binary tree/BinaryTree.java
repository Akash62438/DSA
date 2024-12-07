
public class BinaryTree {

    public class Node { 

        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public class Tree {

        public Node root;

        public Tree() {
            root = null;
        }

        public void insert(int data) {
            Node newNode = new Node(data);

            if (root == null) {
                root = newNode; 
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
    }

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        Tree tree = binaryTree.new Tree(); // Fixing instance creation

        // Test insertion
        tree.insert(10);
        tree.insert(5);
        tree.insert(15);
        tree.insert(2);
        tree.insert(7);

        System.out.println("Binary tree created with nodes inserted.");
    }
}
