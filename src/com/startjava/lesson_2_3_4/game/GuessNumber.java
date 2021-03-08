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
        int secretNumber = random.nextInt(101);
//        System.out.println("Компьютер загадал - " + computerNumber);
        Player currentPlayer = player1;
        do {
            System.out.println(currentPlayer.getName() + " введите ваше число:");
            currentPlayer.setEnteredNumber(inputNumber());
            if (compareNumber(currentPlayer, secretNumber)) {
                break;
            }
            if (currentPlayer.getAttempt() == 10) {
                System.out.println("У " + currentPlayer.getName() + " закончились попытки");
            }
            counterGame++;
            if (counterGame == 20) {
                endGame();
                break;
            }
            currentPlayer = currentPlayer == player1 ? player2 : player1;
        } while (true);
    }

    public int inputNumber() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public boolean compareNumber(Player player, int secretNumber) {
        if (secretNumber == player.getNumber()) {
            System.out.println("Игрок " + player.getName() + " угадал число "
                    + player.getNumber() + " с " + (player.getAttempt()) + " попытки");
            endGame();
            return true;
        }
        System.out.println("Введенное вами число " + player.getName() + (player.getNumber() < secretNumber ?
                " меньше того, что загадал компьютер" : " больше того, что загадал компьютер"));
        return false;
    }

    public void endGame() {
        printPlayerNumbers(player1);
        player1.clearEnteredNumbers();
        printPlayerNumbers(player2);
        player2.clearEnteredNumbers();
        counterGame = 0;
    }

    public void printPlayerNumbers(Player player) {
        System.out.print(player.getName() + " вводил числа ");
        for (int number : player.getEnteredNumbers()) {
            System.out.print(" " + number);
        }
        System.out.println();
    }
}
