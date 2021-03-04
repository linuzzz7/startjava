package com.startjava.lesson_2_3_4.game;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    // TODO:  отвечает за весь игровой процесс
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        Random random = new Random();
        int computerNumber = random.nextInt(101);
//        System.out.println("Комп загадал - " + computerNumber);
        Scanner scanner = new Scanner(System.in);
        Player currentPlayer = player1;
        do {
            System.out.println(currentPlayer.getName() + " введите ваше число:");
            currentPlayer.setNumber(scanner.nextInt());
            if (computerNumber == currentPlayer.getNumber()) {
                System.out.println("Вы угадали число - " + computerNumber);
                break;
            } else if (currentPlayer.getNumber() < computerNumber) {
                System.out.println("Введенное вами число " + currentPlayer.getName() + " меньше того, что загадал компьютер");
            } else if (currentPlayer.getNumber() > computerNumber) {
                System.out.println("Введенное вами число " + currentPlayer.getName() + " больше того, что загадал компьютер");
            }
            currentPlayer = currentPlayer == player1 ? player2 : player1;
        } while (true);
    }
}
