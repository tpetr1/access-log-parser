public class ClosedPolyline extends Polyline {
    @Override
    public double length() {
        double sum = 0;
        for (int i = 0; i < this.arrayPoints.size() - 1; i++) {
            int a = Math.abs(this.arrayPoints.get(i).x - this.arrayPoints.get(i + 1).x);
            int b = Math.abs(this.arrayPoints.get(i).y - this.arrayPoints.get(i + 1).y);
            sum += Math.sqrt((a * a) + (b * b));
            if (i == this.arrayPoints.size() - 2){
                a = Math.abs(this.arrayPoints.get(0).x - this.arrayPoints.get(i + 1).x);
                b = Math.abs(this.arrayPoints.get(0).y - this.arrayPoints.get(i + 1).y);
                sum += Math.sqrt((a * a) + (b * b));
            }
        }
        return sum;
    }
}
