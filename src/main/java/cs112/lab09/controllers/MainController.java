package cs112.lab09.controllers;

import cs112.lab09.MainApplication;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class MainController {
    @FXML
    private Label appTitle;
    @FXML
    private Label appSubTitle;
    @FXML
    private Label appDescription;
    @FXML
    private Button startButton;
    @FXML
    private Button quitButton;

    @FXML
    protected void onStartButtonClick() throws IOException {
        Stage stage = (Stage) startButton.getScene().getWindow();
        Parent mapView = FXMLLoader.load(getClass().getResource("/map-view.fxml"));
        Scene mapScene = new Scene(mapView);
        stage.setScene(mapScene);
    }

    @FXML
    protected void onQuitButtonClick() throws IOException {
        Stage stage = (Stage) quitButton.getScene().getWindow();
        stage.close();
    }
}