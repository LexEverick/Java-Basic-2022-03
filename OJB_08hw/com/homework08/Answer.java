package com.homework08;

//геттер для текста ответа, возможно флажок верный/неверный

public class Answer {

    StringBuilder answerText = new StringBuilder("\n");
    int rightAnswer = -1;
    boolean checkingTheAnswer (int answer) {
        return answer == rightAnswer;
    }

    public Answer(int rightAnswer) {
        this.rightAnswer = rightAnswer;
    }

    public StringBuilder getAnswerText() {
        return answerText;
    }

    public void setAnswerText(int questionNumber) {
        for (int i = 0; i < Test.answers[questionNumber].length; i++) {
            answerText.append(i+1).append(". ").append(Test.answers[questionNumber][i]).append("\n");
        }
        /*for (String tempString: Test.answers[questionNumber]) {
            answerText.append(1 + ". ").append(tempString).append("\n");
        }*/
    }
}
