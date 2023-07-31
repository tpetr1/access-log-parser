package ru.courses.gastronomy;

public class Sharpness {
    private String txt;
    public final static Sharpness VERY_HOT = new Sharpness("Very hot");
    public final static Sharpness HOT = new Sharpness("Hot");
    public final static Sharpness NOT_HOT = new Sharpness("Not hot");

    public Sharpness(String txt) {
        this.txt = txt;
    }

    @Override
    public String toString() {
        return txt;
    }
}
