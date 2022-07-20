package com.homework08;

import java.util.Scanner;

public class AppHW08
{
    public static void main(String[] args)
    {
        System.out.println("Java-Basic-2022-03\n08. Java синтаксис\n\nТЕСТ");

        int count = 0;

        QuestionsAndAnswers questionsAndAnswers = new QuestionsAndAnswers();

        questionsAndAnswers.questionOne.printQuestion();
        if (questionsAndAnswers.questionOne.rightAnswer() == writeAnswer()) {
            count++;
        }
        questionsAndAnswers.questionTwo.printQuestion();
        if (questionsAndAnswers.questionTwo.rightAnswer() == writeAnswer()) {
            count++;
        }
        questionsAndAnswers.questionThree.printQuestion();
        if (questionsAndAnswers.questionThree.rightAnswer() == writeAnswer()) {
            count++;
        }

        if (count > 0) {
            System.out.println("Поздравляем!\nУ вас " + count + " правильных ответов и " + (3 - count) + " неправильных.");
        } else {
            System.out.println("Все пропало! У вас 0 правильных ответов.");
        }

    }

    static int writeAnswer(){
        int temp = -1;
        do {
            System.out.print("Введите номер ответа: ");
            temp = getNextNumber();
        } while (temp < 1 || temp > 4);
        System.out.println();
        return temp;
    }

    private static int getNextNumber() {

        try {
            return Integer.parseInt(getNextLine());
        } catch (NumberFormatException nfe) {
            System.out.println("\nЧто-то пошло не так =(\nВведите число в заданном диапазоне!\n");
        }
        return -1;
    }

    private static String getNextLine() {

        return new Scanner(System.in).nextLine();

    }

}