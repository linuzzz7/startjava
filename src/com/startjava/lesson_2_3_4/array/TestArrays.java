package com.startjava.lesson_2_3_4.array;

import java.util.Scanner;

public class TestArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину массива - ");
        int maxLength = scanner.nextInt();
        int[] mass = new int[maxLength];

        System.out.print("Заполните массив целыми числами через пробел - ");
        for (int i = 0; i < maxLength; i++) {
            mass[i] = scanner.nextInt();
        }

        int max = mass[0];
        for (int i = 0; i < maxLength; i++) {
            if (max < mass[i]) {
                max = mass[i];
            }
        }
        System.out.println("Максимальное число - " + max);
    }
}
