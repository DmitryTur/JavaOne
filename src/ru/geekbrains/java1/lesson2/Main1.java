package ru.geekbrains.java1.lesson2;

public class Main1 {
    public static void main(String[] args) {
        int[] arr = {0,1,2,1,1,2,1,2,3};
        System.out.println(checkBalance(arr));
    }
    /*static boolean checkBalance(int[] arr) {
        boolean trueFalse = false;
        int sum = 0;
        int sumI = 0;
        int sumJ = 0;
        int result;

        for(int i =0;i < arr.length; i++) {
            sum += arr[i];
        }
        result = sum / 2;
        for (int i = 0, j = arr.length - 1; i < j; ++i, --j) {
            sumI += arr[i];
            sumJ += arr[i];
            if(sumJ == result || sumI == result)
                trueFalse = true;
            break;
        }
        return trueFalse;
    }
     */

    public static boolean checkBalance(int[] array) {
        int sumOfFirstPart = 0;
        System.out.println("Наш массив");
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for(int i = 0; i < array.length / 2; i++) {
            sumOfFirstPart += array[i];
        }
        int sumOfSecondPart = 0;
        for(int i = array.length / 2; i < array.length; i++) {
            sumOfSecondPart += array[i];
        }
        int cnt = array.length / 2;
        for(int i = 0; i < array.length; i++) {
            if(sumOfFirstPart > sumOfSecondPart) {
                sumOfFirstPart -= array[cnt];
                sumOfSecondPart += array[cnt];
                cnt--;
                if(sumOfFirstPart < sumOfSecondPart) {
                    return false;
                }
                else if(sumOfFirstPart == sumOfSecondPart) {
                    System.out.print("Если разделить массив после " + cnt + " элемента, ");
                    System.out.println("то получится ");
                    return true;
                }
            }
            else if(sumOfFirstPart < sumOfSecondPart) {
                sumOfFirstPart += array[cnt];
                sumOfSecondPart -= array[cnt];
                cnt++;
                if(sumOfFirstPart > sumOfSecondPart) {
                    return false;
                }
                else if(sumOfFirstPart == sumOfSecondPart) {
                    System.out.print("Если разделить массив после " + cnt + " элемента, ");
                    System.out.println("то получится ");
                    return true;
                }
            }
            else {
                System.out.print("Если разделить массив после " + cnt + " элемента, ");
                System.out.println("то получится ");
                return true;
            }
        }
        return true;
    }
}
