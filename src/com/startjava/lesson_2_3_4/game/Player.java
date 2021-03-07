package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] enteredNumbers = new int[10];
    private int attempts;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setEnteredNumber(int number) {
        enteredNumbers[attempts] = number;
        attempts++;
    }

    public int[] outputOfAllNumbers() {
        return Arrays.copyOf(enteredNumbers, getAttempts());
    }

    public void clearEnteredNumbers() {
        Arrays.fill(enteredNumbers, 0, attempts, 0);
        attempts = 0;
    }

    public int getAttempts() {
        return attempts;
    }

    public int getNumbers() {
        return enteredNumbers[attempts - 1];
    }
}
