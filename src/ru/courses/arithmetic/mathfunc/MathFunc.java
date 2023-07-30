package ru.courses.arithmetic.mathfunc;

public class MathFunc {
    public static int abs(int x) {
        if (x < 0)
            x = -x;
        return x;
    }

    public static int safeDiv(int x, int y) {
        if (y == 0) return 0;
        return x / y;
    }

    public static int max(int x, int y) {
        if (x >= y) return x;
        return y;
    }

    public static String makeDecision(int x, int y) {
        if (x > y) return x + " > " + y;
        if (x < y) return x + " < " + y;
        return x + " == " + y;
    }

    public static int max3(int x, int y, int z) {
        if ((x <= y) && (y > z)) return y;
        if ((x <= z) && (y < z)) return z;
        return x;
    }

    public static boolean sum3(int x, int y, int z) {
        return (((x + y) == z) || (x == (y + z)) || ((x + z) == y));
    }

    public static int sum2(int x, int y) {
        if ((x + y) >= 10 && (x + y) <= 19) return 20;
        return x + y;
    }

    public static boolean is35(int x) {
        if ((x % 5 == 0) && (x % 3 == 0)) return false;
        return (x % 5 == 0) || (x % 3 == 0);
    }

    public static boolean magic6(int x, int y) {
        return x == 6 || y == 6 || (x + y) == 6 || (x - y) == 6 || (y - x) == 6;
    }

    public static String age(int x) {
        switch (x % 10) {
            case 1:
                if (x % 100 != 11) return x + " год";
                break;
            case 2, 3, 4:
                if (x % 100 != 12)
                    if (x % 100 != 13)
                        if (x % 100 != 14) return x + " года";
                break;
            default:
                break;
        }
        return x + " лет";
    }

    public static String day(int x) {
        switch (x) {
            case 1 -> {
                return "понедельник";
            }
            case 2 -> {
                return "вторник";
            }
            case 3 -> {
                return "среда";
            }
            case 4 -> {
                return "четверг";
            }
            case 5 -> {
                return "пятница";
            }
            case 6 -> {
                return "суббота";
            }
            case 7 -> {
                return "воскресенье";
            }
            default -> {
            }
        }
        return "Это не день недели";
    }

    public static void printDays(String x) {
        switch (x) {
            case "понедельник":
                System.out.println("понедельник");
            case "вторник":
                System.out.println("вторник");
            case "среда":
                System.out.println("среда");
            case "четверг":
                System.out.println("четверг");
            case "пятница":
                System.out.println("пятница");
            case "суббота":
                System.out.println("суббота");
            case "воскресенье":
                System.out.println("воскресенье");
                break;
            default:
                System.out.println("Это не день недели");
                break;
        }

    }

}
