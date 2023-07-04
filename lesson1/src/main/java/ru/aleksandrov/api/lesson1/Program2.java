/*
Дан массив чисел. Вывести макс кол-во идущих подряд 1
 */

package ru.aleksandrov.api.lesson1;

public class Program2 {
    public static void main(String[] args) {
        printOneCount();

    }

    static void printOneCount() {
        int counter = 0;
        int max = 0;
        int[] array = {0, 1, 1, 0, 1};
        for (int e : array) {
            if (e == 1)
                counter++;
            else {
                if (counter > max)
                    max = counter;
                counter = 0;
            }
        }
        System.out.printf("Макс идущих подряд 1ок: %d\n", max);
    }
}