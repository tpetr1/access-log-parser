import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        int count = 1;
        int count_line, yandex_count, google_count;
        int max_allowed_len = 1024;
        System.out.println("Случайное число от 0 до 1: " + Math.random());

        while (true) {
            count_line = 0;
            yandex_count = 0;
            google_count = 0;
            //поиск файла по указанному пути
            String path = new Scanner(System.in).nextLine();
            File file = new File(path);
            boolean fileExists = file.exists();
            boolean isDirectory = file.isDirectory();
            //если файл не существует
            if (!fileExists) {
                System.out.println("the file does not exist");
                continue;
            }
            //если указана папка, а не файл
            if (isDirectory) {
                System.out.println("the file does not exist");
                continue;
            }
            System.out.println("The path is specified correctly");
            System.out.println("This is file number " + count++);
            Statistics s = new Statistics();

            try {
                //чтение файла построчно
                FileReader fileReader = new FileReader(path);
                BufferedReader reader =
                        new BufferedReader(fileReader);
                String line;
                while ((line = reader.readLine()) != null) {
                    count_line++;
                    String user_agent = null;
                    int length = line.length();
                    //исключение если длина строки в файле превышает значение max_allowed_len
                    if (length > max_allowed_len) throw
                            new IllegalMaxLengthLine("Maximum line length exceeds " + max_allowed_len + " characters");
                    LogEntry le = new LogEntry(line);
                    s.addEntry(le);
                    user_agent = le.user_agent;
                    int start_index = user_agent.indexOf("(");
                    int end_index = user_agent.indexOf(")");
                    if (start_index < 0 || end_index < 0) continue;
                    String firstBrackets = user_agent.substring(start_index + 1, end_index);
                    String[] parts = firstBrackets.split(";");
                    if (parts.length >= 2) {
                        String fragment = parts[1];
                        int index = fragment.indexOf("/");
                        if (index < 0) continue;
                        String botName = fragment.substring(1, index);
                        if (botName.equalsIgnoreCase("GoogleBot")) {
                            google_count++;
                        }
                        if (botName.equalsIgnoreCase("YandexBot")) {
                            yandex_count++;
                        }
                    }
                }

                System.out.println("Count lines in file: " + count_line);

                System.out.println("Share of requests GoogleBot: " + google_count * 100.0 / (double) count_line);
                System.out.println("Share of requests YandexBot: " + yandex_count * 100.0 / (double) count_line);
                System.out.println(s.getTrafficRate());
                System.out.println(s.getOsStatistic());
                System.out.println(s.getBrowserStatistic());
                System.out.println(s.getNonExistentPages());

            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    static class IllegalMaxLengthLine extends RuntimeException {
        public IllegalMaxLengthLine(String s) {
            super(s);
        }
    }
}