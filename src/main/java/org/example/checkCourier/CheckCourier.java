package org.example.checkCourier;

import org.example.abstractPerson.Person;

public class CheckCourier implements ICheckCourier{

    @Override
    public boolean checkCarCourier(Person person) throws Exception {
        if((person.getSpeed()>0.0&&person.getSpeed()<60.0)&&(person.getEnergy()>0.0&&person.getEnergy()<10.0)){
            return true;
        }
        return false;
    }

    @Override
    public boolean checkPeopleCourier(Person person) throws Exception {
        if((person.getSpeed()>0.0&&person.getSpeed()<10.0)&&(person.getEnergy()>0.0&&person.getEnergy()<3.0)){
            return true;
        }
        return false;
    }

    @Override
    public boolean checkBikeCourier(Person person) throws Exception {
        if((person.getSpeed()>0.0&&person.getSpeed()<20.0)&&(person.getEnergy()>0.0&&person.getEnergy()<5.0)){
            return true;
        }
        return false;
    }
}
