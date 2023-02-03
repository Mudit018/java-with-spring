package com.practice;

import org.springframework.stereotype.Component;

@Component
public class Player2 implements Players{
    public void play() {
        System.out.println("Player2");
    }
}
