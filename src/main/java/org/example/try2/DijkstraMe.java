package org.example.try2;

import org.example.abstractOrder.Order;
import org.example.time.Time;
import org.example.time.TimeBuilder;

import java.util.*;

public class DijkstraMe  {
    private static Map<Integer, Object> data = new HashMap<>();

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

    public static Map<Integer, Object> calculateTime(Graph graph) {
       int speed = graph.getNodes().stream().iterator().next().getSpeed();
        if (!graph.getNodes().isEmpty())
            graph.getNodes().remove(graph.getNodes().iterator().next());

        Time timeOrder = (graph.getNodes().stream().sorted(Comparator.comparingInt(NodeMe::getDistance)).iterator().next().getName()
                instanceof Order)?((Order) graph.getNodes().stream().sorted(Comparator.comparingInt(NodeMe::getDistance)).iterator().next().getName()).getTime():null;

        String a = timeOrder.getStartTimeInterval();
        String b = timeOrder.getEndTimeInterval();
        while( graph.getNodes().size()!=0) {
            long time = TimeBuilder.getTime(a,b);
            int bestTime = graph.getNodes().stream().sorted(Comparator.comparingInt(NodeMe::getDistance)).iterator().next().getDistance()/speed;
            if (time+3 >= bestTime) {
                data.put(bestTime,
                        (graph.getNodes().stream().sorted(Comparator.comparingInt(NodeMe::getDistance)).iterator().next().getName()
                                instanceof Order) ? graph.getNodes().stream().sorted(Comparator.comparingInt(NodeMe::getDistance)).iterator().next().getName() : null);
           break;
            } else {
                graph.getNodes().remove(graph.getNodes().iterator().next());
            }
        }


        return data;
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
