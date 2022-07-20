package com.homework08;

public class QuestionsAndAnswers {

    Question questionOne = new Question() {
        @Override
        public void printQuestion() {
            System.out.println("Сколько будет 2+2?\n1. 2\n2. 22\n3. 4");
        }

        @Override
        public int rightAnswer() {
            return 3;
        }
    };

    Question questionTwo = new Question() {
        @Override
        public void printQuestion() {
            System.out.println("Какую форму имеет земля?\n1. Плоская\n2. Круглая\n3. Квадратная\n4. Шарообразная");
        }

        @Override
        public int rightAnswer() {
            return 4;
        }
    };

    Question questionThree = new Question() {
        @Override
        public void printQuestion() {
            System.out.println("Какого цвета синий кит?\n1. Белый\n2. Синий\n3. Голубой");
        }

        @Override
        public int rightAnswer() {
            return 2;
        }

    };
}
