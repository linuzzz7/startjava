package com.startjava.lesson_2_3_4.robot;

public class Jaeger {
    private int launched;
    private String modelName;
    private String mark;
    private String origin;
    private double height;
    private double weight;
    private int speed;
    private int strength;
    private int armor;
    private boolean destroyed;
    private boolean scan;

    public Jaeger(int launched, String modelName, String mark, String origin, double height, double weight, int speed, int strength, int armor, boolean destroyed, boolean scan) {
        this.launched = launched;
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
        this.strength = strength;
        this.armor = armor;
        this.destroyed = destroyed;
        this.scan = scan;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getLaunched() {
        return launched;
    }

    public void setLaunched(int launched) {
        this.launched = launched;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public boolean isDestroyed() {
        return destroyed;
    }

    public void setDestroyed(boolean destroyed) {
        this.destroyed = destroyed;
    }

    public boolean isScan() {
        return scan;
    }

    public void setScan(boolean scan) {
        this.scan = scan;
    }

    public void fly() {
        System.out.println(getModelName() + " может летать");
    }

    public void speedRun() {
        if (this.speed > 5) {
            System.out.println(getModelName() + " может быстро перемещаться");
        }
    }

    public void scanKaiju() {
        if (scan) {
            System.out.println(getModelName() + " может осуществлять сканирование");
        } else {
            System.out.println(getModelName() + " не оснащен сканером");
        }
    }
}

