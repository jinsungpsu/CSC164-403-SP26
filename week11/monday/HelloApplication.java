package com.example.csc164_firstjavafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);

        // how do I add a button?
        // could be done in FXML

        // could be done using java

        Button button1 = new Button();

        stage.setTitle("Hello!");

        stage.setScene(scene);
        stage.show();

        Stage anotherWindow = new Stage();

        FXMLLoader fxmlLoader2 = new FXMLLoader(HelloApplication.class.getResource("chair-storeFront.fxml"));
        Scene scene2 = new Scene(fxmlLoader2.load(), 800, 600);

        anotherWindow.setScene(scene2);

        anotherWindow.setTitle("Another window!");
        anotherWindow.show();


    }

    public static void main(String[] args) {
        launch();
    }
}