public class Point {
    int x;
    int y;
    int z;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        return "Point{" + x + ", " + y;
    }
    public boolean Equal(Point a, Point b){
        return a.equals(b);
    }
}
