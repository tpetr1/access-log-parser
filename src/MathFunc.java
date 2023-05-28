public class MathFunc {
    public static int abs(int x) {
        if (x < 0)
            x = -x;
        return x;
    }

    public static int safeDiv(int x, int y) {
        if (y == 0) return 0;
        return x / y;
    }

    public static int max(int x, int y){
        if (x>=y) return x;
        return y;
    }
}
