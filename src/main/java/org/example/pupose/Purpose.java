package org.example.pupose;

import org.example.abstractOrder.Order;
import org.example.abstractPerson.Person;
import org.example.point.Point;

public class Purpose {
    private Person courier;
    private Order order;
    private Point startPoint;
    public int timeExecution;
    private double routeLength;

    public Person getCourier() {
        return courier;
    }

    public void setCourier(Person courier) {
        this.courier = courier;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Point getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(Point startPoint) {
        this.startPoint = startPoint;
    }

    public int getTimeExecution() {
        return timeExecution;
    }

    public void setTimeExecution(int timeExecution) {
        this.timeExecution = timeExecution;
    }

    public double getRouteLength() {
        return routeLength;
    }

    public void setRouteLength(double routeLength) {
        this.routeLength = routeLength;
    }

    @Override
    public String toString() {
        return "Purpose{" +
                "courier=" + courier +
                ", order=" + order +
                ", startPoint=" + startPoint +
                ", timeExecution=" + timeExecution +
                ", routeLength=" + routeLength +
                '}';
    }
}