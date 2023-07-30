package ru.courses.arithmetic;

public class IsInRange {
    public static boolean isInRange(int a, int b, int num){
        if (a<b)
            return (num >= a) && (num <= b);
        return (num >= b) && (num <= a);
    }
}
