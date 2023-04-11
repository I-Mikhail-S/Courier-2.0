package org.example.main;

import org.example.ID.ID;
import org.example.ID.PersonID;
import org.example.abstractPerson.Person;
import org.example.courier.CourierBike;
import org.example.enumType.EnumCourier;
import org.example.fabricPerson.BuilderPerson;
import org.example.graph.Graph;
import org.example.workwithdata.SaveDataToBD;

import java.util.ArrayList;
import java.util.Random;
import java.util.UUID;

public class Main {
    public static void main(String[] args) throws Exception {

        ID idPerson = new PersonID();
        System.out.println(idPerson.nextString());
    }
}