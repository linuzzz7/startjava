package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        String answer;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Введите математическое выражение в формате 2 ^ 10");
            Calculator calc = new Calculator(scanner.nextLine());
            System.out.println(calc.calculate());
            do {
                System.out.println("Хотите продолжить вычисления? [да/нет]:");
                answer = scanner.nextLine();
            } while (!answer.equals("нет") && !answer.equals("да"));
        } while (!answer.equals("нет"));
    }
}