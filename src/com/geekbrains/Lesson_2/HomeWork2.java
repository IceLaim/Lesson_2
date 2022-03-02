package com.geekbrains.Lesson_2;

public class HomeWork2 {

    public static void main(String[] args) {
        System.out.println(sumWithin10and20(10, 5));
        numPositiveOrNegative(-5);
        System.out.println(numNegative(25));
        printWordNTimes("Привет", 3 );
    }


    public static boolean sumWithin10and20(int a, int b) {
        int sum = a + b;
        return sum >= 10 & sum <= 20;
    }


    public static void numPositiveOrNegative(int с) {
        if (с < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Positive");
        }
    }

    public static boolean numNegative(int d) {
        if (d < 0) {
            return true;
        } else {
            return false;
        }

    }


    public static void printWordNTimes(String words, int times) {
        for (int i = 1; i <= times; i++) {
            System.out.println(words);
        }

    }
}
