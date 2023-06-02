import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int count = 1;
        System.out.println("Случайное число от 0 до 1: " + Math.random());

        while (true){
            String path = new Scanner(System.in).nextLine();
            File file = new File(path);
            boolean fileExists = file.exists();
            boolean isDirectory = file.isDirectory();
            if (fileExists || isDirectory) {
                System.out.println("the file does not exist");
                continue;
            }
            System.out.println("The path is specified correctly");
            System.out.println("This is file number " + count++);
        }
    }
}