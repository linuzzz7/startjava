package com.startjava.lesson_2_3.robot;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger(2015, "Cherno Alpha", "1", "Russia", 280D, 2.412D, 3, 10, 10, true, true);
        Jaeger jaegerTwo = new Jaeger(2017, "Gipsy Danger", "3", "United States of America", 286D, 1.980D, 7, 8, 6, true, false);

        System.out.println("Модель " + jaegerOne.getModelName());
        System.out.println("Год выпуска " + jaegerOne.getLaunched());
        System.out.println("Скорость " + jaegerOne.getSpeed());
        jaegerOne.fly();
        jaegerOne.speedRun();
        jaegerOne.scanKaiju();
        System.out.println();

        System.out.println("Модель " + jaegerTwo.getModelName());
        System.out.println("Год выпуска " + jaegerTwo.getLaunched());
        System.out.println("Скорость " + jaegerTwo.getSpeed());
        jaegerTwo.fly();
        jaegerTwo.speedRun();
        jaegerTwo.scanKaiju();
    }
}
