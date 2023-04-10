package org.example.checkCourier;

import org.example.abstractPerson.Person;

public interface ICheckCourier {
    boolean  checkCarCourier(Person person) throws Exception;
    boolean checkPeopleCourier(Person person) throws Exception;
    boolean checkBikeCourier(Person person) throws Exception;
}
