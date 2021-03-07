package com.startjava.lesson_2_3_4.game;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private int counterGame;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        Random random = new Random();
        int computerNumber = random.nextInt(101);
//        System.out.println("Компьютер загадал - " + computerNumber);
        Scanner scanner = new Scanner(System.in);
        Player currentPlayer = player1;

        do {
            System.out.println(currentPlayer.getName() + " введите ваше число:");
            currentPlayer.setEnteredNumber(scanner.nextInt());
            if (computerNumber == currentPlayer.getNumbers()) {
                System.out.println("Игрок " + currentPlayer.getName() + " угадал число "
                        + currentPlayer.getNumbers() + " с " + (currentPlayer.getAttempts()) + " попытки");
                gameOver();
                break;
            } else if (currentPlayer.getNumbers() < computerNumber) {
                System.out.println("Введенное вами число " + currentPlayer.getName() +
                        " меньше того, что загадал компьютер");
            } else if (currentPlayer.getNumbers() > computerNumber) {
                System.out.println("Введенное вами число " + currentPlayer.getName() + " больше того, что загадал компьютер");
            }

            if (currentPlayer.getAttempts() == 5) {
                System.out.println("У " + currentPlayer.getName() + " закончились попытки");
            }

            counterGame++;
            if (counterGame == 10) {
                gameOver();
                break;
            }
            currentPlayer = currentPlayer == player1 ? player2 : player1;

        } while (true);
    }

    public void gameOver() {
        printPlayerNumbers(player1);
        player1.clearEnteredNumbers();
        printPlayerNumbers(player2);
        player2.clearEnteredNumbers();
        counterGame = 0;
    }

    public void printPlayerNumbers(Player player) {
        System.out.print(player.getName() + " вводил числа ");
        for (int number : player.outputOfAllNumbers()) {
            System.out.print(" " + number);
        }
        System.out.println();
    }
}
