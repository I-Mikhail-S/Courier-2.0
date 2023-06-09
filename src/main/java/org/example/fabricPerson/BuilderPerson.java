package org.example.fabricPerson;

import org.example.ID.ID;
import org.example.checkCourier.CheckCourier;
import org.example.checkCourier.ICheckCourier;
import org.example.courier.CourierBike;
import org.example.courier.CourierCar;
import org.example.courier.CourierPeople;
import org.example.enumType.EnumCourier;
import org.example.abstractPerson.Person;
import org.example.point.Point;

public class BuilderPerson {

    Person person;

    public BuilderPerson(EnumCourier type) throws Exception {
        person = new Factory().getNewCourier(type);
    }

    public BuilderPerson energy(double energy) {
        person.setEnergy(energy);
        return this;
    }

    public BuilderPerson name(String name) {
        person.setName(name);
        return this;
    }

    public BuilderPerson id(ID id) {
        person.setId(id);
        return this;
    }

    public BuilderPerson speed(double speed) {
        person.setSpeed(speed);
        return this;
    }
    public BuilderPerson isFree(boolean free){
        person.setSetIsFree(free);
        return this;
    }
    public Person build() {
        return person;
    }


    private class Factory {

        Person getNewCourier(EnumCourier enumCourier) throws Exception {
            Person person = null;
            ICheckCourier checkCourier = new CheckCourier();
            switch (enumCourier) {
                case CAR:
                    person = new CourierCar();
                    if(checkCourier.checkCarCourier(person)) throw new Exception("Не коректные данные!");
                    break;
                case BIKE:
                    person = new CourierBike();
                    if(checkCourier.checkBikeCourier(person)) throw new Exception("Не коректные данные");
                    break;
                case PEOPLE:
                    person = new CourierPeople();
                    if(checkCourier.checkPeopleCourier(person)) throw new Exception("Не коректные данные");
                    break;
                default:
                    throw new Exception("Не коректные данные!");
            }
            return person;
        }
        Person getNewCourier(ID id, String name, double speed, double energy, Point location, EnumCourier enumCourier) throws Exception {
            Person person = null;
            ICheckCourier checkCourier = new CheckCourier();
            switch (enumCourier) {
                case CAR:
                    person = new CourierCar(id,name,speed,energy,location);
                    if(checkCourier.checkCarCourier(person)) throw new Exception("Не коректные данные");
                    break;
                case BIKE:
                    person = new CourierBike(id,name,speed,energy,location);
                    if(checkCourier.checkBikeCourier(person)) throw new Exception("Не коректные данные");
                    break;
                case PEOPLE:
                    person = new CourierPeople(id,name,speed,energy,location);
                    if(checkCourier.checkPeopleCourier(person)) throw new Exception("Не коректные данные");
                    break;
                default:
                    throw new Exception("Не коректные данные!");
            }
            return person;
        }
    }
}
