
public class TreeNode {

    public static class node {

        int data;
        node left;
        node right;

        node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    // 1 display Binary tree 
    public class Binary_tree {

        node root = null;

        public void displayTree(node root) {
            if (root == null) {
                return;
            }
            System.out.print(root.data + " ");
            displayTree(root.left);
            displayTree(root.right);

        }

        public int sum(node root) {
            if (root == null) {
                return 0;
            }

            int x = root.data + sum(root.left) + sum(root.right);

            return x;

        }

        public int max_value(node root) {
            if (root == null) {
                return Integer.MIN_VALUE;
            }

            int lmax = max_value(root.left);
            int rmax = max_value(root.right);
            return Math.max(root.data, Math.max(lmax, rmax));
        }

    }

    public static void main(String[] args) {
        System.out.println("This is binary tree");

        node a = new node(1);
        node b = new node(2);
        node c = new node(3);
        node d = new node(4);
        node e = new node(5);
        node f = new node(6);
        node g = new node(7);

        TreeNode treeInstance = new TreeNode();
        Binary_tree tree = treeInstance.new Binary_tree();
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;

        tree.displayTree(a);
        System.out.println("");
        int x = tree.sum(a);
        System.out.print("the total sum of :" + x);
        System.out.println("");
        int y = tree.max_value(a);
        System.out.print("the max_val of binary tree is :" + y);

    }
}
