import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Введите первое число: ");
        int number1 = new Scanner(System.in).nextInt();
        System.out.println("Введите второе число: ");
        int number2 = new Scanner(System.in).nextInt();
        //сумма
        int sum = number1 + number2;
        System.out.println("Сумма чисел: " + sum);
        //разность
        int diff = number1 - number2;
        System.out.println("Разность чисел: " + diff);
        //произведение
        int multi = number1 * number2;
        System.out.println("Произведение чисел: " + multi);
        //частное
        double quo = (double) number1 / number2;
        System.out.println("Частное чисел: " + quo);
    }
}