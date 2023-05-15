package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloViewW {
    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    Button startButton;

    @FXML
    public void startButtonPressed(ActionEvent event) throws IOException {
    }
    @FXML
    Button stressButton;

    @FXML
    public void stressButtonPressed(ActionEvent event) throws IOException {
    }
    public void switchToScene1_1(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("orderScreen.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToScene1_2(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("stressScreen.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}