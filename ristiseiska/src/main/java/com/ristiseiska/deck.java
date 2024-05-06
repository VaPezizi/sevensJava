package com.ristiseiska;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import com.ristiseiska.Card.maat;

public class deck {
    private ArrayList<Card> deck;
    //Constructor
    public deck(){
        this.deck = createDeck();
    }

    //Creates a full deck of Cards
    public ArrayList<Card>createDeck(){
        ArrayList<Card>deck = new ArrayList<Card>();
        for(int i = 0; i<4; i++){
            switch (i) {
                case 1:
                    maat maa = maat.HEARTS;
                    for(int num = 1; num<15; num++){
                        deck.add(new Card(maa, num));
                    }break;
                case 2:
                    maa = maat.CLUBS;
                    for(int num = 1; num<15; num++){
                        deck.add(new Card(maa, num));
                    }break;
                case 3:
                    maa = maat.SPADES;
                    for(int num = 1; num<15; num++){
                        deck.add(new Card(maa, num));
                    }break;
                case 4:
                    maa = maat.DIAMONDS;
                    for(int num = 1; num<15; num++){
                        deck.add(new Card(maa, num));
                    }break;
                default:
                    break;
            }
        }
        return deck;
    }
    //Gives the first Card of the deck, and removes it from the deck
    public Card giveCard(){
        Card kortti = this.deck.get(0);
        this.deck.remove(0);
        return kortti;
    }
    //Gives a list of cards of a specified lenght
    public ArrayList<Card> giveCards(int amount){
        ArrayList<Card> cards = new ArrayList<>();
        for(int i = 0; i < amount; i++){
            Card kortti = this.giveCard();
            cards.add(kortti);
        }
        return cards;
    }
    //Returns the whole deck
    public ArrayList<Card> getDeck(){
        return this.deck;
    }
    //Adds a card to the deck
    public void addCard(Card card){
        this.deck.add(card);
    }
    //Returns the size of the deck
    public int countCards(){
        return this.deck.size();
    }
    //Shuffles the deck, with system nano time as the seed
    public void shuffleDeck(){
        long seed = System.nanoTime();
        Collections.shuffle(deck, new Random(seed));
    }
    //Returns a string of the deck
    @Override
    public String toString(){
        return this.deck.toString();
    }
}
