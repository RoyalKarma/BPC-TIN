package cz.vutbr;

public class Tree {
    Node root;

    public void insert(int data) {
        if (root == null)
            root = new Node(data);
        else
            insert(root, data);

    }

    public void insert(Node node, int data) {

        if (data < node.data) {
            if (node.left != null)
                insert(node.left, data);
            else {
                System.out.println("inserted node " + data + " left of " + node.data);
                node.left = new Node(data);
            }
        } else if (data > node.data) {
            if (node.right != null)
                insert(node.right, data);
            else {
                System.out.println("inserted node " + data + " right of: " + node.data);
                node.right = new Node(data);
            }
        }

    }

    void contains(int data) {
        System.out.println(contains(root, data));
    }

    public boolean contains(Node node, int i) {
        if (node == null) return false;
        if (node.data == i) return true;
        return contains(node.left, i) || contains(node.right, i);
    }


    public void print() {
        printPreorder();
        System.out.println("\n");
        printInorder();
        System.out.println("\n");
        printPostorder();
        System.out.println("\n");

    }


    void printInorder(Node node) {
        if (node == null)
            return;
        printInorder(node.left);
        System.out.print(node.data + " ");

        printInorder(node.right);
    }

    void printPostorder(Node node) {
        if (node == null)
            return;

        printPostorder(node.left);
        printPostorder(node.right);
        System.out.print(node.data + " ");
    }

    void printPreorder(Node node) {
        if (node == null)
            return;
        System.out.print(node.data + " ");
        printPreorder(node.left);

        printPreorder(node.right);
    }

    void printInorder() {
        printInorder(root);
    }

    void printPostorder() {
        printPostorder(root);
    }

    void printPreorder() {
        printPreorder(root);
    }

    void reverse() {
        printReversePreorder();
        System.out.println("\n");
        printReverseInorder();
        System.out.println("\n");
        printReversePostorder();
        System.out.println("\n");
    }

    void printReversePreorder(Node node) {
        if (node == null)
            return;
        System.out.print(node.data + " ");
        printPreorder(node.right);

        printPreorder(node.left);
    }

    void printReverseInorder(Node node) {
        if (node == null)
            return;
        printInorder(node.right);
        System.out.print(node.data + " ");

        printInorder(node.left);
    }

    void printReversePostorder(Node node) {
        if (node == null)
            return;

        printPostorder(node.right);
        printPostorder(node.left);
        System.out.print(node.data + " ");
    }

    void printReverseInorder() {
        printReverseInorder(root);
    }

    void printReversePostorder() {
        printReversePostorder(root);
    }

    void printReversePreorder() {
        printReversePreorder(root);
    }

    void getLeaves() {
        getLeaves(root);
    }

    public void getLeaves(Node node) {
        if (root == null) {
            return;
        }
        if (node.left == null && node.right == null)
            System.out.println(node.data);
        if (node.left != null)
            getLeaves(node.left);
        if (node.right != null)
            getLeaves(node.right);

    }

}
