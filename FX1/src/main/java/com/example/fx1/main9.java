package com.example.fx1;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.PixelReader;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.IOException;

public class main9 extends Application {
    public static void main(String[] args) {
        launch();

    }

    @Override
    public void start(Stage stage) throws IOException {
        Image image = new Image(new FileInputStream("C:\\Users\\User\\FX1\\src\\main\\java\\com\\example\\fx1\\gg.jpg"));
        ImageView imageView = new ImageView(image);
        imageView.setFitHeight(500);
        imageView.setFitWidth(500);

        PixelReader pixelReader = image.getPixelReader();
        for(int i = 0; i< image.getWidth(); i++){
            for (int j = 0; j< image.getHeight(); j++) {
                Color color = pixelReader.getColor(i,j);
            }
        }

        Group root = new Group();
        root.getChildren().addAll(imageView);
        Scene scene = new Scene(root, 500, 500);
        stage.setScene(scene);
        stage.show();
    }
}