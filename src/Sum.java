import java.util.Arrays;

public class Sum {
    public static void main(String[] args) {
        double sum = 0;
        String regex = "\\d+";
        for (int i = 0; i < args.length; i++) {
            if (args[i].matches(regex)) {
                sum += Double.parseDouble(args[i]);
            } else {
                sum += 0;
            }
        }
        System.out.println(sum);
    }
}