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

    public int getAttempts() {
        return attempts;
    }

    public int getNumbers() {
        return enteredNumbers[attempts - 1];
    }

    public void setNumbers(int numbers) {
        enteredNumbers[attempts] = numbers;
        attempts++;
    }

    public void allNumbers() {
        System.out.print(this.getName() + " вводил числа ");
        int[] newArray = Arrays.copyOf(enteredNumbers, getAttempts());
        for (int numbers : newArray) {
            System.out.print(" " + numbers);
        }
        System.out.println();
    }

    public void fillEnteredNumbersNull() {
        Arrays.fill(enteredNumbers, 0, attempts, 0);
        attempts = 0;
    }
}
