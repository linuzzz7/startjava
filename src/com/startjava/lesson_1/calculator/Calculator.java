package com.startjava.lesson_1.calculator;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Введите 2 числа и знак операции:");
        int number1 = 2;
        int number2 = 4;
        char signOperation = '^';
        int result = 0;
        System.out.println("Вы ввели числа: " + number1 + " и " + number2);
        System.out.println("Знак операции: " + signOperation);

        if (signOperation == '+') {
            result = number1 + number2;
        } else if (signOperation == '-') {
            result = number1 - number2;
        } else if (signOperation == '*') {
            result = number1 * number2;
        } else if (signOperation == '/') {
            result = number1 / number2;
        } else if (signOperation == '^') {
            result = number1;
            while (number2 - 1 != 0) {
                if (number2 == 0) {
                    result = 1;
                    break;
                }
                result *= number1;
                number2--;
            }
        } else if (signOperation == '%') {
            result = number1 % number2;
        }
        System.out.println("Результат вычисления: " + result);
    }
}
