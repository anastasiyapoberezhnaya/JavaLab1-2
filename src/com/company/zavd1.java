package com.company;
import java.util.Scanner;
import java.util.InputMismatchException;
import static java.lang.Math.*;

public class zavd1 {
    private double a=0, b=0, x=0, y=0, z=0;
    zavd1 () {
        System.out.println();
        System.out.println();
        System.out.println("ЗАВДАННЯ №1:");
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
            catch (InputMismatchException e)
            {
                System.out.println("Неправильно! Неправильне ведення!");
                continue;
            }
        }

        Zf();
        Yf();
        System.out.println("Z = " + z);
        System.out.println("Y = " + y);

    }

    private void Zf () {
        if (a < b) {
            z = pow((sin(a)),2.0)+pow(abs(x),0.5)-1.9*a;
        }
        else {
            z = pow((sin(a)),2.0)+pow(abs(x),0.5)-1.9*b;
        }
    }

    private void Yf () {
        if (z> pow(b,3.0)) {
            y = (2.0*z-5.0)/pow(a, 2.0);
        }
        else
        if (z == pow(b,3.0)){
            y = (pow((sin(a)),4.0)+b)/(log(abs(x)));
        }
        else
        if (z< pow(b,3.0)) {
            y = log(x/z);
        }
    }
}


