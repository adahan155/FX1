package com.example.fx1;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Orientation;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import java.io.IOException;

public class main6 extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        Group root = new Group();
        Scene scene = new Scene(root, 800, 600);

        stage.setTitle("Hello World!");
        stage.setScene(scene);
        stage.show();

        FlowPane flowPane = new FlowPane();
        flowPane.getChildren().add(new Label("label"));
        flowPane.getChildren().add(new Button("button"));

        ///radiobutton
        ToggleGroup group = new ToggleGroup();
        RadioButton rb1 = new RadioButton("one");
        rb1.setToggleGroup(group);
        rb1.setSelected(true);
        RadioButton rb2 = new RadioButton("two");
        rb2.setToggleGroup(group);
        RadioButton rb3 = new RadioButton("three");
        rb3.setToggleGroup(group);
        flowPane.getChildren().addAll(rb1,rb2,rb3);

        flowPane.getChildren().add(new ToggleButton("Toggle"));
        flowPane.getChildren().add(new CheckBox("Toggle"));
        flowPane.getChildren().add(new ChoiceBox<String>(FXCollections.observableArrayList("First", "Second","Third")));
        flowPane.getChildren().add(new TextField("Text Field"));
        flowPane.getChildren().add(new PasswordField());

        ScrollBar sc = new ScrollBar();
        sc.setMin(0);
        sc.setMax(100);
        sc.setValue(50);
        flowPane.getChildren().add(sc);

        ListView<String> list = new ListView<String>();
        ObservableList<String> items = FXCollections.observableArrayList("Single", "Double", "Suite", "Family app");
        list.setItems(items);
        list.setMaxHeight(100);
        flowPane.getChildren().add(list);

        TreeItem<String> rootItem = new TreeItem<String>("Inbox");
        rootItem.setExpanded(true);
        for (int i = 1; i < 6; i++ ) {
          TreeItem<String> item = new TreeItem<>("Message" + i);
          rootItem.getChildren().add(item);
        }
        TreeView<String> tree = new TreeView<String>(rootItem);
        tree.setMaxHeight(100);
        flowPane.getChildren().add(tree);

        ObservableList<String> options =
                FXCollections.observableArrayList(
                  "Option 1",
                  "Option 2",
                  "Option 3"
                );
        ComboBox comboBox = new ComboBox(options);
        flowPane.getChildren().add(comboBox);

        Separator separator = new Separator();
        separator.setOrientation(Orientation.VERTICAL);
        flowPane.getChildren().add(separator);

        Slider slider = new Slider();
        slider.setMin(0);
        slider.setMax(120);
        slider.setValue(40);
        slider.setShowTickLabels(true);
        slider.setShowTickMarks(true);
        slider.setMajorTickUnit(50);
        slider.setMinorTickCount(5);
        slider.setBlockIncrement(10);
        flowPane.getChildren().add(slider);

        ProgressBar pb = new ProgressBar(0.5);
        ProgressIndicator p1 = new ProgressIndicator(0.5);
        flowPane.getChildren().add(pb);
        flowPane.getChildren().add(p1);

        root.getChildren().addAll(rb1);
        root.getChildren().addAll(rb2);
        root.getChildren().addAll(rb3);
        root.getChildren().addAll(slider);
        root.getChildren().addAll(comboBox);



    }

    public static void main(String[] args) {
        launch();
   }
}