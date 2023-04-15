package org.example.agentCourier;

import org.example.ID.ID;
import org.example.abstractOrder.Order;
import org.example.abstractPerson.Person;
import org.example.graphDepth.GraphDepth;
import org.example.point.Point;

import java.util.ArrayList;

public class AgentCourier extends Person {
    private ID id; //id непонятно как использовать
    private String name;
    private double speed;
    private double energy;
    private Point location;

    public AgentCourier() {}

    public AgentCourier(ArrayList<Person> person, Order order) {
        GraphDepth graphDepth = new GraphDepth(); // надо использовать алгоритм Дейкстры

    }
}