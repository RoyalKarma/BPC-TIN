package cz.vutbr;

public class List {

    private Node head;
    private Node tail;

    public void add(int data){
    Node newNode = new Node(data);
    if (head == null){
        tail = newNode;
    }
    newNode.setData(data);
    newNode.setNext(head);
    newNode.setPrev(null);
    head = newNode;


    }
    public void addLast(int data){
        if (head == null){
            head = new Node(data);
            tail = head;
            return;
        }
        Node last = tail;
        Node newNode = new Node(data);
        last.setNext(newNode);
        newNode.setPrev(last);
        tail= newNode;

    }

    public void removeFirst(){
        if (head == null)
            return;
    head = head.getNext();
    head.setPrev(null);
    }


    public void removeLast(){
    if(head == null)
        return;
    Node removeNode = tail;
    removeNode.getPrev().setNext(null);




    }
    public boolean containsValues(){
    if(head != null)
        return true;
    return false;
    }
    public boolean containsData(int data){
        Node node = head;

        if(node.getData() == data)

            return true;
        while (node.hasNext()){

            if (node.getData() == data)
                return true;
         node = node.getNext();
        }
        return false;

    }

    public void print(List list){
        Node node = list.head;
        System.out.println("List :");
        int counter= 0;
        while (node != null){
            System.out.println("[Node number]: "+ counter + " [Data]: " +node.getData() + " ");
            node = node.getNext();

            counter++;
        }
    }


}
