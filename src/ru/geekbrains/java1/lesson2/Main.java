package ru.geekbrains.java1.lesson2;
import java.util.*;

public class Main<a> {

    public static void main(String[] args) {
//  task 1:
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else arr[i] = 1;
            System.out.print(arr[i] + " ");
        }
//        ============================================================
        System.out.println("");
        fillArray();
        changeArray();
        fillDiagonal();
        arrayMinMax();
        int[] arr1 = {0,1,1,2,2,1,1,2,1,1};
        checkBalance(arr1);
        int []arr2 = {2,4,6,8,10,12};
        moveNumbersOfArray(arr2, 3);
//        =============================================================
    }

    //  task 2:
    public static void fillArray() {
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 3;
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    //  task 3:
    public static void changeArray() {
        int[] w = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < w.length; i++) {
            if (w[i] < 6)
                w[i] *= 2;
            System.out.print(w[i] + " ");
        }
        System.out.println("");
    }

    //  task 4:
    public static void fillDiagonal() {
        int[][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j == i) {
                    arr[i][j] = 1;
                }
                if (j + i == arr.length - 1)
                    arr[i][j] = 1;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
    }

    //    task 5:
    public static void arrayMinMax() {
        int[] arr = {11, -11, 0, -1, 1, 2, 1, 1, -10, 5};
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        System.out.println("Минимум = " + min + " " + "Максимум = " + max);
    }

    //    task 6:
    public static boolean checkBalance(int[] arr) {
        boolean a = false;
        int sum1 = 0;
        int sum2 = 0;
        for (int w = 0; w < arr.length; w++){
            sum1 += arr[w];
        }
        for (int j = 0; j < arr.length; j++) {
            sum1 -= arr[j];
            sum2 += arr[j];
            if(sum1 == sum2) {
                a = true;
                break;
            }
        }
        System.out.println(a);
        return a;
    }
//    task 7:
        public static void moveNumbersOfArray(int[] arr, int n) {

            System.out.println("Решение придумал, но не хватило времени на реализацию......(((((");
        }
}
//      2, 4, 6, 8, 10, 12
//      0  1  2  3   4   5