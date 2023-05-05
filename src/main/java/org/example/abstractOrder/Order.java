package org.example.abstractOrder;

import org.example.ID.ID;
import org.example.enumType.EnumOrder;
import org.example.point.Point;
import org.example.time.Time;

// TODO: 08/04/2023
public class Order implements Comparable<Order> {
    private int id;
    private Point pointStart;
    private Point pointFinish;
    //private double distance;
    private Time time;
    private double weight;
    public boolean flag;

    public Order() {}

    public Order(int id, Point pointStart, Point pointFinish, Time time, double weight) {
        this.id = id;
        this.pointStart = pointStart;
        this.pointFinish = pointFinish;
        this.time = time;
        this.weight = weight;
        this.flag = false;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Point getPointStart() {
        return pointStart;
    }
    public void setPointStart(Point pointStart) {
        this.pointStart = pointStart;
    }
    public Point getPointFinish() {
        return pointFinish;
    }
    public void setPointFinish(Point pointFinish) {
        this.pointFinish = pointFinish;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", pointStart=" + pointStart +
                ", pointFinish=" + pointFinish +
                ", time=" + time +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int compareTo(Order o) {
        return (int) ((int) getTime().getTimeBuilder().getTime(time.getStartTimeInterval(),time.getEndTimeInterval())-
                        o.getTime().getTimeBuilder().getTime(o.getTime().getStartTimeInterval(),o.getTime().getEndTimeInterval()));
    }
}
