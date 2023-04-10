package org.example.main;

import org.example.graph.Graph;

public class Main {
    public static void main(String[] args) throws Exception {
        Graph theGraph = new Graph();

        theGraph.addVertex('A'); // 0 (исходная вершина)
        theGraph.addVertex('B'); // 1
        theGraph.addVertex('C'); // 2
        theGraph.addVertex('D'); // 3
        theGraph.addVertex('E'); // 4
        theGraph.addVertex('I'); // 5

        theGraph.addEdge(0, 1, 50); // AB 50
        theGraph.addEdge(1, 2, 60); // BC 60
        theGraph.addEdge(1, 3, 90); // BD 90
        theGraph.addEdge(2, 4, 40); // CE 40
        theGraph.addEdge(3, 2, 20); // DC 20
        theGraph.addEdge(3, 4, 70); // DE 70
        theGraph.addEdge(4, 1, 50); // EB 50
        theGraph.addEdge(0, 1, 50);
        theGraph.addEdge(0, 5, 70);

        System.out.println("Shortest paths");
        theGraph.path(); // Кратчайшие пути
        System.out.println();
    }
}