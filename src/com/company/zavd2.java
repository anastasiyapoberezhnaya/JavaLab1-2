package com.company;
import static java.lang.Math.*;
import static java.lang.String.format;
import static java.lang.System.out;

/**
 * Created by НАСТЯ on 27.04.2017.
 */
public class zavd2 {
    private final double xp = -1.6E00, xk = 3.9E00, xd = 4.5E-01;
    private double fX = 0;

    zavd2() {
        System.out.println();
        System.out.println();
        System.out.println("Завдання №2:");
        System.out.println();
        int i = 0;

        out.println(format("%2s | %18s |", "#", "Fx:"));

        for (double _i = xp; _i <= xk; _i = _i + xd) {
            i++;
            fX = exp(_i)+log10(4+pow(_i, 3))/log10(2);
            out.println(format("%2d | %18.16f |", i, fX));
        }

    }
}
