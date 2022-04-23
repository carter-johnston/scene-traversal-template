package com.example.testapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class HomeController {
    Parent parent;
    Scene scene;
    Stage stage;
    @FXML
    private Label welcomeText;

    @FXML
    protected void onCampaignButtonClick() {
        welcomeText.setText("The Story Starts here!");
    }

    @FXML
    void redirectHandler(ActionEvent buttonEvent) throws IOException {
        String id = ((Node) buttonEvent.getSource()).getId();
        System.out.println(id+".fxml");
        parent = FXMLLoader.load(getClass().getResource(id+".fxml"));
        stage = (Stage)((Node) buttonEvent.getSource()).getScene().getWindow();
        scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }
}
