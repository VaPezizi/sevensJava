package com.ristiseiska;

import com.ristiseiska.Card.maat;

public class Card{
    private int number;
    private maat maat;
    enum maat{
        HEARTS,
        CLUBS,
        SPADES,
        DIAMONDS
    }
    public Card(maat maat, int arvo){
        this.maat = maat;
        this.number = arvo;
    }
    public int getValue(){
        return this.number;
    }
    public maat getSuit(){
        return this.maat;
    }
    @Override
    public String toString(){
        return "Suit:" + this.maat + " Value:" + number;
    }
}
/*class Main {
    public static void main(String[] args) {
        deck pakka = new deck();
        pakka.shuffleDeck();

    }
}*/