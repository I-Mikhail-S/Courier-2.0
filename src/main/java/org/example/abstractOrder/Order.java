package org.example.abstractOrder;

import org.example.ID.ID;
import org.example.enumType.EnumOrder;
import org.example.point.Point;
import org.example.time.Time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

// TODO: 08/04/2023
public class Order  {
    private int id;
    private Point pointStart;
    private Point pointFinish;
    //private double distance;
    private Time time;
    private double weight;
    public boolean flag;

    public Order() {
    }

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

   class SortedOrder implements Comparator<Order>{
       @Override
       public int compare(Order o1, Order o2) {
           Date date1FirstOrder;
           Date date2FirstOrder;
           Date date1SecondOrder;
           Date date2SecondOrder;
           SimpleDateFormat sdf = new SimpleDateFormat("h:m");
           try {
               date1FirstOrder = sdf.parse(o1.getTime().getStartTimeInterval());
               date2FirstOrder = sdf.parse(o1.getTime().getEndTimeInterval());
               date1SecondOrder = sdf.parse(o2.getTime().getStartTimeInterval());
               date2SecondOrder = sdf.parse(o2.getTime().getEndTimeInterval());

           } catch (ParseException e) {
               throw new RuntimeException(e);
           }

           if (date2SecondOrder.before(date2FirstOrder)){
               return 1;
           }
           if(date2FirstOrder.equals(date1SecondOrder)){
               if(date1FirstOrder.before(date1SecondOrder)){
                   return -1;
               }
           }
           return 0;
       }
   }
}
