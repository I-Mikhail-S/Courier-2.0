package org.example.javaFX;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import org.example.abstractOrder.Order;
import org.example.abstractPerson.Person;
import org.example.basicAlgorithm.BasicAlgorithm;
import org.example.courier.CourierBike;
import org.example.courier.CourierCar;
import org.example.courier.CourierPeople;
import org.example.order.OrderHard;
import org.example.order.OrderLight;
import org.example.order.OrderMedium;
import org.example.point.Point;
import org.example.pupose.Purpose;
import org.example.schedule.Schedule;
import org.example.time.Time;

import java.util.ArrayList;
import java.util.List;

public class MainController {
    @FXML

    public Button BackButton;
    public Button StartButton;
    public ToggleButton StressToggle;

    public ListView <String> CourierList;

    public ListView <String> OrderList;
    public ListView ResultList;
    public TextField courierTimeStart;
    public TextField courierTimeEnd;

    List<Order> orders = new ArrayList<>();
    List<Person> persons = new ArrayList();
    public TextField courierTimeStart;
    public TextField courierTimeEnd;
    public TextField yCourier;
    public TextField xCourier;
    public TextField energyCourier;
    public TextField endTimeOrder;
    public TextField startTimeOrder;
    public TextField xStartOrder;
    public TextField xEndOrder;
    public TextField yStartOrder;
    public TextField yEndOrder;
    public TextField weightOrder;
    public TextField speedCourier;
    public TextField nameCourier;


    public void AddOrder(ActionEvent event) {

        int id = 1 + OrderList.getItems().size();
        double xStart = Double.parseDouble(xStartOrder.getText());
        double yStart = Double.parseDouble(yStartOrder.getText());

        double yEnd = Double.parseDouble(yEndOrder.getText());
        double xEnd = Double.parseDouble(xEndOrder.getText());

        Point start = new Point (xStart, yStart);
        Point end = new Point(xEnd,yEnd);

        String time1 = startTimeOrder.getText();
        String time2 = endTimeOrder.getText();
        Time time = new Time(time1,time2);

        double weight = Double.parseDouble(weightOrder.getText());


        Order order = new Order(id, start, end, time,weight);

        orders.add(order);
        OrderList.getItems().add(order.OrderToString());
    }

    public void AddCourier(ActionEvent event) {

        int id = 1 + CourierList.getItems().size();
        String name = nameCourier.getText();
        double speed = Double.parseDouble(speedCourier.getText());
        double x = Double.parseDouble(xCourier.getText());
        double y = Double.parseDouble(yCourier.getText());
        double energy = Double.parseDouble(energyCourier.getText());
        Point point = new Point(x,y);
        Person courier = new Person(id, name, speed, energy,courierTimeStart.getText(),courierTimeEnd.getText(), point);
        persons.add(courier);
        CourierList.getItems().add(courier.PersonToString());
    }

    public void StartApplication(ActionEvent event) {
        ResultList.getItems().clear();
        Schedule schedule = BasicAlgorithm.basicAlgorithm(persons,orders);
        for (Purpose helpPurpose : schedule.getAllPurpose()) {
            ResultList.getItems().add(helpPurpose);
        }
        Math.round(getIncomeSchedule())
                + " рубля(ей).");
        System.out.println("Общая пройденная дистанция: " + Math.round(getTotalLength())
                + " метра(ов).");


<<<<<<< HEAD
=======
    public void StressModeToggle(ActionEvent event) {

>>>>>>> dbb21164d189f91e2065fab61147cdcf5b0d8b9d
    }

    public void LightOrder(ActionEvent event) throws Exception {
        int id = 1 + OrderList.getItems().size();
        double xStart = Double.parseDouble(xStartOrder.getText());
        double yStart = Double.parseDouble(yStartOrder.getText());

        double yEnd = Double.parseDouble(yEndOrder.getText());
        double xEnd = Double.parseDouble(xEndOrder.getText());

        Point start = new Point (xStart, yStart);
        Point end = new Point(xEnd,yEnd);

        String time1 = startTimeOrder.getText();
        String time2 = endTimeOrder.getText();
        Time time = new Time(time1,time2);

        double weight = Double.parseDouble(weightOrder.getText());
        Order order = new OrderLight(id, start, end, time,weight);
        orders.add(order);
        OrderList.getItems().add(order.OrderToString());
    }

