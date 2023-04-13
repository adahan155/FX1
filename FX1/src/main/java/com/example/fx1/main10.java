package com.example.fx1;

import javafx.animation.FadeTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.FileInputStream;
import java.io.IOException;

public class main10 extends Application {
    public static void main(String[] args) {
        launch();

    }

    @Override
    public void start(Stage stage) throws IOException {
        Image image = new Image(new FileInputStream("C:\\Users\\User\\FX1\\src\\main\\java\\com\\example\\fx1\\gg.jpg"));
        ImageView imageView = new ImageView(image);
        imageView.setFitHeight(500);
        imageView.setFitWidth(500);

        FadeTransition fadeOut = new FadeTransition(Duration.millis(1000),imageView);
        fadeOut.setFromValue(1.0);
        fadeOut.setToValue(0.0);
        fadeOut.setCycleCount(Timeline.INDEFINITE);
        fadeOut.setAutoReverse(true);
        fadeOut.play();


        Group root = new Group();
        root.getChildren().addAll(imageView);
        Scene scene = new Scene(root, 500, 500);
        stage.setScene(scene);
        stage.show();
    }
}