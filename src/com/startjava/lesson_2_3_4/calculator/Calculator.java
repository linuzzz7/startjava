package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    public int calculate(int number1, char signOperation, int number2) {
        int result = 0;
        switch (signOperation) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                result = number1 / number2;
                break;
            case '%':
                result = number1 % number2;
                break;
            case '^':
                result = 1;
                for (int i = 0; i < number2; i++) {
                    result *= number1;
                }
        }
        return result;
    }
}
