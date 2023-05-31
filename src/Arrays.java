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
}
