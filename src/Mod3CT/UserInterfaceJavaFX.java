package Mod3CT;
//Comment to fix GIT

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class UserInterfaceJavaFX extends Application {

    private TextArea textArea;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("JavaFX Menu Example");

        // Create a VBox layout for the main scene
        VBox vbox = new VBox();

        // Create a MenuBar with four menu items
        MenuBar menuBar = new MenuBar();
        Menu menu = new Menu("Options");

        // Menu Item 1: Show Date and Time
        MenuItem showDateTime = new MenuItem("Show Date and Time");
        showDateTime.setOnAction(e -> showDateTime());

        // Menu Item 2: Write to log.txt
        MenuItem writeToLogFile = new MenuItem("Write to log.txt");
        writeToLogFile.setOnAction(e -> writeToLogFile());

        // Menu Item 3: Change Background Color
        MenuItem changeBackgroundColor = new MenuItem("Change Background Color");
        changeBackgroundColor.setOnAction(e -> changeBackgroundColor());

        // Menu Item 4: Exit
        MenuItem exit = new MenuItem("Exit");
        exit.setOnAction(e -> primaryStage.close());

        menu.getItems().addAll(showDateTime, writeToLogFile, changeBackgroundColor, exit);
        menuBar.getMenus().add(menu);

        // Create a TextArea to display information
        textArea = new TextArea();
        textArea.setPrefHeight(300);

        // Add the MenuBar and TextArea to the VBox
        vbox.getChildren().addAll(menuBar, textArea);

        // Create the main scene
        Scene scene = new Scene(vbox, 400, 300);
        primaryStage.setScene(scene);

        // Show the stage
        primaryStage.show();
    }

    private void showDateTime() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        textArea.appendText(dateFormat.format(date) + "\n");
    }

    private void writeToLogFile() {
        try (FileWriter writer = new FileWriter("log.txt", true)) {
            writer.write(textArea.getText());
            writer.write("\n");
            writer.close();
            textArea.appendText("Contents written to log.txt\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void changeBackgroundColor() {
        Random random = new Random();
        double hue = 120 + random.nextDouble() * 60; // Random hue value between 120 and 180 (green range)
        Color color = Color.hsb(hue, 1.0, 1.0);
        textArea.setStyle("-fx-control-inner-background: #" + color.toString().substring(2) + ";");
    }
}
