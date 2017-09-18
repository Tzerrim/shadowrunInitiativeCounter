package com.nox.ui.gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class starter extends Application {

    public  void  start () {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("mgp/mgp.fxml"));
        Scene scene = new Scene(root, 400, 600);
        stage.setTitle("Shadowrun 5-ed Initiative counter");
        stage.setScene(scene);
        stage.show();
    }

}
