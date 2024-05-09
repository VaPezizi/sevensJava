package com.ristiseiska;

import java.util.ArrayList;

public class Table {
    private ArrayList<Stack>tableList;
    private ArrayList<Player>players;

    /*public Table(Stack heartStack, Stack spadeStack, Stack clubStack, Stack diamondStack, ArrayList<Player> players){
        this.tableList.add(heartStack);
        this.tableList.add(spadeStack);
        this.tableList.add(clubStack);
        this.tableList.add(diamondStack);
        this.players = players;
    }*/
    public Table(ArrayList<Stack> stackArrayList, ArrayList<Player> players){
        this.tableList = stackArrayList;
        this.players = players;
    }
    public void clearTable(){
        for (Stack stack : tableList) {
            stack.clearStack();
        }
        for (Player player : players) {
            players.remove(player);
        }
    }
    
}
