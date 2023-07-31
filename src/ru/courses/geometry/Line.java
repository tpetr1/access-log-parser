package ru.courses.geometry;

import java.util.Objects;

public class Line implements Lengthable, Cloneable {
    //int x1,x2,y1,y2;
    public Point point1;
    public Point point2;

    public Line(int x1, int x2, int y1, int y2) {
        Point point1 = new Point(x1,y1);
        Point point2 = new Point(x2,y2);
        this.point1 = point1;
        this.point2 = point2;
    }
    public Line(Point p1, Point p2) {
        Point point1 = p1;
        Point point2 = p2;
        this.point1 = point1;
        this.point2 = point2;
    }

    public double length(){
        int a = Math.abs(point1.x - point2.x);
        int b = Math.abs(point1.y - point2.y);
        return Math.sqrt((a * a) + (b * b));
    }

    @Override
    public String toString() {
        return "Линия от {" + point1.x +
                ", " + point1.y +
                "} до {" + point2.x +
                ", " + point2.y +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Line line = (Line) o;

        if (!point1.equals(line.point1)) return false;
        return point2.equals(line.point2);
    }

    @Override
    public int hashCode() {
        int result = point1.hashCode();
        result = 31 * result + point2.hashCode();
        return result;
    }

    @Override
    public Line clone() throws CloneNotSupportedException {
        Line l = (Line) super.clone();
        l.point1 = l.point1.clone();
        l.point2 = l.point2.clone();
        return l;
    }
}
