public class Point {
    int x;
    int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point" + x + ", " + y;
    }
    public boolean Equal(Point a, Point b){
        return a.equals(b);
    }
}
