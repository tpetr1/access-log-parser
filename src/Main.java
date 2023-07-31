import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int count = 1;
        int count_line, min_length, max_length;
        System.out.println("Случайное число от 0 до 1: " + Math.random());

        while (true){
            count_line = 0;
            min_length = Integer.MAX_VALUE;
            max_length = 0;
            String path = new Scanner(System.in).nextLine();
            File file = new File(path);
            boolean fileExists = file.exists();
            boolean isDirectory = file.isDirectory();
            if (!fileExists) {
                System.out.println("the file does not exist");
                continue;
            }
            if (isDirectory) {
                System.out.println("the file does not exist");
                continue;
            }
            System.out.println("The path is specified correctly");
            System.out.println("This is file number " + count++);

            try {
                FileReader fileReader = new FileReader(path);
                BufferedReader reader =
                        new BufferedReader(fileReader);
                String line;
                while ((line = reader.readLine()) != null) {
                    count_line++;
                    int length = line.length();
                    if (length > 1024) throw new IllegalMaxLengthLine("Maximum line length exceeds 1024 characters");
                    if (length < min_length) {
                        min_length = length;
                    }
                    if (length > max_length) {
                        max_length = length;
                    }
                }
                System.out.println("Count lines in file: " + count_line);
                System.out.println("Max length line: " + max_length);
                System.out.println("Min length line: " + min_length);
            } catch (Exception ex) {
                ex.printStackTrace();
            }

        }
    }

    static class IllegalMaxLengthLine extends RuntimeException{
        public IllegalMaxLengthLine(String s) {
            super(s);
        }
    }
}