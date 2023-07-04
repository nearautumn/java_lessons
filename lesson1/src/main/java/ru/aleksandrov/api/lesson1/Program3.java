package ru.aleksandrov.api.lesson1;

public class Program3 {
    public static void main(String[] args) {
        reverseString("Привет пока!");
    }

    static void reverseString(String message) {
        String[] words = message.split(" ");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.printf("%s ", words[i] );
        }
    }

}
