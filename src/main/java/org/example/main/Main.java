package org.example.main;

<<<<<<< HEAD
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime lt = LocalTime.parse("14:10");
        System.out.println(df.format(lt.plusMinutes(10)));
=======
import static org.example.javaFX.StartApplication.application;

public class Main{

    public static void main(String[] args) {

    application();

>>>>>>> 6c5a48870c988577c65e0a4aa0fa19aff6fa867f
    }

}