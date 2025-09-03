package com.aech.flexiprofiler;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainWindow extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/com/aech/flexiprofiler/fxmls/Dashboard.fxml"));
        Scene scene = new Scene(root, 1280, 780);
//        scene.getStylesheets().add(getClass().getResource("/com/aech/flexiprofiler/styles/dashboard.css").toExternalForm());
        primaryStage.setTitle("FlexiProfile — Dataset Import Dashboard");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}