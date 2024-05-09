package com.ristiseiska;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Game{
    private Scene scene;
    private Table table;
    private Deck deck;

    public Game(Stage stage, ArrayList<String> names){
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

    }
}
