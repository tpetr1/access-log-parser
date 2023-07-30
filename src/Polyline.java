import java.util.ArrayList;

public class Polyline implements Lengthable {
    ArrayList<Point> arrayPoints  = new ArrayList<>();

    public Polyline() {
    }

    public void setArrayPoints(ArrayList<Point> arrayPoints) {
        this.arrayPoints = arrayPoints;
    }

    public void setPoint(Point point) {
        this.arrayPoints.add(point);
    }

    public void setPointByIndex(Point point, int idx) {
        this.arrayPoints.add(idx, point);
    }

    public Point getPoint(int idx) {
        return arrayPoints.get(idx);
    }

    public void changePoint(int idx, Point point){
        this.arrayPoints.set(idx,point);
    }

    public double length() {
        double sum = 0;
        for (int i = 0; i < this.arrayPoints.size() - 1; i++) {
            int a = Math.abs(this.arrayPoints.get(i).x - this.arrayPoints.get(i + 1).x);
            int b = Math.abs(this.arrayPoints.get(i).y - this.arrayPoints.get(i + 1).y);
            sum += Math.sqrt((a * a) + (b * b));
        }
        return sum;
    }

    public ArrayList<Line> toLine() {
        ArrayList<Line> arrayLine = new ArrayList<>();
        for (int i = 0; i < this.arrayPoints.size() - 1; i++) {
            arrayLine.add(new Line(this.arrayPoints.get(i).x,
                    this.arrayPoints.get(i + 1).x,
                    this.arrayPoints.get(i).y,
                    this.arrayPoints.get(i + 1).y));
        }
        return arrayLine;
    }

    @Override
    public String toString() {
        return "Линия " + arrayPoints;
    }
}
