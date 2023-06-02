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

    public static boolean equalNum(int x){
        while (x>0){
            int t = x % 10;
            x = x / 10;
            if (((x % 10) != t) && (x > 0)) return false;
        }
        return true;
    }

    public static void square(int x){
        for (int i = 0; i < x; i++){
            for(int j = 0; j < x; j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
