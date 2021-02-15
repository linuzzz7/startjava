package com.startjava.lesson_1.loop;

public class Cycle {
    public static void main(String[] args) {
        // TODO: Выведите на консоль с помощью цикла for все числа от [0, 20]
        for (int i = 0; i <= 20; i++) {
            System.out.println(i);
        }
        System.out.println();
        // TODO: Выведите на консоль с помощью цикла while все числа от [6, -6] (с шагом итерации 2)
        int x = 6;
        while (x >= -6) {
            System.out.println(x);
            x -= 2;
        }
        System.out.println();
        // TODO: Подсчитайте с помощью цикла do-while сумму нечетных чисел от [10, 20]. Выведите ее на консоль
        int y = 10;
        int sum = 0;
        do {
            if (y % 2 != 0) {
                sum += y;
            }
            y++;
        } while (y <= 20);
        System.out.println(sum);
    }
}
