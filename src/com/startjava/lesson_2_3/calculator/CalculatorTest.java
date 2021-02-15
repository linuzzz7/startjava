package com.startjava.lesson_2_3.calculator;
import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        String answer;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Введите первое число: ");
            int number1 = scanner.nextInt();
            System.out.println("Введите знак математической операции: ");
            char sign = scanner.next().charAt(0);
            System.out.println("Введите второе число: ");
            int number2 = scanner.nextInt();
            Calculator calc = new Calculator();
            int result = calc.calculate(number1, sign, number2);
            System.out.println("Результат операции: " + result);
            do {
                System.out.println("Хотите продолжить вычисления? [да/нет]:");
                answer = scanner.next();
            } while (!answer.equals("нет") && !answer.equals("да"));
        } while (!answer.equals("нет"));
    }
}
