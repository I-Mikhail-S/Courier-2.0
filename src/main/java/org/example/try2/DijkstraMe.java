package org.example.try2;

import org.example.abstractOrder.Order;
import org.example.abstractPerson.Person;
import org.example.time.Time;
import org.example.time.TimeBuilder;

import java.util.*;

public class DijkstraMe  {
    private static Map<Person,Order> data = new HashMap<>();

    public static Graph calculateShortestPathFromSource(Graph graph, NodeMe source) {

        source.setDistance(0);
        source.setPoint(0, 0);
        Set<NodeMe> settledNodes = new HashSet<>();
        Set<NodeMe> unsettledNodes = new HashSet<>();
        unsettledNodes.add(source);
        while (unsettledNodes.size() != 0) {
            NodeMe currentNode = getLowestDistanceNode(unsettledNodes);
            unsettledNodes.remove(currentNode);
            for (Map.Entry<NodeMe, Double> adjacencyPair :
                    currentNode.getAdjacentNodes().entrySet()) {
                NodeMe adjacentNode = adjacencyPair.getKey();
                Double edgeWeight = adjacencyPair.getValue();
                if (!settledNodes.contains(adjacentNode)) {
                    calculateMinimumDistance(adjacentNode, edgeWeight, currentNode);
                    unsettledNodes.add(adjacentNode);
                }
            }
            settledNodes.add(currentNode);
        }
        return graph;
    }

    public static  Map<Person,Order> calculateTime(Graph graph) {
        List<NodeMe> help = graph.getNodes().stream().sorted(Comparator.comparingInt(NodeMe::getDistance)).toList();
        for (int i = 1; i < help.size(); i++) {
            Time timeOrder = help.get(i).getNameO().getTime();
            String a = timeOrder.getStartTimeInterval();
            String b = timeOrder.getEndTimeInterval();
            long time = TimeBuilder.getTime(a,b);
            int bestTime = (int) (help.get(i).getDistance()/help.get(0).getNameC().getSpeed());
            if (time+3 >= bestTime) {
                data.put(help.get(0).getNameC(),help.get(i).getNameO());
                return  data;
            }
        }
        return null;

    }


    private static NodeMe getLowestDistanceNode(Set<NodeMe> unsettledNodes) {
        NodeMe lowestDistanceNode = null;
        int lowestDistance = Integer.MAX_VALUE;
        for (NodeMe node : unsettledNodes) {
            int nodeDistance = node.getDistance();
            if (nodeDistance < lowestDistance) {
                lowestDistance = nodeDistance;
                lowestDistanceNode = node;
            }
        }
        return lowestDistanceNode;
    }

    private static void calculateMinimumDistance(NodeMe evaluationNode,
                                                 Double edgeWeigh, NodeMe sourceNode) {
        Integer sourceDistance = sourceNode.getDistance();
        if (sourceDistance + edgeWeigh < evaluationNode.getDistance()) {
            evaluationNode.setDistance((int) (sourceDistance + edgeWeigh));
            LinkedList<NodeMe> shortestPath = new LinkedList<>(sourceNode.getShortestPath());
            shortestPath.add(sourceNode);
            evaluationNode.setShortestPath(shortestPath);
        }
    }

}
