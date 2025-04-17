package cs112.lab09.controllers;

import cs112.lab09.Constants;
import cs112.lab09.RedSummer;
import cs112.lab09.models.RevisedHistoricalEvent;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.event.Event;
import javafx.scene.Scene;

import java.io.IOException;

public class CityController {

    @FXML
    ImageView cityImageView;
    @FXML
    Label dateLabel;
    @FXML
    Label cityLabel;
    @FXML
    Label descriptionLabel;
    @FXML
    Label revisedLabel;
    @FXML
    Hyperlink sourceLink;

    public void handleCloseButton()
    {
        Stage stage = (Stage) cityImageView.getScene().getWindow();
        stage.close();
    }

    public void initData(Constants.Event event)
    {
        String[] data = Constants.HISTORICAL_DATA[event.ordinal()];
        RevisedHistoricalEvent revisedEvent = new RevisedHistoricalEvent(data);
        cityImageView.setImage(revisedEvent.getImage());
        cityLabel.setText(revisedEvent.getLocation());
        dateLabel.setText(revisedEvent.getEventDay().toString());
        descriptionLabel.setText(revisedEvent.getDescription());
        revisedLabel.setText(revisedEvent.getRevisedDescription());
        sourceLink.setText(revisedEvent.getCitation());

    }

}
