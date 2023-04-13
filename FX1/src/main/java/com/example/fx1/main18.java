package com.example.fx1;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class main18 extends Application {

    @Override
    public void start(Stage stage) throws IOException {

        List<String> list = new ArrayList<>();

        ObservableList<String> observableList = FXCollections.observableList(list);
        observableList.addListener(new ListChangeListener<String>() {
            @Override
            public void onChanged(Change<? extends String> change) {
                System.out.println("list was changed");
            }
        });
        observableList.addAll("one");
        list.add("two");
        System.out.println(list.size());
        System.out.println(observableList.size());
    }
}
