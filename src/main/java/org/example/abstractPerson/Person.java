package org.example.abstractPerson;

import org.example.ID.ID;
import org.example.point.Point;

import java.util.Objects;

/**
 * Фундаментальный класс person....
 */
public  class Person {

    private int id;
    private String name;
    private double speed;
    private double energy;
    private Point location;

    private boolean setIsFree;
    public boolean getIsFree() {
        return setIsFree;
    }
    public void setSetIsFree(boolean setIsFree) {
        this.setIsFree = setIsFree;
    }
    // setIsFree why?

    public Person() {}

    public Person(int id, String name, double speed, double energy, Point location) {
        this.id = id;
        this.name = name;
        this.speed = speed;
        this.energy = energy;
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getEnergy() {
        return energy;
    }

    public void setEnergy(double energy) {
        this.energy = energy;
    }

    public Point getLocation() {
        return location;
    }

    public void setLocation(Point location) {
        this.location = location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Double.compare(person.speed, speed) == 0 && Objects.equals(location, person.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, speed, location);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", speed=" + speed +
                ", energy=" + energy +
                ", location=" + location +
                '}';
    }
}


