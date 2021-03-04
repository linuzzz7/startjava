package com.startjava.lesson_2_3_4.game;
import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        System.out.println("Игра угадайка для 2-х играков:");
        System.out.println("Введите имя игрока 1:");
        Scanner scanner = new Scanner(System.in);
        String firstPlayer = scanner.nextLine();
        System.out.println("Введите имя игрока 2:");
        String secondPlayer = scanner.nextLine();
        GuessNumber game = new GuessNumber(new Player(firstPlayer), new Player(secondPlayer));
        String answer;
        do {
            game.start();
            do {
                System.out.println("Хотите продолжить игру? [да/нет]:");
                answer = scanner.nextLine();
            } while (!answer.equals("нет") && !answer.equals("да"));
        } while (!answer.equals("нет"));
    }
}
