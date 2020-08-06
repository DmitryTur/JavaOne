package ru.geekbrains.java1.lesson2;

public class TestMain {
    public static void main(String[] args) {
        int [][]arr = {{0,1,2,3}, {4,5,6,7}};
        print2DArray(arr);
    }
    public static void print2DArray(int[][] arr) {
        for (int i = 0; i <= arr[0].length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
