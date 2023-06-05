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
        for (int i = 0; i < x; i++){
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

    public static int maxAbs(int[] arr){
        int max = arr[0];
        int idx = 0;
        for (int i = 0; i < arr.length; i++){
            int t = arr[i];
            if (t < 0) {
                t *= -1;
            }
            if (t > max){
                max = t;
                idx = i;
            }
        }
        return arr[idx];
    }

    public static int countPositive(int[] arr){
        int count = 0;
        for (int i = 1; i < arr.length; i++){
            if (arr[i] > 0) {
               count++;
            }
        }
        return count;
    }

    public static boolean palindrom(int[] arr){
        for (int i=0,j=arr.length-1;i<=j;i++,j--){
            if (arr[i]!=arr[j]) return false;
        }
        return true;
    }

    public static void reverse(int[] arr){
        int[] temp = new int[arr.length];
        System.arraycopy(arr, 0, temp, 0, arr.length);
        for (int i = 0, j = temp.length-1; i < temp.length; i++, j--){
            arr[i] = temp[j];
        }
    }

    public static int[] reverseBack(int[] arr){
        int[] temp = new int[arr.length];
        for (int i = 0, j = temp.length-1; i < temp.length; i++, j--){
            temp[i] = arr[j];
        }
        return temp;
    }

    public static int[] concat(int[] arr1, int[] arr2){
        int[] temp = new int[arr1.length+arr2.length];
        boolean f = true;
        int i = 0;
        while (f){
            if (i < arr1.length) {
                temp[i] = arr1[i];
            }
            if (i >= arr1.length) {
                temp[i] = arr2[i - arr1.length];
            }
            if (i == (arr1.length+arr2.length-1))
                f = false;
            i++;
        }
        return temp;
    }

    public static int[] findAll(int[] arr, int x){
        int[] temp = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == x)
                temp[j++] = i;
        }
        int[] res = new int[j];
        for (int i = 0; i < j; i++){
            res[i] = temp[i];
        }
        return res;
    }

    public static int[] deleteNegative(int[] arr){
        int[] temp = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] >= 0)
                temp[j++] = arr[i];
        }
        int[] res = new int[j];
        for (int i = 0; i < j; i++){
            res[i] = temp[i];
        }
        return res;
    }

    public static int[] add(int[] arr, int x, int pos){
        int[] temp = new int[arr.length+1];
        for (int i = 0; i < arr.length+1; i++){
            if (i < pos)
                temp[i] = arr[i];
            if (i == pos)
                temp[i] = x;
            if (i > pos)
                temp[i] = arr[i-1];
        }
        return temp;
    }

    public static int[] add(int[] arr, int[] ins, int pos){
        int[] temp = new int[arr.length+ins.length];
        for (int i = 0; i < temp.length; i++){
            if (i < pos)
                temp[i] = arr[i];
            if ((i >= pos) && (i < (pos + ins.length)))
                temp[i] = ins[i-pos];
            if (i >= (pos + ins.length))
                temp[i] = arr[i-ins.length];
        }
        return temp;

    }
}
