package org.example.order;

import org.example.abstractOrder.Order;
import org.example.point.Point;
import org.example.time.Time;

public class OrderHard extends Order {
    private int id;
    private Point pointStart;
    private Point pointFinish;
    private Time timeStart;
    private Time timeFinish;
    private double weight;

    public OrderHard() {super();}

    public OrderHard(int id, Point pointStart, Point pointFinish, Time timeStart, Time timeFinish, double weight) {
        super(id, pointStart, pointFinish, timeStart, timeFinish, weight);
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public Point getPointStart() {
        return pointStart;
    }

    @Override
    public void setPointStart(Point pointStart) {
        this.pointStart = pointStart;
    }

    @Override
    public Point getPointFinish() {
        return pointFinish;
    }

    @Override
    public void setPointFinish(Point pointFinish) {
        this.pointFinish = pointFinish;
    }

    @Override
    public Time getTimeStart() {
        return timeStart;
    }

    @Override
    public void setTimeStart(Time timeStart) {
        this.timeStart = timeStart;
    }

    @Override
    public Time getTimeFinish() {
        return timeFinish;
    }

    @Override
    public void setTimeFinish(Time timeFinish) {
        this.timeFinish = timeFinish;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "OrderHard{" +
                "id=" + id +
                ", pointStart=" + pointStart +
                ", pointFinish=" + pointFinish +
                ", timeStart=" + timeStart +
                ", timeFinish=" + timeFinish +
                ", weight=" + weight +
                '}';
    }
}
