import java.io.File;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        double sum = 0;
        for (int i = 0; i < args.length; i++) {
            try {
                sum += Double.parseDouble(args[i]);
            } catch (NumberFormatException ex){
                sum += 0;
            }
        }
        System.out.println(sum);
    }
}