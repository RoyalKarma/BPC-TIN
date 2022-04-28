package cz.vutbr;

public class Main {

    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(7);
        tree.insert(5);
        tree.insert(14);
        tree.insert(1);
        tree.insert(6);
        tree.insert(10);
        tree.insert(16);
        System.out.println("PRINT");
        tree.print();
        System.out.println("REVERSE");
        tree.reverse();

        System.out.println("CHECK VALUE");
        tree.contains(9);
        tree.contains(14);
        System.out.println("LEAVES");
        tree.getLeaves();
    }
}
