package com.company;

public class Main {

    public static void main(String[] args) {
    Tree tree = new Tree();
    tree.insert(10);
    tree.insert(4);
    tree.insert(15);
    tree.insert(20);
    tree.insert(1);
    tree.insert(6);
    tree.insert(5);
    tree.insert(7);

        System.out.println("leaves avg");
    tree.getLeaves();
    tree.getLeaves();
        System.out.println("total avg");
    tree.printavg();
    tree.printavg();
    System.out.println(tree.findMax(tree.root));
    tree.printDepth(4);


    }
}
