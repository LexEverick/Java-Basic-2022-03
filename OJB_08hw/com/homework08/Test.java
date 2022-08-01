package com.homework08;

/*passTest() - прохождение теста - показываем вопросы в цикле и выводим результат теста
1.проходимся по массиву вопросов, для каждого из них вызываем метод ask()
    1.1 проверяем возвращаемое значение метода ask: если вернулся true (пользователь правильно ответил на вопрос), то увеличиваем кол-во правильных ответов
    1.2 выполняем 1.1 для следующего вопроса
3. после прохождения всех вопросов отображаем пользователю итоговую статистику*/

import java.util.Scanner;

public class Test {

    public static final String[] questions = {"Сколько будет 2+2?", "Какую форму имеет земля?", "Какого цвета синий кит?"};
    public static final String[][] answers = {
            {"2", "22", "4"},
            {"Плоская", "Круглая", "Квадратная", "Шарообразная"},
            {"Белый", "Синий", "Голубой"}};
    public static final int[] rightAnswers = {3, 4, 2};
    private static int countRightAnswers = 0;

    static int runTest(){
        for (int i = 0; i < questions.length; i++) {
            Question question = new Question(questions[i]);
            question.setQuestionNumber(i);
            question.printQuestion(questions[i]);
            if (question.printAnswers()) { countRightAnswers++; }
        }
        return countRightAnswers;
    }

    static int writeAnswer(int questionNumber){
        int tempAnswer = -1;
        do {
            System.out.print("Введите номер ответа: ");
            tempAnswer = getNextNumber();
            if (tempAnswer < 1 || tempAnswer > answers[questionNumber].length) {
                System.out.println("\nВведите число в заданном диапазоне!\n");
            }
        } while (tempAnswer < 1 || tempAnswer > answers[questionNumber].length);
        System.out.println();
        return tempAnswer;
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
