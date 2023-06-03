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

    public static void leftTriangle(int x){
        for (int i = x; i > 0; i--){
            for (int j = 0; j < i; j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public static void rightTriangle(int x){
        for (int i = 0; i < x; i++){
            for (int j = 0; j < x; j++){
                if (j>=(x-i-1))
                    System.out.print('*');
                else
                    System.out.print(' ');
            }
            System.out.println();
        }
    }

    public static void guessGame() {
        boolean ex = true;
        int i = 0;
        while (ex) {
            int randomNum = 3;
            java.util.Scanner sc = new java.util.Scanner(System.in);
            System.out.println("What number am I thinking (0 to 9)? :");
            int x = sc.nextInt();
            i++;
            if (x != randomNum) {
                System.out.println("No, try again");
            } else {
                System.out.println("Yes, it`s " + randomNum);
                ex = false;
            }
        }
        System.out.println("It took you " + i + " attempts");
    }

    public static int findFirst(int[] arr, int x){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static int findLast(int[] arr, int x){
        for (int i = arr.length-1; i >= 0; i--){
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

}
