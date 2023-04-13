package com.example.fx1;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.stage.Stage;

import java.io.IOException;

public class main16 extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        ObservableList<PieChart.Data> data = FXCollections.observableArrayList(
                new PieChart.Data("Grapefruit", 13));
                new PieChart.Data("Oranges", 25);
                new PieChart.Data("Plums", 10);
                new PieChart.Data("Pears", 22);
                new PieChart.Data("Apples", 30);
        PieChart chart = new PieChart(data);
        chart.setTitle("products");

        Group group = new Group();
        Scene scene = new Scene(group, 450, 300);
        group.getChildren().addAll(chart);
        stage.setTitle("Pie Chart");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}