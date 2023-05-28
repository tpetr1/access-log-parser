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
    public static String makeDecision(int x, int y){
        if (x>y) return x + " > " + y;
        if (x<y) return x + " < " + y;
        return x + " == " + y;
    }

    public static int max3(int x, int y, int z){
        if ((x <= y) && (y > z)) return y;
        if ((x <= z) && (y < z)) return z;
        return x;
    }

    public static boolean sum3(int x, int y, int z){
        return (((x+y) == z) || (x==(y+z)) || ((x+z)==y));
    }

    public static int sum2(int x, int y){
        if ((x + y) >= 10 && (x + y) <= 19) return 20;
        return x+y;
    }

    public static boolean is35(int x){
        if ((x % 5 == 0) && (x % 3 == 0)) return false;
        return (x % 5 == 0) || (x % 3 == 0);
    }

    public static boolean magic6(int x, int y){
        return x == 6 || y == 6 || (x + y) == 6 || (x - y) == 6 || (y - x) == 6;
    }
}
