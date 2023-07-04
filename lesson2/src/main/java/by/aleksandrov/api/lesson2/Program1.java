package by.aleksandrov.api.lesson2;

import java.util.UUID;

public class Program1 {

    public static void main(String[] args) {
        //task1();
        System.out.println(task2());
    }

    static void task1() {
        System.out.println(UUID.randomUUID());

        // долгая склейка строк
        long startTime = System.currentTimeMillis();
        String buf = "";
        for (int i =0; i < 30000; i++) {
            buf += UUID.randomUUID();
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);

        // быстрая склейка строк
        startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 30000; i++) {
            sb.append(UUID.randomUUID());
        }
        endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }

    static String task2() {
        /**
         * Задача:
         * На вход программы подаются произвольные алфавитно-цифровые символы.
         * Требуется написать программу, которая будет печатать последовательность строчных английских букв ('a' 'b'... 'z')
         * из входной последовательности и частот их повторения.
         * Печать должна происходить в алфавитном порядке. Например, пусть на вход подаются следующие символы:
         * fhb5234SSDSFsfsdfskbfsh.fmsdfsdf.
         * '.' - завершение последовательности
         * В этом случае программа должна вывести:
         * b2
         * f3
         * h2
         * k1
         * m1
         * s1
         */

        String inputStr = "fhb5234SSDSFsfsdfskbfsh.fmsdfsd";
        int[] statistic = new int[26];
        int cA = 'a'; // теперь в сА хранится 97 - номер символа в юникоде
        char c;
        int code;

        for (int i = 0; i < inputStr.length(); i++) {
            c = inputStr.charAt(i);
            code = c;
            if (c >= 'a' && c <= 'z') {
                statistic[code -cA]++;
            }
            if (c == '.') break;
        }
        System.out.println("Резултат: ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < statistic.length; i++) {
            if (statistic[i] > 0) {
                char cc = (char) (i + cA);
                sb
                        .append(cc)
                        .append(statistic[i])
                        .append("\n");
            }
        }
        return sb.toString();
    }


}
