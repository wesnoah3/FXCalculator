package com.example.fxcalculator;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class FXCalculator extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        try {
            Parent root = FXMLLoader.load(getClass().getResource("fx-calculator.fxml"));
            Scene scene = new Scene(root);

            primaryStage.setTitle("Calculator");
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
        /*
        StackPane root = new StackPane();
        Scene scene = new Scene(root, 600, 400);
        primaryStage.setTitle("Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
         */
    }
    public static void main (String[] args)
    {
        launch(args);
    }
}
