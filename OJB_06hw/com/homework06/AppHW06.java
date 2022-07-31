package com.homework06;

import java.util.Scanner;

public class AppHW06
{
    public static void main(String[] args)
    {
        String[][] questionsAndAnswers = {
                {"Сколько будет 2+2?", "Какую форму имеет земля?", "Какого цвета синий кит?"},
                {"2", "22", "4"},
                {"Плоская", "Круглая", "Квадратная", "Шарообразная"},
                {"Белый", "Синий", "Голубой"}
        };
        int[] rightAnswers = {3, 4, 2};
        int countRightAnswers = 0;

        System.out.println("Java-Basic-2022-03\n06. Синтаксис Java\n\nТЕСТ");

        for (int i = 0; i < 3; i++) {
            System.out.println(questionsAndAnswers[0][i]);
            for(int j = 0; j < questionsAndAnswers[i+1].length; j++) {
                System.out.println((j + 1) + ". " + questionsAndAnswers[i+1][j]);
            }

            int userAnswer = 0;
            boolean currentRange;
            do {
                System.out.print("Введите ваш ответ (число от 1 до " + questionsAndAnswers[i+1].length + "): ");
                Scanner scannerConsole = new Scanner(System.in);
                if (scannerConsole.hasNextInt()) {
                    userAnswer = scannerConsole.nextInt();
                    if (userAnswer < 1 || userAnswer > questionsAndAnswers[i+1].length) {
                        System.out.println("Ваш ответ вне возможного диапозона.");
                        currentRange = false;
                    } else { currentRange = true;
                    }
                } else {
                    System.out.println("Вы ввели что-то не то =(");
                    scannerConsole.next();
                    currentRange = false;
                }
                System.out.println();
            } while (!currentRange);

            countRightAnswers += userAnswer == rightAnswers[i] ? 1 : 0 ;
        }

        if (countRightAnswers > 0) {
            System.out.println("Поздравляем!\nУ вас " + countRightAnswers + " правильных ответов и " + (3 - countRightAnswers) + " неправильных.");
        } else {
            System.out.println("Все пропало! У вас 0 правильных ответов.");
        }
    }
}