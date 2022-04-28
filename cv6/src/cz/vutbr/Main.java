package cz.vutbr;


public class Main {

    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.add(1, 6, 6);
        graph.add(6, 5, 5);
        graph.add(5, 4, 11);
        graph.add(4,3,9);


        graph.add(1,7,16);
        graph.add(7,8,21);
        graph.add(8,4,7);


        Vertex v1 = graph.getVertex(5);
        Vertex v2 = graph.getVertex(4);
        System.out.println(v1.getCost(v2)); // path between 5-4

        //1 - 6 - 5 - 4 - 3
        Path path = new Path(graph, 1);
        path.addVertex(6).addVertex(5).addVertex(4).addVertex(3);
        path.printCost();

        //1 - 7 - 8- 4
        Path newPath = new Path(graph,1 );
        newPath.addVertex(7).addVertex(8).addVertex(4);
        newPath.printCost();

    }
}
