package com.startjava.lesson_2_3_4.calculator;

import static java.lang.Math.*;

public class Calculator {
    private int firstNumber;
    private char signOperation;
    private int secondNumber;

    public Calculator(String expression) {
        String[] partsExpression = expression.split(" ");
        this.firstNumber = Integer.parseInt(partsExpression[0]);
        this.signOperation = partsExpression[1].charAt(0);
        this.secondNumber = Integer.parseInt(partsExpression[2]);
    }

    public int calculate() {
        int result = 0;
        switch (signOperation) {
            case '+':
                return addExact(firstNumber, secondNumber);
            case '-':
                return subtractExact(firstNumber, secondNumber);
            case '*':
                return multiplyExact(firstNumber, secondNumber);
            case '/':
                return firstNumber / secondNumber;
            case '%':
                return firstNumber % secondNumber;
            case '^':
                return (int) pow(firstNumber, secondNumber);
        }
        return 0;
    }
}
