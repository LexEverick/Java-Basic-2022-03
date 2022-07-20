import java.util.Scanner;

public class AppHW06
{
    public static void main(String[] args)
    {
        System.out.println("Java-Basic-2022-03\n06. Синтаксис Java\n\nТЕСТ");

        Scanner input = new Scanner(System.in);

        String[][] questionsAndAnswers = {
                {"Сколько будет 2+2?", "Какую форму имеет земля?", "Какого цвета синий кит?"},
                {"2", "22", "4"},
                {"Плоская", "Круглая", "Квадратная", "Шарообразная"},
                {"Белый", "Синий", "Голубой"}
        };

        int count = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println(questionsAndAnswers[0][i]);

            for(int j = 0; j < questionsAndAnswers[i+1].length; j++) {
                System.out.println((j + 1) + ". " + questionsAndAnswers[i+1][j]);
            }
            System.out.print("Введите ваш ответ (число от 1 до " + questionsAndAnswers[i].length + "): ");

            int answer = 0;
            if (input.hasNextInt()) {
                answer = input.nextInt();
                if (answer < 1 || answer > questionsAndAnswers[i+1].length) {
                    System.out.println("Ваш ответ вне возможного диапозона.");
                } else {
                    switch (i+1) {
                        case 1: if (answer == 3) count++; break;
                        case 2: if (answer == 4) count++; break;
                        case 3: if (answer == 2) count++; break;
                    }
                }
            } else {
                System.out.println("Вы ввели что-то не то =(");
                input.next();
            }
            System.out.println();
        }
        if (count > 0) {
            System.out.println("Поздравляем!\nУ вас " + count + " правильных ответов и " + (3 - count) + " неправильных.");
        } else {
            System.out.println("Все пропало! У вас 0 правильных ответов.");
        }
    }
}