package com.startjava.lesson_2_3_4.array;

public class Arrays2 {
    public static void main(String[] args) {
        //TODO: Максимальный из элементов массива с четными индексами
        int[] array = {-6, 1, 45, 72, -45, 100, 3};
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (i % 2 == 0 && max < array[i]) {
                max = array[i];
            }
        }
        System.out.println(max);
    }
}
