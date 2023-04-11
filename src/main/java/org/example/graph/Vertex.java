package org.example.graph;

import org.example.abstractOrder.Order;
import org.example.abstractPerson.Person;

public class Vertex<T> {
    private T label;
    private boolean isInTree;

    public Vertex(T label) {
        Order order = null;
        Person person = null;
        if((label) instanceof Person){

        }
        else
        this.label = label;
        this.isInTree = false;
    }

    public T getLabel() {
        return label;
    }

    public void setLabel(T label) {
        this.label = label;
    }

    public boolean isInTree() {
        return isInTree;
    }

    public void setInTree(boolean inTree) {
        isInTree = inTree;
    }
}
