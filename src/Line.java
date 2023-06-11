public class Line {
    int x1,x2,y1,y2;

    public Line(int x1, int x2, int y1, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }
    public Line(Point p1, Point p2) {
        this.x1 = p1.x;
        this.x2 = p2.x;
        this.y1 = p1.y;
        this.y2 = p2.y;
    }

    public double length(){
        int a = Math.abs(this.x1 - this.x2);
        int b = Math.abs(this.y1 - this.y2);
        return Math.sqrt((a * a) + (b * b));
    }

    @Override
    public String toString() {
        return "Линия от {" +
                "x1=" + x1 +
                ", y1=" + y1 +
                "} до {x2=" + x2 +
                ", y2=" + y2 +
                '}';
    }
}
