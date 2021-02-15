package com.startjava.lesson_2_3.game;

public class Player {
    // TODO: описывает игроков (один экземпляр класса соответствует одному игроку)
    private String name;
    private int number;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
