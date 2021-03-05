package com.startjava.lesson_2_3_4.array;

public class Arrays1 {
    public static void main(String[] args) {
        //TODO: Сумма четных положительных элементов массива
        int[] array = {-6, 1, 45, 72, -45, 100, 3};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0 && array[i] % 2 == 0) {
                sum += array[i];
            }
        }
        System.out.println(sum);
    }
}
