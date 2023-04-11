package org.example.graph;

import org.example.ID.ID;
import org.example.abstractOrder.Order;
import org.example.abstractPerson.Person;

public class Vertex2<T> {
        public ID label; // Метка (например, 'A')
        public static boolean isInTree;
        // -------------------------------------------------------------
        public Vertex2(T lab) // Конструктор
        {
            Person person = null;
            Order order = null;
            if(lab instanceof  Person){
                person = (Person)lab;
                label = person.getId();
                isInTree = false;
            }

        }
        public static<T> void typeObject(T lab){
        }
// -------------------------------------------------------------
    } // Конец класса Vertex