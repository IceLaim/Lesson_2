package com.geekbrains.Lesson_2;

public class HomeWork2 {

    public static void main(String[] args) {
        System.out.println(sumWithin10and20(10, 5));
        numPositiveOrNegative(-5);
    }


    public static boolean sumWithin10and20(int a, int b) {
        int sum = a + b;
        return sum >= 10 & sum <= 20;
    }


    public static void numPositiveOrNegative(int x) {
        if (x < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Positive");
        }
    }




        }