    public void MediumOrder(ActionEvent event) throws Exception {
        int id = 1 + OrderList.getItems().size();
        double xStart = Double.parseDouble(xStartOrder.getText());
        double yStart = Double.parseDouble(yStartOrder.getText());

        double yEnd = Double.parseDouble(yEndOrder.getText());
        double xEnd = Double.parseDouble(xEndOrder.getText());

        Point start = new Point (xStart, yStart);
        Point end = new Point(xEnd,yEnd);

        String time1 = startTimeOrder.getText();
        String time2 = endTimeOrder.getText();
        Time time = new Time(time1,time2);

        double weight = Double.parseDouble(weightOrder.getText());

        Order order = new OrderMedium(id, start, end, time,weight);
        orders.add(order);
        OrderList.getItems().add(order.OrderToString());
    }

    public void HardOrder(ActionEvent event) throws Exception {
        int id = 1 + OrderList.getItems().size();
        double xStart = Double.parseDouble(xStartOrder.getText());
        double yStart = Double.parseDouble(yStartOrder.getText());

        double yEnd = Double.parseDouble(yEndOrder.getText());
        double xEnd = Double.parseDouble(xEndOrder.getText());

        Point start = new Point (xStart, yStart);
        Point end = new Point(xEnd,yEnd);

        String time1 = startTimeOrder.getText();
        String time2 = endTimeOrder.getText();
        Time time = new Time(time1,time2);

        double weight = Double.parseDouble(weightOrder.getText());

        Order order = new OrderHard(id, start, end, time,weight);
        orders.add(order);
        OrderList.getItems().add(order.OrderToString());
    }

    public void BikeCourier(ActionEvent event) {
        int id = 1 + CourierList.getItems().size();
        String name = nameCourier.getText();
        double speed = Double.parseDouble(speedCourier.getText());
        double x = Double.parseDouble(xCourier.getText());
        double y = Double.parseDouble(yCourier.getText());
        double energy = Double.parseDouble(energyCourier.getText());
        Point point = new Point(x,y);
        Person courier = new CourierBike(id, name, speed, energy,courierTimeStart.getText(),courierTimeEnd.getText(), point);
        persons.add(courier);
        CourierList.getItems().add(courier.PersonToString());
    }

    public void CarCourier(ActionEvent event) {
        int id = 1 + CourierList.getItems().size();
        String name = nameCourier.getText();
        double speed = Double.parseDouble(speedCourier.getText());
        double x = Double.parseDouble(xCourier.getText());
        double y = Double.parseDouble(yCourier.getText());
        double energy = Double.parseDouble(energyCourier.getText());
        Point point = new Point(x,y);
        Person courier = new CourierCar(id, name, speed, energy,courierTimeStart.getText(),courierTimeEnd.getText(), point);
        persons.add(courier);
        CourierList.getItems().add(courier.PersonToString());
    }

    public void PeopleCourier(ActionEvent event) {
        int id = 1 + CourierList.getItems().size();
        String name = nameCourier.getText();
        double speed = Double.parseDouble(speedCourier.getText());
        double x = Double.parseDouble(xCourier.getText());
        double y = Double.parseDouble(yCourier.getText());
        double energy = Double.parseDouble(energyCourier.getText());
        Point point = new Point(x,y);
        Person courier = new CourierPeople(id, name, speed, energy,courierTimeStart.getText(),courierTimeEnd.getText(), point);
        persons.add(courier);
        CourierList.getItems().add(courier.PersonToString());
    }

    public void ClearCourierList(ActionEvent event) {
        CourierList.getItems().clear();
        persons.clear();
    }

    public void ClearOrderList(ActionEvent event) {
        OrderList.getItems().clear();
        orders.clear();
    }


}
