package org.sla;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.image.ImageView;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;

import java.io.File;


public class Main extends Application {

    public static void main(String[] args) {
        Application.launch(args);

        // write your code here
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Hi, Jack here");

        Label label = new Label("urggg");
        Label label1 = new Label("this sucks");
        Button button = new Button("jv4");
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                button.setText("but you still suck");

            }
        });

        File file = new File("cat friend Natsu copy.png");
        Image imagenatsu = new Image(file.toURI().toString());
        ImageView imageV = new ImageView(imagenatsu);
        imageV.setFitWidth(300);
        imageV.setFitHeight(300);

        File file1 = new File("greatball copy.png");
        Image imagegball = new Image(file1.toURI().toString());

        File file2 = new File("masterball copy.png");
        Image imagemball = new Image(file2.toURI().toString());

        File file3 = new File("pokeball copy.png");
        Image imagepball = new Image(file3.toURI().toString());

        File file4 = new File("Ultraball copy.png");
        Image imageuball = new Image(file4.toURI().toString());

        ChoiceBox choiceBox = new ChoiceBox();
        choiceBox.getItems().add("Image 1");
        choiceBox.getItems().add("Image 2");
        choiceBox.getItems().add("Image 3");
        choiceBox.getItems().add("Image 4");
        choiceBox.getItems().add("Image 5");
        choiceBox.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if (choiceBox.getValue().toString().equalsIgnoreCase("Image 1")) {
                    imageV.setImage(imagenatsu);

                }
                if (choiceBox.getValue().toString().equalsIgnoreCase("Image 2")) {
                    imageV.setImage(imagepball);

                }
                if (choiceBox.getValue().toString().equalsIgnoreCase("Image 3")){
                    imageV.setImage(imagegball);

                }
                if (choiceBox.getValue().toString().equalsIgnoreCase("Image 4")) {
                    imageV.setImage(imageuball);

                }
                if (choiceBox.getValue().toString().equalsIgnoreCase("Image 5")) {
                    imageV.setImage(imagemball);

                }
            }
        });

        ToggleButton toggleButton1 = new ToggleButton("Image 1");
        ToggleButton toggleButton2 = new ToggleButton("Image 2");
        ToggleButton toggleButton3 = new ToggleButton("Image 3");
        ToggleButton toggleButton4 = new ToggleButton("Image 4");
        ToggleButton toggleButton5 = new ToggleButton("Image 5");

        ToggleGroup toggleGroup = new ToggleGroup();

        toggleButton1.setToggleGroup(toggleGroup);
        toggleButton2.setToggleGroup(toggleGroup);
        toggleButton3.setToggleGroup(toggleGroup);
        toggleButton4.setToggleGroup(toggleGroup);
        toggleButton5.setToggleGroup(toggleGroup);

        toggleButton1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                
            }
        });
        toggleButton2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

            }
        });
        toggleButton3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

            }
        });
        toggleButton4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

            }
        });
        toggleButton5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

            }
        });


        HBox hbox = new HBox();
        hbox.getChildren().add(label);
        hbox.getChildren().add(button);
        hbox.getChildren().add(imageV);
        hbox.getChildren().add(choiceBox);
        hbox.getChildren().addAll(toggleButton1, toggleButton2, toggleButton3, toggleButton4, toggleButton5);

        Scene scene = new Scene(hbox, 1400, 1000);
        stage.setScene(scene);
        stage.show();




    }

}
