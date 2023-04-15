package org.example.main;

<<<<<<< HEAD
import org.example.abstractOrder.Order;
import org.example.abstractPerson.Person;
import org.example.graphDepth.GraphDepth;
import org.example.vertexAndEdge.Vertex;

public class Main {
    public static void main(String[] args) throws Exception {
        Person person1 = new Person();
        Order order1 = new Order();
        Vertex vertex1 = new Vertex(order1);
        GraphDepth graphDepth = new GraphDepth();

        graphDepth.addVertex(vertex1); //0
/*        graphDepth.addVertex('B'); //1
        graphDepth.addVertex('C'); //2
        graphDepth.addVertex('D'); //3
        graphDepth.addVertex('E'); //4
        graphDepth.addVertex('F'); //5
        graphDepth.addVertex('G'); //6

        graphDepth.addEdge(0,1);
        graphDepth.addEdge(0,2);
        graphDepth.addEdge(0,3);
        graphDepth.addEdge(1,4);
        graphDepth.addEdge(3,5);
        graphDepth.addEdge(5,6);

        System.out.println("Visits: ");
        graphDepth.dfs();*/
=======
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

>>>>>>> b8627db0737a1a8c303492e3fe72841b6fc13699
    }
}