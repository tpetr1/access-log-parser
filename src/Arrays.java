public class Arrays {
    public static String listNums(int x) {
        String res = "";
        for (int i = 0; i <= x;i++)
            res += i + " ";
        return res;
    }

    public static String reverseListNums(int x){
        String res = "";
        for (int i = x; i >= 0;i--)
            res += i + " ";
        return res;
    }

    public static String chet(int x){
        String res = "";
        for (int i = 0; i <= x;i+=2)
            res += i + " ";
        return res;
    }

    public static int pow(int x, int y){
        int res = 1;
        for(int i = 0; i < y; i++){
            res *= x;
        }
        return res;
    }

    public static int numLen(long x){
        int i;
        for (i=0; x > 0;i++){
            x /= 10;
        }
        return i;
    }
}
