package ru.courses.way;

import java.util.ArrayList;

public class City {
    String name;
    ArrayList<Road> roads;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Road> getRoads() {
        return roads;
    }

    public void setRoad(Road road) {
        this.roads.add(road);
    }

    public void setRoadPair(City city, String price) {
        this.roads.add(new Road(city, price));
    }

    public City(String name) {
        this.name = name;
    }

    public City(String name, ArrayList<Road> roads) {
        this.name = name;
        this.roads = roads;
    }


    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", roads=" + roads +
                '}';
    }
}
