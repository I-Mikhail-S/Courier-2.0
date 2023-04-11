package org.example.abstractPerson;

import org.example.ID.PersonID;
import org.example.enumType.EnumCourier;
import org.example.fabricPerson.BuilderPerson;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void getId() throws Exception {
        Person car = new BuilderPerson(EnumCourier.CAR).id(new PersonID()).build();
        System.out.println(car.toString());
    }
}