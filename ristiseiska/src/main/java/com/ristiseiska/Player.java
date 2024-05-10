package com.ristiseiska;

import java.util.ArrayList;

public class Player {
    private ArrayList<Card> cards;
    private String name;

    //Create a Player with only a name
    public Player(String name){
        this.name = name;
        this.cards = new ArrayList<Card>();
    }
    //Create a Player with cards
    public Player(String name, ArrayList<Card> cards){
        this.name = name;
        this.cards = cards;
    }
    public ArrayList<Card> getCards(){
        return this.cards;
    }
    public String getName(){
        return this.name;
    }
    public void addCard(Card card){
        this.cards.add(card);
    }
    public void removeCard(Card card){
        cards.remove(card);
    }
    public String toString(boolean showcards){
        String kortit = "";
        for(Card kortti : this.cards){
            kortit = kortit + "\n" + kortti.toString();
        }
        return "Pelaaja: " + this.name + kortit;
    }
    public String toString(){
        return "Pelaaja: " + this.name;
    }
    
}
