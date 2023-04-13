package com.example.fx1;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class main7  extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        NumberTextField numberTextField = new NumberTextField();

        Group root = new Group();
        root.getChildren().addAll(numberTextField);
        primaryStage.setScene(new Scene(root, 500 , 500));
        primaryStage.show();
    }
    public static void main (String[] args) {launch();}
}
