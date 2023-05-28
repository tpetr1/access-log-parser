public class Main {
    public static void main(String[] args) {
        //task 1
        System.out.println("Дробная часть числа: " + Fraction.fraction(4.898797897979899790));
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
        System.out.println("Age: " + MathFunc.age(44));
        System.out.println("Age: " + MathFunc.age(111));
        //part2 task 11
        System.out.println("Day: " + MathFunc.day(5));
        //part2 task 12
        MathFunc.printDays("вторник");
        MathFunc.printDays("пятн");
    }

    public static int lastNumSum(int a, int b){
        return (a%10)+(b%10);
    }

}