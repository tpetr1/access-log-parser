public class Fraction2 {
    final int numerator;
    final int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        if (denominator < 1) throw new IllegalArgumentException();
        this.denominator = denominator;
    }

    private Fraction toFraction(int a){
        return new Fraction(a * this.denominator, this.denominator);
    }

    public Fraction sum(int a) {
        return sum(toFraction(a));
    }

    public Fraction sum(Fraction f) {
        switch (returnRule(this, f)) {
            case 1: {
                return new Fraction(this.numerator + f.numerator, this.denominator);
            }
            case 2: {
                int d = f.denominator / this.denominator;
                return new Fraction((this.numerator * d) + f.numerator, f.denominator);
            }
            case 3: {
                int d = this.denominator / f.denominator;
                return new Fraction((f.numerator * d) + this.numerator, this.denominator);
            }
        }
        int d = f.denominator * this.denominator;
        return new Fraction((this.numerator * f.denominator) + (f.numerator * this.denominator), d);
    }

    public Fraction minus(int a) {
        return minus(toFraction(a));
    }

    public Fraction minus(Fraction f) {
        switch (returnRule(this, f)) {
            case 1:{
                return new Fraction(this.numerator - f.numerator, this.denominator);
            }
            case 2: {
                int d = f.denominator / this.denominator;
                return new Fraction((this.numerator * d) - f.numerator, f.denominator);
            }
            case 3: {
                int d = this.denominator / f.denominator;
                return new Fraction((f.numerator * d) - this.numerator, this.denominator);
            }
        }
        int d = f.denominator * this.denominator;
        return new Fraction((this.numerator * f.denominator) - (f.numerator * this.denominator), d);
    }

    private int returnRule(Fraction f1, Fraction f2) {
        if (f1.denominator == f2.denominator)
            return 1;

        if ((f1.denominator < f2.denominator) && (f2.denominator % f1.denominator == 0))
            return 2;

        if ((f1.denominator > f2.denominator) && (f1.denominator % f2.denominator == 0))
            return 3;

 //       if (f1.denominator % f2.denominator != 0)
        return 4;
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

import java.math.BigDecimal;

public class Fraction extends Number{

    int num,denum;

    public Fraction(int num, int denum) {
        this.num = num;
        this.denum = denum;
    }

    public String toString() {
        return num + "/" + denum;
    }

    public byte byteValue() {
        return (byte) ((byte) num/denum);
    }

    public short shortValue() {
        return (short) ((short) num/denum);
    }

    public int intValue() {
        return (int) num/denum;
    }

    public long longValue() {
        return (long) ((long) num/denum);
    }

    public float floatValue() {
        return (float) ((float) num/denum);
    }

    public double doubleValue() {
        return (double) ((double) num/denum);

    public static double fraction(double x){
        BigDecimal t = BigDecimal.valueOf((int) x);
        BigDecimal d = BigDecimal.valueOf(x);
        BigDecimal res = d.subtract(t);
        return res.doubleValue();
    }

}
