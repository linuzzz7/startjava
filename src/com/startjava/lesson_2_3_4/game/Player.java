package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] enteredNumbers = new int[10];
    private int attempt;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setEnteredNumber(int number) {
        enteredNumbers[attempt] = number;
        attempt++;
    }

    public int[] getEnteredNumbers() {
        return Arrays.copyOf(enteredNumbers, attempt);
    }

    public int getAttempt() {
        return attempt;
    }

    public int getNumber() {
        return enteredNumbers[attempt - 1];
    }

    public void clearEnteredNumbers() {
        Arrays.fill(enteredNumbers, 0, attempt, 0);
        attempt = 0;
    }
}
