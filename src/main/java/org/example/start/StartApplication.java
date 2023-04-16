package org.example.start;

import org.example.abstractOrder.Order;
import org.example.abstractPerson.Person;
import org.example.try2.DijkstraMe;
import org.example.try2.Graph;
import org.example.try2.NodeMe;

import java.util.ArrayList;
import java.util.List;

public class StartApplication {
    List<Person> allPeople = new ArrayList<>();
    List<Order> allOrder = new ArrayList<>();

    public StartApplication(List<Person> allPeople, List<Order> allOrder) {
        this.allPeople = allPeople;
        this.allOrder = allOrder;
    }

    public void createAllObjects() {
        List<NodeMe> nodePeople = new ArrayList<>();
        List<NodeMe> nodeOrder = new ArrayList<>();

        for (int i = 0; i < allPeople.size(); i++) {
            nodePeople.add(new NodeMe(allPeople.get(i)));
        }   for (int i = 0; i < allOrder.size(); i++) {
            nodeOrder.add(new NodeMe(allOrder.get(i)));
        }

        List<Graph> graph = new ArrayList<>();
        for (int i = 0; i < nodePeople.size(); i++) {
            graph.add(new Graph());
        }
        for (int i = 0; i < nodePeople.size(); i++) {
            for (int j = 0; j < nodeOrder.size(); j++) {
                nodePeople.get(i).addDestination(nodeOrder.get(j));
            }
        }
        for (int i = 0; i < nodePeople.size(); i++) {
            for (int j = 0,k =0; j < nodeOrder.size();k++, j++) {
                graph.get(i).addNode(nodeOrder.get(j));
                graph.get(i).addNode(nodePeople.get(k));
            }
        }
        for (int i = 0; i < graph.size(); i++) {
            System.out.println(DijkstraMe.calculateTime(DijkstraMe.calculateShortestPathFromSource(graph.get(i),nodePeople.get(i))));
        }
    }

}
