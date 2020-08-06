package ru.geekbrains.java1.lesson3;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//     gameOfNumbers();
        gameOfWords();
    }

    /**
     * 1. Написать программу, которая загадывает случайное число от 0 до 9, и пользователю дается 3 попытки угадать это число.
     * При каждой попытке компьютер должен сообщить больше ли указанное пользователем число чем загаданное, или меньше.
     * После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
     */
    public static void gameOfNumbers() {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        int repeat = 0;
        int oneOrtwo;
        do {
            int counter = 0;
            int randomNumber = random.nextInt(10);
            System.out.println("Введите число от 0 до 9: ");
            while (counter < 3) {
                int userNumber = scan.nextInt();
                if (userNumber >= 0 && userNumber < 10) {
                    if (userNumber > randomNumber) {
                        System.out.println("Загаданное число меньше");
                    }
                    if (userNumber < randomNumber) {
                        System.out.println("Загаданное число больше");
                    }
                    if (userNumber == randomNumber) {
                        System.out.println("Вы выиграли!!!");
                        break;
                    }
                    counter++;
                    if (counter == 3) {
                        System.out.println("Вы проиграли!");
                        break;
                    }
                } else {
                    System.out.println("Ваше число не входит в диапазон от 0 до 9!");
                    System.out.println("Вы проиграли!");
                    break;
                }
            }
            System.out.println("Хотите сыграть еще раз? «1 – да / 0 – нет»");
            while (true) {
                oneOrtwo = scan.nextInt();
                if (oneOrtwo == 1) {
                    repeat = 1;
                    break;
                } else if (oneOrtwo == 0) {
                    repeat = 0;
                    break;
                } else System.out.println("Вы должны ввести \"1\" или \"0\"!");
            }
        }
        while (repeat == 1);
    }

    /**
     * При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
     * сравнивает его с загаданным словом и сообщает правильно ли ответил пользователь. Если слово не угадано, компьютер показывает буквы которые стоят на своих местах.
     * apple – загаданное
     * apricot - ответ игрока
     * ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
     * Для сравнения двух слов посимвольно, можно пользоваться:
     * String str = "apple";
     * str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
     * Играем до тех пор, пока игрок не отгадает слово
     * Используем только маленькие буквы
     */
    public static void gameOfWords() {
        System.out.println("Игра называется - \"Отгадай фрукт\"");

        String[] wordsArray = {"apple", "orange", "lemon", "banana", "apricot",
                "avocado", "broccoli", "carrot", "cherry", "garlic",
                "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
                "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

        Random random = new Random();
        String hiddenWord = wordsArray[random.nextInt(wordsArray.length - 1)];
        System.out.println("Введите слово:");
        Scanner scan = new Scanner(System.in);

        while (true) {
            String enteredWord = scan.nextLine();
            if (hiddenWord.equals(enteredWord)) {
                System.out.println("Загаданное слово: " + "\"" + hiddenWord + "\"");
                System.out.println("Вы выиграли");
                break;

            } else if (hiddenWord.charAt(0) == enteredWord.charAt(0) && hiddenWord.length() >= enteredWord.length()) {
                for (int j = 0; j < enteredWord.length(); j++) {
                    if (hiddenWord.charAt(j) == enteredWord.charAt(j)) {
                        System.out.print(hiddenWord.charAt(j));
                    }
                }
                System.out.println("###########");
            } else if (hiddenWord.charAt(0) == enteredWord.charAt(0) && hiddenWord.length() <= enteredWord.length()) {
                for (int j = 0; j < hiddenWord.length(); j++) {
                    if (hiddenWord.charAt(j) == enteredWord.charAt(j)) {
                        System.out.print(hiddenWord.charAt(j));
                    }
                }
                System.out.println("###########");
            } else
                System.out.println("Вы не угадали первую букву!");
            System.out.println("Попробуйте еще раз:");
        }
    }
}