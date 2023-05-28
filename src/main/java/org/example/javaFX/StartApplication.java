package org.example.javaFX;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import org.example.javaFX.MainController;
public class StartApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {

        FXMLLoader start_loader = new FXMLLoader(StartApplication.class.getResource("/screens/MainScreen.fxml"));

        Scene start = new Scene(start_loader.load());



        stage.setTitle("Title");
        stage.setScene(start);
        stage.show();

    }

    public static void application() {
        launch();
    }

    /*

    * order list - иконку, где будут отображаться все заказы... (так же с courier list)

    * у курьеров должны быть айди

    * со временем только три фиксировааных отрезка времени

    * /---
    * веб сервис
    * /---


    */
}







