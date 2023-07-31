package ru.courses.gastronomy;

public class Sauce {
    String name = new String();
    private Sharpness sharpness;

    public Sauce(String name, Sharpness sharpness) {
        this.name = name;
        this.sharpness = sharpness;
    }

    @Override
    public String toString() {
        return "Sauce " + name + ": " + sharpness;
    }
}
