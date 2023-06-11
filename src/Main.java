import javax.sound.midi.Soundbank;
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

        /*Линия 1 начиналась в Точке  {1;3} и кончалась в Точке {5;8}.
        Линия 2 начиналась в Точке {10;11} и кончалась в Точке {15;19}
        Линия 3 начиналась в Точке конца Линии 1, а кончалась в Точке начала Линии 2
*/
        Line l1 = new Line(a,c);
        Point d;
        Line l2 = new Line(d = new Point(10,11),c);
        Line l3 = new Line(c,d);
/*        Используя эти объекты, выполните следующее:
        Выведите текстовое представление Линии 3 на экран
        Сдвиньте начало и конец Линии 3 таким образом, чтобы изменились все три объекта Линии
        Выведите текстовое представление Линии 3 на экран после изменения её состояния
        Рассчитайте суммарную длину всех трех линий и выведите её на экран*/
        System.out.println(l3.toString());
        c = new Point(3,4);
        d = new Point(13, 14);
        l3 = new Line(c,d);
        System.out.println(l3.toString());
        System.out.println(l1.length() + l2.length() + l3.length());
    }
}