package com.ristiseiska;
import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.layout.FlowPane;

import java.awt.*;
import java.util.ArrayList;

public class Game{
    private Scene view;
    private Table table;
    private Deck deck;

    public Game(Stage ikkuna, ArrayList<String> names){
        //Creates a table object with Stacks and players
        ArrayList<Player> players= new ArrayList<>();
        for(String s : names){
            players.add(new Player(s));
        }
        this.table = new Table(Stack.createStacks(), players);
        this.deck = new Deck();
        deck.shuffleDeck();

        //Giving all the players cards (Its ugly and slow)
        while(!deck.isEmpty()){
            for (Player player : table.getPlayers()){
                if(!deck.isEmpty()){
                    player.addCard(deck.giveCard());
                }
            }
        }

        //Changes the scene to the game screem
        BorderPane Asettelu = new BorderPane();
        this.view = new Scene(Asettelu, 1280, 720);
        showGameView(Asettelu, ikkuna);

    }
    public void showGameView(BorderPane Asettelu, Stage ikkuna){
        FlowPane keskiosa = new FlowPane(Orientation.VERTICAL);
        keskiosa.setAlignment(Pos.CENTER);
        keskiosa.getChildren().addAll(new Text("Pelaajat ja heidän kortit: \n"));
        for(Player player : this.table.getPlayers()){
            keskiosa.getChildren().addAll(new Text(player.toString() + "\tKorttien määrä: " + String.valueOf(player.getCards().size()) + "\n"));
        }

        Asettelu.setTop(keskiosa);
        ikkuna.setScene(view);
        ikkuna.show();
    }
}
