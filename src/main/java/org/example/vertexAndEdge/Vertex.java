package org.example.vertexAndEdge;

public class Vertex {
    private Object label;  // метка А например
    public boolean wasVisited;
    private boolean canVisit;

    public Vertex(Object label) {
        this.label = label;
        wasVisited = false;
    }

    public Object getLabel() {
        return this.label;
    }

    public boolean getWasVisited() {
        return this.wasVisited;
    }

    public void setWasVisited(final boolean wasVisited) {
        this.wasVisited = wasVisited;
    }
}