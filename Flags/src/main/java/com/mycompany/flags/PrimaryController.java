package com.mycompany.flags;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class PrimaryController {
        @FXML
    private Label label;
    
    @FXML
    private Button ANGOLA;

    @FXML
    private Button BOTSWANA;

    @FXML
    private Button CLEAR;

    @FXML
    private Button EGYPT;

    @FXML
    private Button FRANCE;

    @FXML
    private Button ITALY;

    @FXML
    private Button LESOTHO;

    @FXML
    private Rectangle RECTANGLE1;

    @FXML
    private Rectangle RECTANGLE2;

    @FXML
    private Rectangle RECTANGLE3;
    
     @FXML
    private Button EXIT;

    @FXML
    void ANGOLA(ActionEvent event) {
        RECTANGLE1.setFill(Color.DARKBLUE);
        RECTANGLE2.setFill(Color.RED);
        RECTANGLE3.setFill(Color.GREEN);
        label.setText("ANGOLA");

    }

    @FXML
    void BOTSWANA(ActionEvent event) {
         RECTANGLE1.setFill(Color.SKYBLUE);
         RECTANGLE2.setFill(Color.BLACK);
         RECTANGLE3.setFill(Color.SKYBLUE);
          label.setText("BOTSWANA");

    }

    @FXML
    void CLEAR(ActionEvent event) {
         RECTANGLE1.setFill(Color.SKYBLUE);
         RECTANGLE2.setFill(Color.SKYBLUE);
         RECTANGLE3.setFill(Color.SKYBLUE);
         label.setText("");
         
         

    }

    @FXML
    void EGYPT(ActionEvent event) {
         RECTANGLE1.setFill(Color.RED);
         RECTANGLE2.setFill(Color.WHITE);
         RECTANGLE3.setFill(Color.BLACK);
          label.setText("EGYPT");

    }
    
    @FXML
    void EXIT(ActionEvent event) {
        Alert alert=new Alert(AlertType.CONFIRMATION);
        alert.setTitle("EXIT");
        alert.setHeaderText("you are about to exit!");
        alert.setContentText("do you want to save before exiting ?");
        
        if(alert.showAndWait().get()==ButtonType.OK){
            System.out.print("successfully logged out");
            System.exit(0);
        }
        

    }

    @FXML
    void FRANCE(ActionEvent event) {
         RECTANGLE1.setFill(Color.DARKBLUE);
         RECTANGLE2.setFill(Color.WHITE);
         RECTANGLE3.setFill(Color.RED);
          label.setText("FRANCE");

    }

    @FXML
    void ITALY(ActionEvent event) {
         RECTANGLE1.setFill(Color.GREEN);
         RECTANGLE2.setFill(Color.WHITE);
         RECTANGLE3.setFill(Color.RED);
          label.setText("ITALY");

    }

    @FXML
    void LESOTHO(ActionEvent event) {
         RECTANGLE1.setFill(Color.BLUE);
         RECTANGLE2.setFill(Color.WHITE);
         RECTANGLE3.setFill(Color.GREEN);
          label.setText("LESOTHO");

    }

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}
