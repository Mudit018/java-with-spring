package com.practice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan (basePackages = "com.practice")
public class AppConfig {
//    @Bean (name = "player1")
//    public Player1 createPlayer1() {
//        return new Player1();
//    }
//
//    @Bean (name = "player2")
//    public Player2 createPlayer2() {
//        return new Player2();
//    }
//
//    @Bean (name = "footballers")
//    public Footballers createFootballers() {
////        return new Footballers(createPlayer1(), createPlayer2());
//        Footballers footballers = new Footballers();
//        footballers.setPlayer1(new Player1());
//        footballers.setPlayer2(new Player2());
//        return footballers;
//    }
}