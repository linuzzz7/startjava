package com.startjava.lesson_2_3_4.wolf;

public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setNickName("Омега");
        wolf.setColor("Серый");
        wolf.setSex('M');
        wolf.setAge(5);
        wolf.setWeight(35.5F);

        System.out.println("Имя волка - " + wolf.getNickName());
        System.out.println("Окрас волка - " + wolf.getColor());
        System.out.println("Пол волка - " + wolf.getSex());
        System.out.println("Возраст волка - " + wolf.getAge());
        System.out.println("Вес волка - " + wolf.getWeight());
        System.out.println();

        wolf.go();
        wolf.howl();
        wolf.hunt();
        wolf.run();
        wolf.sit();
    }
}
