package com.startjava.lesson_1.app;

public class MyFirstGame {
    public static void main(String[] args) {
        System.out.println("Компьютер загадал число, от 0 до 100, введите свой ответ:");
        int computerNumber = 71;
        int userAnswer = 75;

        while (computerNumber != userAnswer) {
            if (userAnswer > computerNumber) {
                System.out.println("Введенное вами число " + userAnswer + " больше того, что загадал компьютер");
                userAnswer--;
            } else if (userAnswer < computerNumber) {
                System.out.println("Введенное вами число " + userAnswer + " меньше того, что загадал компьютер");
                userAnswer++;
            }
        }
        System.out.println("Вы угадали! это число - " + computerNumber);
    }
}
