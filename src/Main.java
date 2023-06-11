import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Point a;
        System.out.println(a = new Point(1,3));
        Point b;
        System.out.println(b = new Point(1,3));
        Point c;
        System.out.println(c = new Point(5,8));
        System.out.println(a == b);
        System.out.println(b == c);
    }
}