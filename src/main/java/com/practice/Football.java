package com.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Football {
    public static void main(String[] args) {
//        Footballers footballers = new Footballers(new Player1(), new Player2());

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("football.xml");
        Footballers footballers = applicationContext.getBean("footballers", Footballers.class);

//        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
//        Footballers footballers = applicationContext.getBean("footballers", Footballers.class);

        footballers.playerPlay();
    }
}