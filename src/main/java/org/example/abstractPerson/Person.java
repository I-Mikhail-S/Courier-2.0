package org.example.abstractPerson;

import org.example.ID.ID;
import org.example.point.Point;
import org.example.pupose.Purpose;
import org.example.schedule.Schedule;

import javax.print.attribute.standard.SheetCollate;
import java.util.Objects;

/**
 * Фундаментальный класс person,основные характерестики:
 * id-уникальный номер,name - Имя курьера, Speed - скорость курьера(м\с),
 * energy - максимальная грузоподъемность курьера(кг), location - местоположение курьера(м),
 * schedule - рассписание курьера
 */
public  class Person {

    private int id;//уникальный номер
    private String name;//Имя
    private double speed;//Скорость
    private double energy;//Грузоподъёмность
    private Point location;//Местоположение

    private boolean setIsFree;

    private Schedule schedule;//Рассписание
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
        this.schedule = new Schedule();
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

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
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


