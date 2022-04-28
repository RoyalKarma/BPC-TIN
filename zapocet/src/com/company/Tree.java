package com.company;

public class Tree {
    Node root;
    double sumleaves = 0;
    int numofleaves = 0;
    int numofnodes = 1;


    public void printavg(){
        System.out.println((sumTree(root)/numofnodes));
    }
    public void insert(int data) {
        if (root == null)
            root = new Node(data);
        else
            ++numofnodes;
            insert(root, data);

    }

    public void insert(Node node, int data) {


        if (data < node.data) {
            if (node.left != null)
                insert(node.left, data);
            else {

                node.left = new Node(data);

            }
        } else if (data > node.data) {
            if (node.right != null)
                insert(node.right, data);
            else {

                node.right = new Node(data);

            }
        }


    }


    void getLeaves() {
        getLeaves(root);
        System.out.println(sumleaves/numofleaves);

    }

    public void getLeaves(Node node) {

        if (root == null) {
            return ;
        }
        if (node.left == null && node.right == null) {
            sumleaves += node.data;
            numofleaves++;

        }

        if (node.left != null)
            getLeaves(node.left);
        if (node.right != null)
            getLeaves(node.right);



    }

    public int findMax(Node node){
        Node temp = node;
        Node current = node;
        while (current.right != null) {
            temp = current;
            current = current.right;
        }
        current = temp;

        return (current.data);
    }
    public void printDepth(int depth){
        toDepth(root, 0,depth);
    }
    public void toDepth(Node node , int current, int max){
        if(node == null)
            return;
        int depth = ++current;
        if(current == max){
            System.out.println(node.data);
            return;
        }
        toDepth(node.left, depth, max);
        toDepth(node.right, depth, max);

    }

    public double sumTree(Node node){
        double sum = 0;
        double sumleft = 0;
        double sumright =0;

        if (root == null) {
        return 0;
        }
        if(node.left != null){

            sumleft = sumTree(node.left);


        }
        if(node.right != null){

            sumright = sumTree(node.right);

        }


        sum =(node.data + sumleft +sumright);

        return  sum;

    }


}
