package org.example.javaFX;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import org.example.abstractOrder.Order;
import org.example.abstractPerson.Person;
import org.example.dividingTheQueue.FirstSchedule;
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

    List<Order> orders = new ArrayList<>();
    List<Person> persons = new ArrayList();

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

        Person courier = new Person(id, name, speed, energy, point);

        persons.add(courier);
        CourierList.getItems().add(courier.PersonToString());

    }

    public void StartApplication(ActionEvent event) {

        ResultList.getItems().clear();

        Schedule schedule = FirstSchedule.firstSchedule(orders, persons);
        for (Purpose helpPurpose : schedule.getAllPurpose()) {
            ResultList.getItems().add(helpPurpose);
        }
    }

    public void StressModeToggle(ActionEvent event) {
    }

    public void LightOrder(ActionEvent event) {
    }

    public void MediumOrder(ActionEvent event) {
    }

    public void HardOrder(ActionEvent event) {
    }

    public void BikeCourier(ActionEvent event) {
    }

    public void CarCourier(ActionEvent event) {
    }

    public void PeopleCourier(ActionEvent event) {
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
