package com.example.fx1;

import javafx.application.Application;
import javafx.concurrent.Service;
import javafx.concurrent.Task;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.security.Provider;

public class main19 extends Application {

    public static void main(String[] args)
    {launch();}


    @Override
    public void start(Stage stage) throws IOException {
        Myservice myservice = new Myservice();
        myservice.start();
        Group group = new Group();
        Scene scene = new Scene(group, 320, 240);
        stage.setTitle("Concurency");
        stage.setScene(scene);
        stage.show();
    }
    static class Myservice extends Service<String> {
        @Override
        protected Task<String> createTask(){
            return  new Task<String>() {
                @Override
                protected String call() throws Exception {
                    return "Concurency";
                }
            };
        }


    }
}