package com.in28minutes.learnspring.framework.game;

import org.springframework.stereotype.Component;

@Component
public class MarioGame implements GamingConsole {

    public void up() {
        System.out.println("up");
    }

    public void down() {
        System.out.println("down");
    }

    public void right() {
        System.out.println("righ");
    }

    public void left() {
        System.out.println("left");
    }

}
