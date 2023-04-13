package com.example.fx1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class main8 extends Application {
    public static void main(String[] args)
    {launch();}

    @Override
    public void start(Stage stage) throws IOException {

        Button button = new Button("press");
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("action");
            }
        });
        button.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle (ActionEvent event) {
                System.out.println("Event");
            }
        });
            Group root = new Group();
            root.getChildren().addAll(button);
            stage.setScene(new Scene(root, 500, 500));
            stage.show();
        }
    }