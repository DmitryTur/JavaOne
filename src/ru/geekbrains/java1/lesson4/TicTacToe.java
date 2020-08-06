package ru.geekbrains.java1.lesson4;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        start();
    }

    static void start() {
        final char playerSign = 'X';
        final char computerSign = 'Y';

        char[][] field = initField();
        String winnerName;

        drawField(field);

        while (true) {
            doPlayerMove(field, playerSign);

            drawField(field);

            if (checkDraw(field)) {
                System.out.println("DRAW");
                break;
            }

            doAIMove(field, computerSign);

            drawField(field);
            if (checkWin(field, playerSign)) {
                winnerName = "Player";
                System.out.println("Sir, congratulations!");
                System.out.println("You are winner Mr. " + winnerName);
                break;
            }
            if (checkWin(field, computerSign)) {
                winnerName = "Computer";
                System.out.println("Sir, congratulations!");
                System.out.println("You are winner Mr. " + winnerName);
                break;
            }
        }
    }

    static void doAIMove(char[][] field, char sign) {
        Random random = new Random();
        System.out.println("Computer's move...");
        // Вводим координаты Х, Y
        int xVal = random.nextInt(3);
        int yVal = random.nextInt(3);

        // Если значение по координатам занято, то делаем перегенерацию координат, пока не найдем свободные
        while (field[xVal][yVal] != '-') {
            xVal = random.nextInt(3);
            yVal = random.nextInt(3);
        }

        System.out.println(String.format("Computer's X-value: %s", xVal));
        System.out.println(String.format("Computer's Y-value: %s", yVal));

        field[xVal][yVal] = sign;
    }


    static void doPlayerMove(char[][] field, char sign) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Sir, you move...");
        // Вводим координаты Х, Y
        System.out.println("Please enter X-value [1-3]");
        int xVal = scanner.nextInt() - 1;
        System.out.println("Please enter Y-value [1-3]");
        int yVal = scanner.nextInt() - 1;
// TODO проверка на диапазон значений, чтобы не выйти за пределы массива

        while (xVal < 0 || xVal >= 3 || yVal < 0 || yVal >= 3) {
                System.out.println("is out of array");
                System.out.println("Please enter X-value [1-3]");
                xVal = scanner.nextInt() - 1;
                System.out.println("Please enter Y-value [1-3]");
                yVal = scanner.nextInt() - 1;
            }

        // Если значение по координатам занято, то повторяем ввод координат, пока не найдем свободные
        while (field[xVal][yVal] != '-') {
            System.out.println(String.format("Field[%s][%s] is already occupied", xVal + 1, yVal + 1));
            System.out.println("Please enter X-value [1-3]");
            xVal = scanner.nextInt() - 1;

            System.out.println("Please enter Y-value [1-3]");
            yVal = scanner.nextInt() - 1;
        }

        field[xVal][yVal] = sign;
    }

    // Проверка победы

    static boolean checkWin(char[][] field, char sign) {
        // По горизонтали
        for (int i = 0; i < field.length; i++) {
            if (field[i][0] == sign && field[i][1] == sign && field[i][2] == sign) {
                return true;
            }
// TODO По вертикали
            else if (field[0][i] == sign && field[1][i] == sign && field[2][i] == sign) {
                return true;
            }
        }
// TODO По диагонали
        if (field[0][0] == sign && field[1][1] == sign && field[2][2] == sign) {
            return true;
        } else return field[0][2] == sign && field[1][1] == sign && field[2][0] == sign;
    }

    static boolean checkDraw(char[][] field) {
        int count = 9;
        boolean a = false;
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                if (field[i][j] != '-') {
                    count--;
                }
            }
        }
        if (count < 1)
            a = true;
        return a;
    }

    // Отрисовка поля как матрицы
    static void drawField(char[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j]);
            }
            System.out.println();
        }
    }

    static char[][] initField() {
        return new char[][]{
                {'-', '-', '-'},
                {'-', '-', '-'},
                {'-', '-', '-'},
        };
    }
}
