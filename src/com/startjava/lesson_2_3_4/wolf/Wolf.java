package com.startjava.lesson_2_3_4.wolf;

public class Wolf {
    //TODO: поля: пол, кличка, вес, возраст, окрас
    private char sex;
    private String nickName;
    private float weight;
    private int age;
    private String color;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 8) {
            System.out.println("Некорректный возраст");
        } else {
            this.age = age;
        }
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //TODO: методы: идти, сидеть, бежать, выть, охотиться
    public void go() {
        System.out.println("Я могу идти");
    }

    public void sit() {
        System.out.println("Я могу сидеть");
    }

    public void run() {
        System.out.println("Я могу бежать");
    }

    public void howl() {
        System.out.println("Я могу выть");
    }

    public void hunt() {
        System.out.println("Я могу охотиться");
    }
}
