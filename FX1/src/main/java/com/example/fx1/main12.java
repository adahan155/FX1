package com.example.fx1;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class main12 extends Application {
    public static void main(String[] args) {
        launch();

    }

    @Override
    public void start(Stage stage) throws IOException {
        Button button = new Button("text");
        button.setId("my-button");

        Group root = new Group();
        Scene scene = new Scene(root, 400, 300);
        scene.getStylesheets().add(getClass().getResource("C:\\Users\\User\\FX1\\src\\main\\java\\com\\example\\fx1\\mycss.css").toExternalForm());
        root.getChildren().addAll(button);
        stage.setTitle("Hello World!");
        stage.setScene(scene);
        stage.show();
    }
}