package com.javafxtest.app.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

public class Controller {

    @FXML
    private Button btnatt;

    @FXML
    private Pane pane1;

    @FXML
    private Pane pane10;

    @FXML
    private Pane pane11;

    @FXML
    private Pane pane12;

    @FXML
    private Pane pane13;

    @FXML
    private Pane pane14;

    @FXML
    private Pane pane15;

    @FXML
    private Pane pane16;

    @FXML
    private Pane pane17;

    @FXML
    private Pane pane18;

    @FXML
    private Pane pane2;

    @FXML
    private Pane pane3;

    @FXML
    private Pane pane4;

    @FXML
    private Pane pane5;

    @FXML
    private Pane pane6;

    @FXML
    private Pane pane7;

    @FXML
    private Pane pane8;

    @FXML
    private Pane pane9;

    @FXML
    void attAction(ActionEvent event) {
        System.out.println("botao");
    }

    @FXML
    void pane1Action(MouseEvent event) {
        attCor(pane1);
    }

    @FXML
    void pane2Action(MouseEvent event) {
        attCor(pane2);
    }

    @FXML
    void pane3Action(MouseEvent event) {
        attCor(pane3);
    }

    private void attCor(Pane p) {
        switch (p.getStyle()) {
            case "-fx-background-color: red;":
                p.setStyle("-fx-background-color: blue;");
                break;
            case "-fx-background-color: blue;":
                p.setStyle("-fx-background-color: black;");
                break;
            case "-fx-background-color: black;":
                p.setStyle("-fx-background-color: null;");
                break;
            default:
                p.setStyle("-fx-background-color: red;");
                break;
        }
    }
}
