package ru.courses.main;

import ru.courses.arithmetic.newtype.Fraction;
import ru.courses.gastronomy.Sauce;
import ru.courses.gastronomy.Sharpness;
import ru.courses.geometry.Lengthable;
import ru.courses.geometry.Line;
import ru.courses.geometry.Point;
import ru.courses.geometry.Polyline;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
    public static void main(String[] args) throws Exception{
        //System.out.println(rate(args[0], args[1]));

        Point p_geom = new Point(2,4);
        java.awt.Point p_awt = new java.awt.Point(3,7);
        System.out.println(p_geom);
        System.out.println(p_awt);

        Point p1 = new Point(13,2);
        Point p2 = p1.clone();
        System.out.println(p1.equals(p2));
        p2.x = 18;
        p2.y = 10;
        System.out.println("Точка 1: " + p1 + "\n" + "Точка 2: " + p2);
        Line l1 = new Line(p1,p2);
        System.out.println(l1);
        Line l2 = l1.clone();
        System.out.println(l1.equals(l2));
        p2.y = 17;
        System.out.println(l1.equals(l2));

        Point p3 = new Point(5,15);
        Point p4 = new Point(15,3);
        Polyline pl1 = new Polyline();
        Polyline pl2 = new Polyline();
        pl1.setPoint(p1);
        pl2.setPoint(p1);
        pl1.setPoint(p2);
        pl2.setPoint(p2);
        pl1.setPoint(p3);
        pl2.setPoint(p3);
        pl1.setPoint(p4);
        //pl2.setPoint(p4);
        pl2.setPoint(new Point(3,15));
        System.out.println("Ломаная 1: " + pl1 + "\n" + "Ломаная 2: " + pl2);
        System.out.println(pl1.equals(pl2));

        Sauce s = new Sauce("Hot sauce", Sharpness.VERY_HOT);
        System.out.println(s);

        List<Integer> list= new ArrayList<>();
        int N = Integer.parseInt(args[0]);
        for (int i=0; i < N; i++){
            list.add(i+1);
        }
        System.out.println(list);
        for(int i = 0; i < N; i+=2){
            int temp = list.get(i);
            list.set(i,list.get(i+1));
            list.set(i+1,temp);
        }
        System.out.println(list);

        List<String> str = new ArrayList<>();
        str.add("String");
        str.add("valueOf");
        str.add("list");
        System.out.println(getStringFromStream(str.stream()));
    }

    public static String getStringFromStream(Stream stringStream) {
        //напишите тут ваш код
        return stringStream.collect(Collectors.joining(" ")).toString();
    }

}

