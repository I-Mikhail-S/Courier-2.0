package org.example.pupose;

import org.example.abstractOrder.Order;
import org.example.abstractPerson.Person;
import org.example.distanceAndTime.DistanceCalculate;
import org.example.money.Money;
import org.example.point.Point;
import org.example.time.Time;
/**
 * Класс создает цель которую курьер должен выполнить для рассписания, поля для этого:
 * {@link Purpose#courier} курьер,
 * {@link Purpose#order} заказ,
 * {@link Purpose#startPoint} точка куда курьеру надо доставить заказ,
 * {@link Purpose#timeExecution} время, за которое, курьер сможет донести заказ,
 * {@link Purpose#routeLength} расстояние, которое пройдет курьер от точки сбора до клиента
 * {@link Purpose#income} доход за заказ
 */
public class Purpose {
    private Person courier;
    private Order order;
    private Point startPoint;
    private Point endPoint;
    private Time timeStart;
    private Time timeFinish;
    private long timeExecution; //время выполнения
    private double routeLength; // длинна маршрута
    private double income; //доход (не прибыль)

    public Purpose(Person courier, Order order) {
        this.courier = courier;
        this.order = order;
        this.startPoint = courier.getLocation();
        this.endPoint = order.getPointFinish();
        this.routeLength = DistanceCalculate.getDistance(courier, order);

        this.income = Money.moneySum(courier, order);
    }

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

    public long getTimeExecution() {
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

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    @Override
    public String toString() {
        return "Purpose{" +
                "courier=" + courier +
                ", order=" + order +
                ", startPoint=" + startPoint +
                ", timeExecution=" + timeExecution + "минуты" +
                ", routeLength=" + routeLength +
                ", income=" + income +
                '}';
    }
}