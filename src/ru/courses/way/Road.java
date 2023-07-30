package ru.courses.way;

import ru.courses.way.City;

public class Road {
    City city;
    String price;

    public Road(City city, String price) {
        this.city = city;
        this.price = price;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "{" + city +
                ": " + price +
                '}';
    }
}
