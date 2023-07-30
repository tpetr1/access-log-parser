package ru.courses.arithmetic.newtype;

import java.math.BigDecimal;

public class Fraction extends Number {

    int num, denum;

    public Fraction(int num, int denum) {
        this.num = num;
        this.denum = denum;
    }

    public static double fraction(double x) {
        BigDecimal t = BigDecimal.valueOf((int) x);
        BigDecimal d = BigDecimal.valueOf(x);
        BigDecimal res = d.subtract(t);
        return res.doubleValue();
    }

    public String toString() {
        return num + "/" + denum;
    }

    public byte byteValue() {
        return (byte) ((byte) num / denum);
    }

    public short shortValue() {
        return (short) ((short) num / denum);
    }

    public int intValue() {
        return (int) num / denum;
    }

    public long longValue() {
        return (long) ((long) num / denum);
    }

    public float floatValue() {
        return (float) ((float) num / denum);
    }

    public double doubleValue() {
        return (double) ((double) num / denum);

    }
}
