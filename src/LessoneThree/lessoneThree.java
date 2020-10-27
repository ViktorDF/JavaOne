package LessoneThree;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class lessoneThree {
    //task 1
    public static void guessNumber() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        do {
            int rundNum = random.nextInt(10);
            System.out.println("Угадайте загаданное число. У вас есть 3 попытки");
            for (int i = 0; i < 3; i++) {
                System.out.print("Введите свое число: ");
                int userNum = scanner.nextInt();
                System.out.println();
                if (userNum == rundNum) {
                    System.out.println("Вы угадали число");
                    break;
                }
                if (userNum > rundNum) {
                    System.out.println("Введенное число больше");
                } else System.out.println("Введенное число меньше");
                if (i == 2) {
                    System.out.println("Вы проиграли");
                }
            }
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
        }
        while (scanner.nextInt() == 1);
    }

    //task 2
    public static void guessWord() {
        Random random = new Random();
        String[] words = {"apple", "orange", "lemon", "banana",
                "apricot", "avocado", "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom",
                "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        System.out.println("Загаданные слова:");
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i] + " ");
        }
        int idWord = random.nextInt(words.length - 1);
        String  conceivedWord = words[idWord];
        System.out.println("Попробуйте угадать загаднное слово из списка выше. Я буду подсказывать;)");
        Scanner scanner = new Scanner(System.in);
        String answerUser;
        do{
            System.out.println("Введи свой ответ: ");
            answerUser = scanner.nextLine();
            for (int i = 0; i < 15; i++) {
                if(i < conceivedWord.length() && i < answerUser.length()
                && conceivedWord.charAt(i) == answerUser.charAt(i)){
                    System.out.print(conceivedWord.charAt(i));
                } else if (conceivedWord.equals(answerUser)){
                    System.out.print("");
                } else System.out.print("#");
            }
            System.out.println();
        } while (!conceivedWord.equals(answerUser));
        System.out.println("Поздравляю! Вы угадали!");
    }

    public static void main(String[] args) {
        // task 1
        guessNumber();
        // task 2
        guessWord();
    }
}
