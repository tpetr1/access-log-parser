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
    }

    public static int lastNumSum(int a, int b){
        return (a%10)+(b%10);
    }

}