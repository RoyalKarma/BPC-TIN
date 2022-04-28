package cz.vutbr;

import java.util.HashMap;

public class Graph {

    public HashMap<Integer, Vertex> vertexSet = new HashMap<Integer, Vertex>();


    public void add(int v1Label, int v2Label, int cost ){
        Vertex v1 = vertexSet.get(v1Label);
        Vertex v2 = vertexSet.get(v2Label);
        if(v1 == null){
            v1= new Vertex(v1Label);
            vertexSet.put(v1Label, v1);
        }
        if(v2 == null){
            v2 = new Vertex(v2Label);
            vertexSet.put(v2Label, v2);
        }
        v1.connect(v2, cost);
        v2.connect(v1, cost);
    }
    public Vertex getVertex(int label){
        return vertexSet.get(label);
    }



}
