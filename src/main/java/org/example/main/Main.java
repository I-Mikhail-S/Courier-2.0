package org.example.main;

import org.example.ID.OrderId;
import org.example.ID.PersonID;
import org.example.abstractOrder.Order;
import org.example.abstractPerson.Person;
import org.example.courier.CourierBike;
import org.example.order.OrderLight;
import org.example.point.Point;
import org.example.time.Time;
import org.example.try2.DijkstraMe;
import org.example.try2.Graph;
import org.example.try2.NodeMe;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        NodeMe nodeA = new NodeMe(new Person(new PersonID(),"Stepan",2,23,new Point(1,6)));
        NodeMe nodeB = new NodeMe(new Person(new PersonID(),"Lev",23,23,new Point(2,8)));
        NodeMe nodeC = new NodeMe(new Order(new OrderId(),new Point(13,13),new Point(27,24),new Time("12:00","12:10"),34));
        NodeMe nodeD = new NodeMe(new Order(new OrderId(),new Point(14,13),new Point(13,12),new Time("12:00","12:05"),34));
        List<NodeMe> arr = new ArrayList<>();
        arr.add(nodeA);
        arr.add(nodeC);
        arr.add(nodeD);
        nodeA.addDestination(nodeC);
        nodeA.addDestination(nodeD);
        Graph graph = new Graph();

        graph.addNode(nodeA);
        graph.addNode(nodeC);
        graph.addNode(nodeD);
        graph = DijkstraMe.calculateShortestPathFromSource(graph, nodeA);
        System.out.println(graph);
        System.out.println(DijkstraMe.calculateTime(graph));

    }
}