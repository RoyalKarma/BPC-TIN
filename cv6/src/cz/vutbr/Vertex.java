package cz.vutbr;

import java.util.HashMap;

public class Vertex {
    private int label;
    private HashMap<Vertex, Integer> costs;

    public Vertex(int label) {
        costs = new HashMap<>();
        this.label = label;
    }

    public void setLabel(int label) {
        this.label = label;
    }
    public int getCost(Vertex v2){
        return costs.get(v2);
    }

    public int getLabel() {
        return label;
    }
    public  void connect(Vertex v2, int cost){
        costs.put(v2, cost);

    }
}
