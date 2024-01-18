package com.in28minutes.learnspring.framework.game;

import org.springframework.stereotype.Component;

@Component
public class PacmanGame implements GamingConsole {

    public void up() {
        System.out.println("PacmanGame up");
    }

    public void down() {
        System.out.println("PacmanGame down");
    }

    public void right() {
        System.out.println("PacmanGame righ");
    }

    public void left() {
        System.out.println("PacmanGame left");
    }

}
