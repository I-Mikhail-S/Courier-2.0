package org.example.courier;

import org.example.ID.ID;
import org.example.abstractPerson.Person;
import org.example.point.Point;

public class CourierPeople extends Person {
    private int id;
    private String name;
    private double speed;
    private double energy;
    private boolean free;
    private Point location;

    public CourierPeople(int id,String name,double speed,double energy, Point location) {
        super(id,name,speed,energy,location);
    }

    public CourierPeople() {
        super();
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

    public void setFree(boolean free) {
        this.free = free;
    }

    public boolean isFree() {
        return free;
    }

    @Override
    public String toString() {
        return "CourierPeople{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", speed=" + speed +
                ", energy=" + energy +
                ", location=" + location +
                '}';
    }

}
