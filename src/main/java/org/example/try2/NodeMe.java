package org.example.try2;

import org.example.abstractOrder.Order;
import org.example.abstractPerson.Person;
import org.example.point.Point;

import java.util.*;

public class NodeMe  {

    // Member variables of this class
    private Order nameO;
    private Person nameC;
    private int x;
    private int y;

    private int speed;

    private int x1;
    private int y1;



    private List<Point> prevCoord = new ArrayList<>();
    private List<NodeMe> shortestPath = new LinkedList<>();

    private Integer distance = Integer.MAX_VALUE;

    Map<NodeMe, Double> adjacentNodes = new HashMap<NodeMe, Double>();

    public double computeEuclideanDistance() {
        double Xs = Math.pow(x1 - x, 2);
        double Ys = Math.pow(y1 - y, 2);
        double distance = Math.pow((Xs + Ys), 0.5);
        return distance;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void addDestination(NodeMe destination) {
        if (destination.nameC instanceof Person) {
            this.x1 = (int) ((Person) destination.nameC).getLocation().getX();
            this.y1 = (int) ((Person) destination.nameC).getLocation().getY();
        }
        if (destination.nameO instanceof Order) {
            this.x1 = (int) ((Order) destination.nameO).getPointFinish().getX();
            this.y1 = (int) ((Order) destination.nameO).getPointFinish().getY();
        }
        adjacentNodes.put(destination, computeEuclideanDistance());

    }

    public NodeMe(Object name) {
        if (name instanceof Order) {
            this.nameO = (Order) name;
            this.x = (int) ((Order) name).getPointFinish().getX();
            this.y = (int) ((Order) name).getPointFinish().getY();
        }
        if (name instanceof Person) {
            this.nameC = (Person) name;
            this.x = (int) ((Person) name).getLocation().getX();
            this.y = (int) ((Person) name).getLocation().getY();
            this.speed = (int) ((Person) name).getSpeed();
        }
    }




    public List<NodeMe> getShortestPath() {
        return shortestPath;
    }

    public void setShortestPath(List<NodeMe> shortestPath) {
        this.shortestPath = shortestPath;
    }

    public  Integer getDistance() {
        return distance;
    }

    public void setPoint(Integer x2, Integer y2) {
        this.x1 = x2;
        this.y1 = y2;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public Map<NodeMe, Double> getAdjacentNodes() {
        return adjacentNodes;
    }



    public void setAdjacentNodes(Map<NodeMe, Double> adjacentNodes) {
        this.adjacentNodes = adjacentNodes;
    }

    @Override
    public String toString() {
        if (nameC instanceof Person) {
            return "NodeMe{" +
                    "name='" + ((Person) nameC).getName() + '\'' +
                    ", distance=" + distance +
                    '}';
        } else if (nameO instanceof Order) {
            return "NodeMe{" +
                    "name='" + ((Order) nameO).getId() + '\'' +
                    ", distance=" + distance +
                    '}';
        }
        return " ";

    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public Order getNameO() {
        return nameO;
    }

    public void setNameO(Order nameO) {
        this.nameO = nameO;
    }

    public Person getNameC() {
        return nameC;
    }

    public void setNameC(Person nameC) {
        this.nameC = nameC;
    }
}
