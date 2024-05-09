package com.ristiseiska;

import javafx.application.Application;  // sovellus
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;              // (pää)ikkuna

import javafx.scene.Scene;              // näkymä
import javafx.scene.layout.BorderPane;  // asettelu

import javafx.geometry.Insets;
import javafx.scene.control.Label;      // komponentti (teksti)


public class javaFx extends Application{
    // d
    //private Noppa n1;

    @Override
    public void start(Stage ikkuna) {

        //Creating a deck for the game


        Label otsikkoLabel = new Label("Ristiseiska");

        BorderPane Asettelu = new BorderPane();

        Button kortti1 = new Button("kortti 1");
        Button kortti2 = new Button("kortti 2");
        Button kortti3 = new Button("kortti 3");
        Button kortti4 = new Button("kortti 4");


        HBox kortitHbox = new HBox();
        kortitHbox.setPadding(new Insets(10));
        kortitHbox.setSpacing(10);
        kortitHbox.setAlignment(Pos.CENTER);
        kortitHbox.getChildren().addAll(kortti1, kortti2, kortti3, kortti4);


        Asettelu.setPadding(new Insets(5));
        Asettelu.setTop(otsikkoLabel);
        Asettelu.setCenter(kortitHbox);
        Scene view = new Scene(Asettelu, 1280, 720);

        ikkuna.setScene(view);
        ikkuna.setTitle("Ristiseiska");

        ikkuna.show();
    }


    //public static void main(String[] args) {
        //launch(JavaFxNoppa.class, args);
    //}
}