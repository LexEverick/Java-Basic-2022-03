package com.homework08;

/*  boolean ask() - выводим текст вопроса и ответы на него,
    затем просим пользователя ввести ответ на него,
    после этого проверяем и сверяем с правильным.
    Если ответ верный, возвращаем true, иначе false.
        2.1 отображаем текст вопроса, ответы на него и запрашиваем ответ пользователю
        2.2 сравниваем ответ пользователя с правильным: если пользователь ответил правильно, то возвращаем true, иначе false.*/

public class Question {

    String question = "";
    int questionNumber = -1;

    public void setQuestionNumber(int questionNumber) {
        this.questionNumber = questionNumber;
    }

    public Question(String question) {
        this.question = question;
    }


    public void printQuestion (String question) {
            System.out.println(question);

    }
    public boolean printAnswers () {
        Answer answer = new Answer(Test.rightAnswers[questionNumber]);
        answer.setAnswerText(questionNumber);
        System.out.println(answer.getAnswerText());
        return answer.checkingTheAnswer(Test.writeAnswer(questionNumber));
    }


}
