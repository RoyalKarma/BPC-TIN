package cz.vutbr;

public class Main {

    public static void main(String[] args) {
    List list = new List();

    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.print(list);
        System.out.println("removing first value");
    list.removeFirst();
    System.out.println("Adding 100 to the end");
    list.addLast(100);
    list.print(list);
    System.out.println("Removing last value");
    list.removeLast();
    list.print(list);
    if(list.containsValues())
        System.out.println("The list contains a value");
    else
        System.out.println("The list doesnt contain any values");

    System.out.println("Specific value(4) : "+list.containsData(4));
    System.out.println("Specific value(3) : "+list.containsData(3));



    }
}
