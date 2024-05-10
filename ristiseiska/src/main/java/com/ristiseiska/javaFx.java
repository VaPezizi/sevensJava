package com.ristiseiska;

import javafx.application.Application;  // sovellus
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;              // (pää)ikkuna

import javafx.scene.Scene;              // näkymä
import javafx.scene.layout.BorderPane;  // asettelu

import javafx.geometry.Insets;
import javafx.scene.control.Label;      // komponentti (teksti)

import java.util.ArrayList;


public class javaFx extends Application{
    // d
    //private Noppa n1;
    private Game game;
    private Stage ikkuna;

    @Override
    public void start(Stage ikkuna) {
        this.ikkuna = ikkuna;
        //Start of the game setups
        FlowPane startFlowPane = new FlowPane(Orientation.VERTICAL);
        startFlowPane.setPadding(new Insets(10));
        startFlowPane.setHgap(10);
        startFlowPane.setAlignment(Pos.CENTER);

        Label playerCountLable = new Label("Enter the player count (1 - 4)");
        TextField playerCountTextField = new TextField("Terve");
        Button startButton = new Button("Start game");

        Text playerCountStartText = new Text("");

        startFlowPane.getChildren().addAll(playerCountLable, playerCountTextField, startButton, playerCountStartText);

        Label otsikkoLabel = new Label("Ristiseiska");

        BorderPane Asettelu = new BorderPane();

        Asettelu.setPadding(new Insets(5));
        Asettelu.setTop(otsikkoLabel);
        Asettelu.setCenter(startFlowPane);
        Scene view = new Scene(Asettelu, 1280, 720);

        ikkuna.setScene(view);
        ikkuna.setTitle("Ristiseiska");

        ikkuna.show();

        startButton.setOnAction(event -> {
            String regex = "\\d+";
            String startButtonTeksti = playerCountTextField.getText();
            if(startButtonTeksti.matches(regex) && Integer.parseInt(startButtonTeksti) <= 4 && Integer.parseInt(startButtonTeksti) > 1) {
                preGameWindow(view, Asettelu, startButtonTeksti);
            }else{
                playerCountStartText.setText("Incorrect input!");
            }
        });
    }
    public void preGameWindow(Scene scene, BorderPane Asettelu, String startButtonTeksti){
        //FlowPane for the player names
        FlowPane playerNameInputs = new FlowPane(Orientation.VERTICAL);
        playerNameInputs.setAlignment(Pos.CENTER);
        playerNameInputs.setVgap(10);
        playerNameInputs.getChildren().addAll(new Text("Player count:" + startButtonTeksti), new Text("Enter player names:"));
        for(int i=0; i < Integer.parseInt(startButtonTeksti);i++){
            playerNameInputs.getChildren().addAll(new TextField(""));
        }
        Button playerNameInputsButton = new Button("Start");
        playerNameInputs.getChildren().add(playerNameInputsButton);
        Asettelu.setCenter(playerNameInputs);

        playerNameInputsButton.setOnAction(event2 -> {
            ArrayList<String>names = new ArrayList<>();
            for(Node txt : playerNameInputs.getChildren()){
                if(txt.getClass() == TextField.class){
                    names.add(((TextField) txt).getText());
                }
            }
            if(names.size() > 1){
                this.game = new Game(ikkuna, names);
            }
        });
    }


}