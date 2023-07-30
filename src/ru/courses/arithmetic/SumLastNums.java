package ru.courses.arithmetic;

public class SumLastNums {
    public static int sumLastNums(int x){

        int m = x % 10;
        x = x / 10;
        int t = x % 10;
        return m+t;
    }
}
