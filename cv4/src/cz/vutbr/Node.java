package cz.vutbr;

public class Node {

        private int data;
        private Node next;
        private Node prev;
        public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }




        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
    public boolean hasNext(){
            return !(next == null);
    }
}
