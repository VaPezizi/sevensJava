package com.ristiseiska;

import javafx.application.Application;  // sovellus
import javafx.stage.Stage;              // (pää)ikkuna

import javafx.scene.Scene;              // näkymä
import javafx.scene.layout.BorderPane;  // asettelu
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.geometry.HPos;

import javafx.geometry.Insets;
import javafx.geometry.Orientation;

import javafx.scene.control.Label;      // komponentti (teksti)
import javafx.scene.control.Button;     // komponentti (painike)

import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;

public class javaFx extends Application{
    // d
    //private Noppa n1;

    @Override
    public void start(Stage ikkuna) {
        Label otsikkoLabel = new Label("Ristiseiska");

        BorderPane Asettelu = new BorderPane();

        Asettelu.setPadding(new Insets(5));
        Asettelu.setTop(otsikkoLabel);

        Scene view = new Scene(Asettelu, 1280, 720);

        ikkuna.setScene(view);
        ikkuna.setTitle("Ristiseiska");

        ikkuna.show();
    }


    //public static void main(String[] args) {
        //launch(JavaFxNoppa.class, args);
    //}
}