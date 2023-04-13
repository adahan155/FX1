package com.example.fx1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class main11 extends Application {
    public static void main(String[] args) {
        launch();

    }

    @Override
    public void start(Stage stage) throws IOException {
        Group group = new Group();

        Parent content = FXMLLoader.load(getClass().getResource("myDocument.fxml"));
        BorderPane root = new BorderPane();
        root.setCenter(content);
        group.getChildren().addAll(root);

        Scene scene = new Scene(group, 400, 300);
        stage.setScene(scene);
        stage.setTitle("Hello World!");
        stage.show();
    }
    }