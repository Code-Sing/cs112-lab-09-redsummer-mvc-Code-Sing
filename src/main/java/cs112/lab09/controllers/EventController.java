package cs112.lab09.controllers;

import cs112.lab09.MainApplication;
import cs112.lab09.models.RevisedHistoricalEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;


public class EventController {

    private RevisedHistoricalEvent redSummerEvent;
    private String location;

    protected void initData(RevisedHistoricalEvent redSummerEvent, String location, String imageUrl) {
        this.location = location;
        this.redSummerEvent = redSummerEvent;

        locationLabel.setText(location);
        dateLabel.setText(this.redSummerEvent.getEventDay().toString());
        descriptionLabel.setText(this.redSummerEvent.getDescription());
        revisedDescriptionLabel.setText(this.redSummerEvent.getRevisedDescription());
        eventViewImage.setImage(new Image(getClass().getResourceAsStream(imageUrl)));

    }


    @FXML
    private Button closeButton;
    @FXML
    private Label locationLabel;
    @FXML
    private Label dateLabel;
    @FXML
    private Label descriptionLabel;
    @FXML
    private Label revisedDescriptionLabel;
    @FXML
    private Hyperlink sourceHyperLink;
    @FXML
    private ImageView eventViewImage;

    @FXML
    protected void onCloseButtonClick() {
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();
    }

    @FXML
    protected void onCitationHyperlinkClick() {
        if(Desktop.isDesktopSupported()) {
            try{
                Desktop.getDesktop().browse(new URI(redSummerEvent.getCitation()));
            }catch(IOException | URISyntaxException e) {
                e.printStackTrace();
            }
        }else {
            System.out.println("Desktop is not supported");
        }
    }
}
