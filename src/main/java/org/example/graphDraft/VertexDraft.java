package org.example.graphDraft;

import org.example.order.Order;
import org.example.point.Point;

public class VertexDraft {
    private char label;
    private boolean isInTree;

    Point location;


    public VertexDraftA(char label, Order a) {
        this.label = label;
        this.isInTree = false;
        this.location = a.getPointStart();
    }

    public VertexDraftB(char label, Order a) {
        this.label = label;
        this.isInTree = false;
        this.location = a.getPointStart();
    }



    public char getLabel() {
        return label;
    }

    public void setLabel(char label) {
        this.label = label;
    }

    public boolean isInTree() {
        return isInTree;
    }

    public void setInTree(boolean inTree) {
        isInTree = inTree;
    }
}
