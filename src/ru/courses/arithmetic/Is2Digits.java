package ru.courses.arithmetic;

public class Is2Digits {
    public static boolean is2Digits(int x) {
        return (x > 9) && ((x / 10) < 10);
    }
}
