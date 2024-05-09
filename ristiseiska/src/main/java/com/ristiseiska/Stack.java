package com.ristiseiska;

import java.util.ArrayList;

import com.ristiseiska.Card.maat;

public class Stack {
    private ArrayList<Card> cards;
    private maat maa;

    public Stack(maat maa){
        this.cards = new ArrayList<Card>();
        this.maa = maa;
    }
    public static ArrayList<Stack>createStacks(){
        ArrayList<Stack> stacks = new ArrayList<>();
        stacks.add(new Stack(maat.HEARTS));
        stacks.add(new Stack(maat.CLUBS));
        stacks.add(new Stack(maat.DIAMONDS));
        stacks.add(new Stack(maat.SPADES));
        return new ArrayList<Stack>();
    }

    public ArrayList<Card> getCards(){
        return this.cards;
    }
    public Card getTopCard(){
        return cards.get(0);
    }
    public Card getBottomCard(){
        if(!this.cards.isEmpty()){
            return cards.get(this.cards.size() - 1);
        }else{
            return (new Card(maat.CLUBS, 0));
        }
    }
    public void addCard(Card card){
        this.cards.add(card);
    }
    public void clearStack(){
        this.cards = new ArrayList<Card>();
    }
    public String toString(){
        return maa +": "+ cards;
    }
}
