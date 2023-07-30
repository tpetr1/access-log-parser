package ru.courses.main;

import ru.courses.arithmetic.newtype.Fraction;
import ru.courses.geometry.Lengthable;
import ru.courses.geometry.Point;

import static java.lang.Integer.*;
import static java.lang.Math.*;

public class Main {
    public static int lastNumSum(int a, int b) {
        return (a % 10) + (b % 10);
    }

    static double l(Lengthable lin) {
        return lin.length();
    }

    static double sum(Number... numbers) {
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
            if (numbers[i].getClass() == Fraction.class) {
                sum += (numbers[i].doubleValue());
            }
            if (numbers[i].getClass() == Integer.class) {
                sum += (double) ((Integer) numbers[i]);
            }
            if (numbers[i].getClass() == Double.class) {
                sum += (double) numbers[i];
            }
        }
        return sum;
    }

    static double rate(String x, String y){
        int a = parseInt(x);
        int b = parseInt(y);
        return pow(a,b);
    }
    public static void main(String[] args) {
        System.out.println(rate(args[0], args[1]));

        Point p_geom = new Point(2,4);
        java.awt.Point p_awt = new java.awt.Point(3,7);
        System.out.println(p_geom);
        System.out.println(p_awt);
    }
}

