package com.startjava.lesson_1.condstate;

public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 25;
        if (age > 20) {
            System.out.println("Возраст больше 20, а именно " + age);
        }

        char sex = 'M';
        if (sex == 'M') {
            System.out.println("Пол мужской - " + sex);
        }

        sex = 'W';
        if (sex != 'M') {
            System.out.println("Пол женский - " + sex);
        }

        float growth = 1.73F;
        if (growth < 1.80) {
            System.out.println("Рост меньше 1.80, а именно " + growth);
        } else {
            System.out.println("Рост больше 1.80, а именно " + growth);
        }

        char firstLetterOfName = 'T';
        if (firstLetterOfName == 'M') {
            System.out.println("Имя начинает с М");
        } else if (firstLetterOfName == 'I') {
            System.out.println("Имя начинает с I");
        } else {
            System.out.println("Имя не начинается с М или I");
        }
    }
}
