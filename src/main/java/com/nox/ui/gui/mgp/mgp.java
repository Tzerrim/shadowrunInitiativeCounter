package com.nox.ui.gui.mgp;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;

public class mgp {
    @FXML    private MenuBar mainMenu;
    @FXML    private TableView tableView;
    @FXML    private MenuBar lowMenu;
    @FXML    private TextArea textArea;

    public void initialize(){
        textArea.setText("Test text");
    }

    @FXML
    private void handleCloseAction(ActionEvent event) {
        System.out.println("exiting");
        System.exit(0);
        Platform.exit();
    }



}
