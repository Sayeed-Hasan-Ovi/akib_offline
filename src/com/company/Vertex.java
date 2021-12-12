package com.company;

import java.util.ArrayList;

public class Vertex {

    private int node;
    private ArrayList<Edge> adj;

    public Vertex(int node) {
        this.node = node;
        adj = new ArrayList<>();
    }

    public int getNode() {
        return node;
    }

    public ArrayList<Edge> getAdj() {
        return adj;
    }
}
