package com.example.fx1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.IOException;

public class main5 extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        HBox hBox = new HBox();
        hBox.getChildren().addAll(new Button("one"),new Button("two"));
        hBox.setSpacing(5);
        hBox.setPadding(new Insets(5));

        Group root = new Group();
        Scene scene = new Scene(root, 320, 240);
        root.getChildren().addAll(hBox);
        stage.setTitle("Hello World!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}