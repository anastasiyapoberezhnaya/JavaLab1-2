package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class zavd3 {
    zavd3()
    {
        System.out.println();
        System.out.println();
        System.out.println("ЗАВДАННЯ №3:");
        System.out.println();
        int b = 0;
        String str;
        char arr[];
        boolean yes = false;

        do {
            while (true) {
                try {
                    Scanner in = new Scanner(System.in);
                    System.out.println("Ведіть ціле число на 6 цифр!:");
                    int a = in.nextInt();
                    str = Integer.toString(a);
                    System.out.println("Ведіть ціле опорне число!:");
                    b = in.nextInt();
                    if (str.length() != 6) System.out.println("Неправильно, ведіть число на 6 цифр!");
                    else break;
                } catch (InputMismatchException ex) {
                    System.out.println("Неправильно, ведіть число!");
                }
            }

            arr = str.toCharArray();

            if (((arr[0] - 48) + (arr[1] - 48) / 2.0) > b) {
                System.out.println("Цифри: " + arr[0] + ", " + arr[1] + ". Позиції: 1, 2.");
                yes = true;
            }
            if (((arr[0] - 48) + (arr[1] - 48) / 2.0) > b) {
                System.out.println("Цифри: " + arr[1] + ", " + arr[2] + ". Позиції: 2, 3.");
                yes = true;
            }
            if (((arr[0] - 48) + (arr[1] - 48) / 2.0) > b) {
                System.out.println("Цифри: " + arr[2] + ", " + arr[3] + ". Позиції: 3, 4.");
                yes = true;
            }
            if (((arr[0] - 48) + (arr[1] - 48) / 2.0) > b) {
                System.out.println("Цифри: " + arr[3] + ", " + arr[4] + ". Позиції: 4, 5.");
                yes = true;
            }
            if (((arr[0] - 48) + (arr[1] - 48) / 2.0) > b) {
                System.out.println("Цифри: " + arr[0] + ", " + arr[1] + ". Позиції: 5, 6.");
                yes = true;
            }

            if (yes) break;
            else
                System.out.println("Цифр немає!");
        }
        while (true);
    }
}
