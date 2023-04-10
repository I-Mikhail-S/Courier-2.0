package org.example.graph;

import org.example.abstractOrder.Order;
import org.example.abstractPerson.Person;

public class Vertex <T> {
    private Integer label;
    private boolean isInTree;


    public Vertex(T label) {
        Object object;
        Order order = null;
        Person person = null;
        if(label instanceof Person) {
            person = (Person) label;
            this.label = (Integer) person.getId();
        }
        if(label instanceof Order) {
            object = (Order) label;
            this.label = (Integer) order.getId();
        }
        this.label = (Integer) label;
        this.isInTree = false;
    }

    public Integer getLabel() {
        return label;
    }

    public void setLabel(Integer label) {
        this.label = label;
    }

    public boolean isInTree() {
        return isInTree;
    }

    public void setInTree(boolean inTree) {
        isInTree = inTree;
    }
}
