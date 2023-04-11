package org.example.graph;

import org.example.abstractOrder.Order;
import org.example.abstractPerson.Person;

<<<<<<< HEAD
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
=======
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
>>>>>>> c2cd8f4cd02faa9fa76e263a5bbb52432b5e4a31
        this.label = label;
    }

    public boolean isInTree() {
        return isInTree;
    }

    public void setInTree(boolean inTree) {
        isInTree = inTree;
    }
}
