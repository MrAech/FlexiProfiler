package com.aech.flexiprofiler.ui;

import javafx.fxml.FXML;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.Button;

import java.io.File;

import org.kordamp.ikonli.javafx.FontIcon;

public class DashboardController {

    @FXML
    private VBox datasetCard;
    @FXML
    private VBox dropZone;
    @FXML
    private FontIcon uploadIcon;
    @FXML
    private Label dropLabel;
    @FXML
    private Label hintLabel;
    @FXML
    private Button uploadButton;
    @FXML
    private Label csvBadge;
    @FXML
    private Label jsonBadge;

    // TODO: we are only focusing on Ui for now will add all the events and
    // TODO: functionalities later
    @FXML
    private void initialize() {
        // No-op for now: UI only, no file logic
    }

    @FXML
    private void onChooseFile() {
        FileChooser chooser = new FileChooser();
        chooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("Data Files", "*.csv", "*.json"),
                new FileChooser.ExtensionFilter("CSV Files", "*.csv"),
                new FileChooser.ExtensionFilter("JSON Files", "*.json")
        );

        Stage stage = (Stage) uploadButton.getScene().getWindow();
        File selected = chooser.showOpenDialog(stage);
        if (selected != null) {
            System.out.println("Selected file: " + selected.getAbsolutePath());
            // TODO: pass file to your import logic
        }
    }
}

