package com.example.cashingupprogram;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Scene.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Cashing Up");

        stage.getIcons().add(new Image(getClass().getResourceAsStream("CashRegister.png")));


        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}