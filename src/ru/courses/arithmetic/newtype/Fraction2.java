package ru.courses.arithmetic.newtype;

public class Fraction2 {
    final int numerator;
    final int denominator;

    public Fraction2(int numerator, int denominator) {
        this.numerator = numerator;
        if (denominator < 1) throw new IllegalArgumentException();
        this.denominator = denominator;
    }

    private Fraction2 toFraction(int a) {
        return new Fraction2(a * this.denominator, this.denominator);
    }

    public Fraction2 sum(int a) {
        return sum(toFraction(a));
    }

    public Fraction2 sum(Fraction2 f) {
        switch (returnRule(this, f)) {
            case 1: {
                return new Fraction2(this.numerator + f.numerator, this.denominator);
            }
            case 2: {
                int d = f.denominator / this.denominator;
                return new Fraction2((this.numerator * d) + f.numerator, f.denominator);
            }
            case 3: {
                int d = this.denominator / f.denominator;
                return new Fraction2((f.numerator * d) + this.numerator, this.denominator);
            }
        }
        int d = f.denominator * this.denominator;
        return new Fraction2((this.numerator * f.denominator) + (f.numerator * this.denominator), d);
    }

    public Fraction2 minus(int a) {
        return minus(toFraction(a));
    }

    public Fraction2 minus(Fraction2 f) {
        switch (returnRule(this, f)) {
            case 1: {
                return new Fraction2(this.numerator - f.numerator, this.denominator);
            }
            case 2: {
                int d = f.denominator / this.denominator;
                return new Fraction2((this.numerator * d) - f.numerator, f.denominator);
            }
            case 3: {
                int d = this.denominator / f.denominator;
                return new Fraction2((f.numerator * d) - this.numerator, this.denominator);
            }
        }
        int d = f.denominator * this.denominator;
        return new Fraction2((this.numerator * f.denominator) - (f.numerator * this.denominator), d);
    }

    private int returnRule(Fraction2 f1, Fraction2 f2) {
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
}

