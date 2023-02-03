package com.practice;

public class Footballers {

    Player1 player1;
    Player2 player2;

//    Footballers (Player1 player1, Player2 player2) {
//        this.player1 = player1;
//        this.player2 = player2;
//    }


    public Player1 getPlayer1() {
        return player1;
    }

    public void setPlayer1(Player1 player1) {
        this.player1 = player1;
    }

    public Player2 getPlayer2() {
        return player2;
    }

    public void setPlayer2(Player2 player2) {
        this.player2 = player2;
    }

    public void playerPlay() {
        player1.play();
        player2.play();
    }

}
