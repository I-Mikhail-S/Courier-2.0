package org.example.courier;

import org.example.ID.ID;
import org.example.abstractPerson.Person;
import org.example.point.Point;

public class CourierCar extends Person {
    private ID id;
    private String name;
    private double speed;
    private double energy;
    private boolean free;
    private Point location;

    public CourierCar() {
        super();
    }

    public CourierCar(ID id, String name,double speed,double energy, Point location) {
        super(id, name,speed,energy, location);
    }

    @Override
    public ID getId() {
        return id;
    }

    @Override
    public void setId(ID id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double getSpeed() {
        return speed;
    }

    @Override
    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public double getEnergy() {
        return energy;
    }

    @Override
    public void setEnergy(double energy) {
        this.energy = energy;
    }

    @Override
    public Point getLocation() {
        return location;
    }

    @Override
    public void setLocation(Point location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "CourierCar{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", speed=" + getSpeed() +
                ", energy=" + getEnergy() +
                ", free=" + getIsFree() +
                '}';
    }
}
