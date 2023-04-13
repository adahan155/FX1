package com.example.fx1;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

import java.io.IOException;

public class main2 extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        Line line = new Line(0 , 0 , 100 , 100);
        line.setStroke(Color.GREEN);

        Group root = new Group();
        Scene scene = new Scene(root, 320, 240);

        stage.setTitle("Hello World!");
        root.getChildren().add(line);

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
