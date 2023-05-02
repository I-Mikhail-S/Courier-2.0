package org.example.try2;

import org.w3c.dom.Node;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Graph   {

    private Set<NodeMe> nodes = new HashSet<>();

    public void addNode(NodeMe node) {
        nodes.add(node);
    }

    public Set<NodeMe> getNodes() {
        return nodes;
    }

    public void setNodes(Set<NodeMe> nodes) {
        this.nodes = nodes;
    }

    @Override
    public String toString() {
        return "Graph{" +
                "nodes=" + nodes +
                '}';
    }


}