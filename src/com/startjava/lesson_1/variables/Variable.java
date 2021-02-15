package com.startjava.lesson_1.variables;

public class Variable {
    public static void main(String[] args) {
        byte cores = 4;
        short hddSize = 2000;
        int soDimm = 25600;
        long powerW = 1200L;
        float cpu = 4.2F;
        double display = 15.4D;
        char codeName = 'H';
        boolean isHyperThreading = true;
        
        System.out.println("Количесво ядер = " + cores);
        System.out.println("Размер HDD = " + hddSize);
        System.out.println("Частота памяти = " + soDimm);
        System.out.println("Мощность блока питания = " + powerW);
        System.out.println("Количество мегагерц = " + cpu);
        System.out.println("Диагональ дисплея = " + display);
        System.out.println("ID устройства = " + codeName);
        System.out.println("Hyper-Threading = " + isHyperThreading);
    }
}
