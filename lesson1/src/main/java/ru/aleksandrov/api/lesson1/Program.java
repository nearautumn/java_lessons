package ru.aleksandrov.api.lesson1;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        printName();
    }
    /*
    Написать программу, которая запросит пользователя вывести Имя в консоли.
    Получит введенную строку и выведет сообщение Привет, Имя!
     */
    static void printName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ваше имя: ");
        String name = scanner.nextLine();
        System.out.println("Привет, " + name + "!");
        System.out.printf("Привет, %s!", name);
    }

}


