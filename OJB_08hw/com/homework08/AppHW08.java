package com.homework08;

import java.util.Scanner;

public class AppHW08
{
    public static void main(String[] args)
    {
        System.out.println("Java-Basic-2022-03\n08. Java синтаксис\n\nТЕСТ");

        Test test = new Test();

        int countRightAnswers =  Test.runTest();

        if (countRightAnswers > 0) {
            System.out.println("Поздравляем!\nУ вас " + countRightAnswers + " правильных ответов и " + (3 - countRightAnswers) + " неправильных.");
        } else {
            System.out.println("Все пропало! У вас 0 правильных ответов.");
        }

    }
}