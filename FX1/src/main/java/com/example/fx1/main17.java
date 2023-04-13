package com.example.fx1;

import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Cylinder;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;

import java.io.IOException;

public class main17 extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        Camera camera = new PerspectiveCamera(true);
        camera.setFarClip(50000.0);
        camera.setTranslateZ(-1000);

        Cylinder cylinder = new Cylinder(100,500);
        PhongMaterial blueMaterial = new PhongMaterial();
        blueMaterial.setDiffuseColor(Color.DARKBLUE);
        blueMaterial.setSpecularColor(Color.BLUE);
        cylinder.setMaterial(blueMaterial);

        cylinder.setRotationAxis(Rotate.X_AXIS);
        cylinder.setRotate(45);


        Group group = new Group();
        Scene scene = new Scene(group, 400, 300);
        group.getChildren().add(cylinder);
        scene.setFill(Color.BLACK);
        scene.setCamera(camera);

        scene.setOnMouseClicked(event -> {
            Node picked = event.getPickResult().getIntersectedNode();
            if(null != picked) {
                double scalar = 2;
                if (picked.getScaleX() > 1)
                    scalar = 1;
                picked.setScaleX(scalar);
                picked.setScaleY(scalar);
                picked.setScaleZ(scalar);
            }
                });

        stage.setTitle("3D");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}