package ru.courses.geometry;

public class ClosedPolyline extends Polyline {

    public double lengthClose() {
        double sum = length();
        int i = this.arrayPoints.size() - 2;
        int a = Math.abs(this.arrayPoints.get(0).x - this.arrayPoints.get(i + 1).x);
        int b = Math.abs(this.arrayPoints.get(0).y - this.arrayPoints.get(i + 1).y);
        sum += Math.sqrt((a * a) + (b * b));
        return sum;
    }
}
