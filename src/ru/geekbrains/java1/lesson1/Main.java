package ru.geekbrains.java1.lesson1;

public class Main {
    public static void main(String[] args) {
        byte num = 127;
        short num1 = 502;
        int num3 = 1;
        long num4 = 1000000000L;
        float num5 = 14.18F;
        double num6 = 20.456D;
        char sym1 = 'P';
        boolean val = true;
        System.out.println(calculate(5,16,1,2));
        System.out.println(between10And20(15,5));
        posOrNeg(-5);
        System.out.println(negNum(-1));
        myName("Андрей, Ааандрююша");
        intercalaryYear(2005);
    }
    public static int calculate(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }
    public static boolean between10And20 (int a, int b) {
        if (a + b >= 10 && a + b <= 20)
            return true;
        else return false;
    }
    public static void posOrNeg (int a) {
        if (a>=0)
            System.out.println("Положительное число");
        else System.out.println("Отрицательное число");
    }
    public static boolean negNum(int a) {
        return a < 0;
    }
    public static void myName(String s) {
        System.out.println("Привет, " + s + "!");
    }
    public static void intercalaryYear(int a) {
        if (a % 400 == 0 || a % 400 > 0 && a % 100 > 0 && a % 4 == 0) {
            System.out.println("Високосный год");
        } else
            System.out.println("Не високосный год");
    }
}
