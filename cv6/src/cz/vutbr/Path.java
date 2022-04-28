package cz.vutbr;

import cz.vutbr.Graph;
import cz.vutbr.Vertex;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Path {

    private List<Vertex> vertexes = new ArrayList<>();
    private int cost = 0;
    private Graph graph;

    public Path(Graph graph, int label) {
        this.graph = graph;
        vertexes.add(graph.getVertex(label));
    }

    public Path addVertex(int label) {
        Vertex vertex = graph.getVertex(label);
        Vertex lastVertex = vertexes.get(vertexes.size() - 1);
        vertexes.add(vertex);
        cost += lastVertex.getCost(vertex);
        return this;

    }

    public void printCost() {
        System.out.println(cost);
    }

}
