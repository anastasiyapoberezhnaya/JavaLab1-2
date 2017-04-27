package com.company;
import java.util.Scanner;
import java.util.InputMismatchException;
import static java.lang.Math.*;
/**
 * Created by НАСТЯ on 27.04.2017.
 */
public class zavd1 {
    private double a=0, b=0, x=0, y=0, z=0;
    zavd1 () {
        System.out.println();
        System.out.println();
        System.out.println("Завдання №1:");
        System.out.println();

        while (true) {
            try {
                Scanner in = new Scanner(System.in);

                System.out.println("Введіть a:");
                System.out.println("Введіть b:");
                System.out.println("Введіть x:");
                a = in.nextDouble();
                b = in.nextDouble();
                x = in.nextDouble();
                break;
            }
            catch (InputMismatchException exception)
            {
                System.out.println("ПОМИЛКА. Неправильне ведення!");
                continue;
            }
        }

        F1();
        F2();
        System.out.println("z = " + z);
        System.out.println("y = " + y);

    }

    private void F1 () {
        if (a < b) {
            z = pow((sin(a)),2)+pow(abs(x),0.5)-1.9*a;
        }
        else {
            z = pow((sin(a)),2)+pow(abs(x),0.5)-1.9*b;
        }
    }

    private void F2 () {
        if (z> pow(b,3)) {
            y = (2*z-5)/pow(a, 2);
        }
        else
        if (z == pow(b,3)){
            y = (pow((sin(a)),4)+b)/(log(abs(x)));
        }
        else
        if (z< pow(b,3)) {
            y = log(x/z);
        }
    }
}


