package org.example.main;

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
    }
}