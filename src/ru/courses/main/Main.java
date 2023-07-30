package ru.courses.main;

import ru.courses.arithmetic.*;
import ru.courses.arithmetic.newtype.Fraction;
import ru.courses.arithmetic.newtype.Fraction2;
import ru.courses.arrayfunc.Arrays;
import ru.courses.character.CharToNum;
import ru.courses.character.IsUpperCase;
import ru.courses.geometry.*;
import ru.courses.arithmetic.mathfunc.MathFunc;
import ru.courses.student.Student;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //task 1
        System.out.println("Дробная часть числа: " + Fraction.fraction(4.898797897979899));
        //task 2
        System.out.println("Сумма 2х последних знаков числа: " + SumLastNums.sumLastNums(105667));
        //task 3
        System.out.println("Преобразование символа в цифру: " + CharToNum.charToNum('9'));
        //task 4
        System.out.println("Число положительное?: " + IsPositive.isPositive(9));
        System.out.println("Число положительное?: " + IsPositive.isPositive(-129));
        //task 5
        System.out.println("Число двузначное?: " + Is2Digits.is2Digits(9));
        System.out.println("Число двузначное?: " + Is2Digits.is2Digits(129));
        System.out.println("Число двузначное?: " + Is2Digits.is2Digits(99));
        //task 6
        System.out.println("Буква в верхнем регистре?: " + IsUpperCase.isUpperCase('Z'));
        System.out.println("Буква в верхнем регистре?: " + IsUpperCase.isUpperCase('d'));
        System.out.println("Буква в верхнем регистре?: " + IsUpperCase.isUpperCase('6'));
        //task 7
        System.out.println("Число входит в диапазон?: " + IsInRange.isInRange(4,7,7));
        System.out.println("Число входит в диапазон?: " + IsInRange.isInRange(4,7,3));
        System.out.println("Число входит в диапазон?: " + IsInRange.isInRange(4,7,8));
        //task 8
        System.out.println("Деление без остатка?: " + IsDivisor.isDivisor(4,8));
        System.out.println("Деление без остатка?: " + IsDivisor.isDivisor(10,8));
        System.out.println("Деление без остатка?: " + IsDivisor.isDivisor(10,5));
        //task 9
        System.out.println("Все числа равны?: " + IsEqual.isEqual(2,2,2));
        System.out.println("Все числа равны?: " + IsEqual.isEqual(2,6,2));
        System.out.println("Все числа равны?: " + IsEqual.isEqual(2,2,6));
        //task 10
        System.out.println("Сумма 5 чисел: "
                + lastNumSum(lastNumSum(lastNumSum(lastNumSum(5,11),123),14),1));
        //part2 task 1
        System.out.println("Модуль числа: " + MathFunc.abs(-3));
        System.out.println("Модуль числа: " + MathFunc.abs(6));
        //part2 task 2
        System.out.println("Результат деления X на Y: " + MathFunc.safeDiv(3,0));
        System.out.println("Результат деления X на Y: " + MathFunc.safeDiv(6,4));
        //part2 task 3
        System.out.println("Максимальное число и 2х: " + MathFunc.max(3,10));
        System.out.println("Максимальное число и 2х: " + MathFunc.max(6,4));
        //part2 task 4
        System.out.println("Больше, меньше, равно: " + MathFunc.makeDecision(3,10));
        System.out.println("Больше, меньше, равно: " + MathFunc.makeDecision(6,4));
        System.out.println("Больше, меньше, равно: " + MathFunc.makeDecision(6,6));
        //part2 task 5
        System.out.println("Максимальное из 3х: " + MathFunc.max3(3,10,16));
        System.out.println("Максимальное из 3х: " + MathFunc.max3(6,4, 2));
        System.out.println("Максимальное из 3х: " + MathFunc.max3(6,16, 3));
        //part2 task 6
        System.out.println("Сумма 2х равна 3му?: " + MathFunc.sum3(5,7,2));
        System.out.println("Сумма 2х равна 3му?: " + MathFunc.sum3(8,-1, 4));
        System.out.println("Сумма 2х равна 3му?: " + MathFunc.sum3(6,3, 3));
        //part2 task 7
        System.out.println("Сумма 2х: " + MathFunc.sum2(5,7));
        System.out.println("Сумма 2х: " + MathFunc.sum2(8,-1));
        //part2 task 8
        System.out.println("Число делится на 3 или на 5?: " + MathFunc.is35(5));
        System.out.println("Число делится на 3 или на 5?: " + MathFunc.is35(8));
        System.out.println("Число делится на 3 или на 5?: " + MathFunc.is35(15));
        //part2 task 9
        System.out.println("Результат magic6: " + MathFunc.magic6(5,7));
        System.out.println("Результат magic6: " + MathFunc.magic6(8,2));
        System.out.println("Результат magic6: " + MathFunc.magic6(1,6));
        //part2 task 10
        System.out.println("Age: " + MathFunc.age(5));
        System.out.println("Age: " + MathFunc.age(31));
        System.out.println("Age: " + MathFunc.age(102));
        System.out.println("Age: " + MathFunc.age(111));
        //part2 task 11
        System.out.println("Day: " + MathFunc.day(5));
        //part2 task 12
        MathFunc.printDays("вторник");
        MathFunc.printDays("пятн");
        //part 3 task 1
        System.out.println(Arrays.listNums(17));
        //part 3 task 2
        System.out.println(Arrays.reverseListNums(17));
        //part 3 task 3
        System.out.println(Arrays.chet(17));
        //part 3 task 4
        System.out.println(Arrays.pow(2,4));
        //part 3 task 5
        System.out.println(Arrays.numLen(1345345399));
        //part 3 task 6
        System.out.println(Arrays.equalNum(5555555));
        //part 3 task 7
        Arrays.square(5);
        //part 3 task 8
        Arrays.leftTriangle(5);
        //part 3 task 9
        Arrays.rightTriangle(20);
        //part 3 task 10
        //Arrays.guessGame();
        //part 4 task 1
        int [] arr = {1, 2, 3, 4, 2, 2, 5};
        System.out.println(Arrays.findFirst(arr, 2));
        //part 4 task 2
        System.out.println(Arrays.findLast(arr, 2));
        //part 4 task 3
        int [] arr2 = {1,-2,-7,4,2,2,5};
        System.out.println(Arrays.maxAbs(arr2));
        int [] arr22 = {-7,-5};
        System.out.println(Arrays.maxAbs(arr22));
        //part 4 task 4
        System.out.println(Arrays.countPositive(arr2));
        //part 4 task 5
        int [] arr3 = {1,-2,-7,-7,-2,1};
        System.out.println(Arrays.palindrom(arr2));
        System.out.println(Arrays.palindrom(arr3));
        //part 4 task 6
        System.out.println(java.util.Arrays.toString(arr));
        Arrays.reverse(arr);
        System.out.println(java.util.Arrays.toString(arr));
        //part 4 task 7
        System.out.println(java.util.Arrays.toString(arr));
        System.out.println(java.util.Arrays.toString(Arrays.reverseBack(arr)));
        //part 4 task 8
        System.out.println(java.util.Arrays.toString(arr) + " " + java.util.Arrays.toString(arr2));
        System.out.println(java.util.Arrays.toString(Arrays.concat(arr,arr2)));
        //part 4 task 9
        System.out.println(java.util.Arrays.toString(arr));
        System.out.println(java.util.Arrays.toString(Arrays.findAll(arr,2)));
        //part 4 task 10
        System.out.println(java.util.Arrays.toString(arr2));
        System.out.println(java.util.Arrays.toString(Arrays.deleteNegative(arr2)));
        //part 4 task 11
        System.out.println(java.util.Arrays.toString(arr2));
        System.out.println(java.util.Arrays.toString(Arrays.add(arr2,7,5)));
        //part 4 task 12
        System.out.println(java.util.Arrays.toString(arr2));
        int[] arr4 = {19,9,999};
        System.out.println(java.util.Arrays.toString(Arrays.add(arr2,arr4,5)));
      
        Fraction2 f1 = new Fraction2(1,3);
        Fraction2 f2 = new Fraction2(2,5);
        Fraction2 f3 = new Fraction2(7,8);
        System.out.println(f1.sum(f2).sum(f3).minus(5).toString());

        Student st = new Student("Иван");
        System.out.println(st.getEstimates());
        st.addEstimate(5);
        st.addEstimate(2);
        st.addEstimate(7);
        st.addEstimate(4);
        st.addEstimate(5);
        st.addEstimate(2);
        System.out.println(st.name + ": " +  st.getEstimates());
        ArrayList<Integer> ar = new ArrayList<>();
        ar.add(2);
        ar.add(5);
        ar.add(6);
        Student s2 = new Student("Рома", ar);
        System.out.println(s2.toString());
      
      
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

        ClosedPolyline polyl_closed = new ClosedPolyline();
        polyl_closed.setPoint(p1);
        polyl_closed.setPoint(p2);
        polyl_closed.setPoint(p3);
        polyl_closed.setPoint(p4);
        System.out.println(polyl_closed.length());

        System.out.println(l(polyl));
        System.out.println(l(polyl_closed));
        System.out.println(l(l1));

        System.out.println(new Fraction(12,17));

        System.out.println(sum(2, new Fraction(3,5), 2.3));
        System.out.println(sum(3.6, new Fraction(49,12), 3, new Fraction(3,2)));
        System.out.println(sum(new Fraction(1,3), 1));
    }

    public static int lastNumSum(int a, int b){
        return (a%10)+(b%10);
    }

    static double l(Lengthable lin){
        return lin.length();
    }

    static double sum(Number... numbers){
        double sum = 0;
        for (int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
            if (numbers[i].getClass() == Fraction.class){
                sum += (numbers[i].doubleValue());
            };
            if (numbers[i].getClass() == Integer.class){
                sum += (double) ((Integer)numbers[i]);
            };
            if (numbers[i].getClass() == Double.class){
                sum += (double) numbers[i];
            };
        }
        return sum;
    }
}

