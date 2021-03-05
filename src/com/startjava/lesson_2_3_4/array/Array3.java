package com.startjava.lesson_2_3_4.array;

public class Array3 {
    public static void main(String[] args) {
        //TODO: Элементы массива, которые меньше среднего арифметического
        int[] array = {-6, 1, 45, 72, -45, 100, 3, -100};
        int sumAllNumbers = array[0];
        for (int i = 1; i < array.length; i++) {
            sumAllNumbers += array[i];

        }
        int tempNumber = sumAllNumbers / array.length;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < tempNumber) {
                tempNumber = array[i];
                System.out.print(tempNumber + " ");
            }
        }
    }
}
