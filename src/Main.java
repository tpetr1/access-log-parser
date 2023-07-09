import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Fraction f1 = new Fraction(1,3);
        Fraction f2 = new Fraction(2,5);
        Fraction f3 = new Fraction(7,8);
        System.out.println(f1.sum(f2).sum(f3).minus(5).toString());

        Student s = new Student("Иван");
        System.out.println(s.getEstimates());
        s.addEstimate(5);
        s.addEstimate(2);
        s.addEstimate(7);
        s.addEstimate(4);
        s.addEstimate(5);
        s.addEstimate(2);
        System.out.println(s.name + ": " +  s.getEstimates());
        ArrayList<Integer> a = new ArrayList<>();
        a.add(2);
        a.add(5);
        a.add(6);
        Student s2 = new Student("Рома", a);
        System.out.println(s2.toString());

    }
}