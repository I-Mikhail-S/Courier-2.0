package org.example.Purpose;

import org.example.order.EnumOrder;
import org.example.order.Order;
import org.example.point.Point;
import org.example.time.Time;

public class Purpose {

    //private Courier courier;

    private Order order;
    private int id;
    private Point pointStart;
    private Point pointFinish;
    //private double distance;
    private Time timeStart;
    private Time timeFinish;
    private EnumOrder weight;

    double distance;

    public Purpose(Order order){

        this.id = order.getId();

        this.pointStart = order.getPointStart();

        this.pointFinish = order.getPointFinish();

        this.timeStart = order.getTimeStart();

        this.timeFinish = order.getTimeFinish();

    //    this.distance = order.getPointFinish().distancePoint(order.getPointStart());
    }

    public double getDistance() {
        return distance;
    }
    public int getId() {
        return id;
    }
    public Order getOrder() {
        return order;
    }
    public EnumOrder getWeight() {
        return weight;
    }
    public Point getPointFinish() {
        return pointFinish;
    }
    public Point getPointStart() {
        return pointStart;
    }
    public Time getTimeFinish() {
        return timeFinish;
    }


    public void setDistance(double distance) {
        this.distance = distance;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setPointFinish(Point pointFinish) {
        this.pointFinish = pointFinish;
    }
    public void setOrder(Order order) {
        this.order = order;
    }
    public void setTimeFinish(Time timeFinish) {
        this.timeFinish = timeFinish;
    }
    public void setTimeStart(Time timeStart) {
        this.timeStart = timeStart;
    }
    public void setWeight(EnumOrder weight) {
        this.weight = weight;
    }
    public void setPointStart(Point pointStart) {
        this.pointStart = pointStart;
    }


    @Override
    public String toString(){
        return  "Заказ" + order + "\n" +
                "Начальное положение" + pointStart + "\n" +
                "Место назначения" +  pointFinish + "\n" +
                "Начальное время" + timeStart + "\n" +
                "Время завершения" + timeFinish + "\n" +
                "Вес" + weight + "\n" +
                "Дистанция" + distance + "\n";

    }
}
