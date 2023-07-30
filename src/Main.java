import javax.sound.midi.Soundbank;
import java.io.File;
import java.util.ArrayList;
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
        l3.point1.x = 3;
        l3.point1.y = 4;
        l3.point2.x = 13;
        l3.point2.y = 14;
        System.out.println(l3.toString());
        System.out.println(l2.toString());
        System.out.println(l1.toString());
        System.out.println(l1.length() + l2.length() + l3.length());

       // Создать Ломаную, проходящую через точки {1;5}, {2;8}, {5;3}, {8,9}
        Point p1 = new Point(1,5);
        Point p2 = new Point(2,8);
        Point p3 = new Point(5,3);
        Point p4 = new Point(8,9);
        Polyline polyl;
        polyl = new Polyline();
        polyl.setPoint(p1);
        polyl.setPoint(p2);
        polyl.setPoint(p3);
        polyl.setPoint(p4);
        //Рассчитать длину Ломаной
        System.out.println(polyl.length());
        //Получить у Ломаной массив Линий
        System.out.println(polyl.toLine().toString());
        //Рассчитать длину массива Линий
        double s = 0;
        for (int i =  0; i < polyl.toLine().size(); i++) {
            s += polyl.toLine().get(i).length();
        }
        //Сравнить длину Ломаной и массива Линий: они должны совпасть
        System.out.println(s == polyl.length());
        //Сдвинуть координату Точки {2,8} таким образом, чтобы она стала иметь значение {12,8}. Если изменения отразились в данной точке, в Ломаной и в двух Линиях массива (из пункта 3), то задача решена верно
        p2 = new Point(12,8);
        polyl.changePoint(1,p2);
        System.out.println(polyl.getPoint(1));
        System.out.println(polyl.toLine());
        System.out.println(polyl);

        Point3D p3d = new Point3D(1,5,2);
        System.out.println(p3d);

    }
}