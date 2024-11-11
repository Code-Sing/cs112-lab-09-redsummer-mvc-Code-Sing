package cs112.lab09.controllers;

import cs112.lab09.MainApplication;
import cs112.lab09.models.Date;
import cs112.lab09.models.RevisedHistoricalEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class MapController {

    @FXML
    private Button sanFranciscoButton;
    @FXML
    private Button bizbeeButton;

    @FXML
    protected void onSanFranciscoButtonClick() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(MainApplication.class.getResource("/event-view.fxml"));
        Parent eventView = loader.load();
        Scene eventViewScene = new Scene(eventView);
        Stage sanFranciscoStage = new Stage();
        sanFranciscoStage.setTitle("Revisionist History Map");
        sanFranciscoStage.initModality(Modality.APPLICATION_MODAL);
        sanFranciscoStage.setScene(eventViewScene);
        sanFranciscoStage.show();

        EventController eventController = loader.getController();
        eventController.initData(new RevisedHistoricalEvent("a minor riot between Black and White soldiers " +
                "occurred in the Presidio in San Francisco",
                        new Date(5,15,1919),
                "a minor riot between Black and White soldiers occurred in the Presidio in San " +
                        "Francisco after a dispute about a Thai soldier who was moved from the \"colored quarters\" to " +
                        "the white military housing. Despite defending our country, housing for Black soldiers was " +
                        "not only segregated but often inferior. Black soldiers also faced increased attacks and other " +
                        "forms of discrimination upon returning home.",
                "https://cdr.lib.unc.edu/downloads/1c18dm56n?locale=en"),
                "San Francisco, CA",
                "/images/sanfrancisco.jpg");

    }

    @FXML
    protected void onBizbeeButtonClick() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(MainApplication.class.getResource("/event-view.fxml"));
        Parent eventView = loader.load();
        Scene eventViewScene = new Scene(eventView);
        Stage bizbeeStage = new Stage();
        bizbeeStage.setTitle("Revisionist History Map");
        bizbeeStage.initModality(Modality.APPLICATION_MODAL);
        bizbeeStage.setScene(eventViewScene);
        bizbeeStage.show();

        EventController eventController = loader.getController();
        eventController.initData(new RevisedHistoricalEvent("Local police in Bisbee, Arizona attacked the " +
                        "10th U.S. Cavalry, an Aftican-American unit known as the \"Buffalo Soldier,\" formed in 1866."
                ,new Date(7,13,1919)
                , "Although sources are limited, the attack occurred on the eve of celebrations meant " +
                        "to honor returning soldiers (like in Norfolk, Virginia)."
                ,"https://cdr.lib.unc.edu/downloads/1c18dm56n?locale=en")
                , "Bisbee, AZ"
                ,"/images/bisbee.png");
    }
}