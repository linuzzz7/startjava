package com.startjava.lesson_2_3_4.calculator;

import static java.lang.Math.*;

public class Calculator {
    private int firstNumber;
    private char signOperation;
    private int secondNumber;

    public Calculator(String expression) {
        String[] mass = expression.split(" ");
        this.firstNumber = Integer.parseInt(mass[0]);
        this.signOperation = mass[1].charAt(0);
        this.secondNumber = Integer.parseInt(mass[2]);
    }

    public int calculate() {
        int result = 0;
        switch (signOperation) {
            case '+':
                result = addExact(firstNumber, secondNumber);
                break;
            case '-':
                result = subtractExact(firstNumber, secondNumber);
                break;
            case '*':
                result = multiplyExact(firstNumber, secondNumber);
                break;
            case '/':
                result = firstNumber / secondNumber;
                break;
            case '%':
                result = firstNumber % secondNumber;
                break;
            case '^':
                return (int) pow(firstNumber, secondNumber);
        }
        return result;
    }
}
