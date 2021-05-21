package lesson3;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    private static final String[] words =
            {"apple", "orange", "lemon", "banana", "apricot",
                    "avocado", "broccoli", "carrot", "cherry",
                    "garlic", "grape", "melon", "leak", "kiwi",
                    "mango", "mushroom", "nut", "olive", "pea",
                    "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

    public static void main(String[] args) {

//        guessTheNumber(3, 0, 9);
        guessTheWord(15, '#');
        scanner.close();
    }

    private static void guessTheNumber(int numberOfAttempts, int min, int max) {
        int hiddenNumber = generateRandomNumber(min, max);
        int countingAttempts = 0;
        while (countingAttempts < numberOfAttempts) {
            System.out.printf("Угадайте число от %d до %d\n", min, max);
            int userAnswer = scanner.nextInt();
            countingAttempts++;
            if (userAnswer < hiddenNumber && countingAttempts < numberOfAttempts){
                System.out.println("Загаданное число больше.");
            } else if (userAnswer > hiddenNumber && countingAttempts < numberOfAttempts) {
                System.out.println("Загаданное число меньше.");
            } else if (userAnswer == hiddenNumber){
                System.out.println("Поздравляем, Вы угадали!");
                break;
            } else {
                System.out.printf("К сожалению, Вы проиграли.\nБыло загадано число %d.\n", hiddenNumber);
                break;
            }
        }

        System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
        int userAnswer = scanner.nextInt();
        if (userAnswer == 1) {
            guessTheNumber(numberOfAttempts, min, max);
        } else {
            System.out.println("Приходите ещё!\n");
        }
    }

    private static void guessTheWord(int encryptedLength, char encryptionChar) {
        String hiddenWord = encryptingTheString(words[generateRandomNumber(0, words.length - 1)].toLowerCase(Locale.ROOT), encryptedLength, encryptionChar);
        System.out.println("Попробуйте угадать загаданное мной слово :-)");
        scanner.nextLine();
        String userAnswer = encryptingTheString(scanner.nextLine().toLowerCase(Locale.ROOT), encryptedLength, encryptionChar);
        String managedAnswer;
        int numberOfGuessedLetters;
        while(!userAnswer.equals(hiddenWord)) {
            managedAnswer = "";
            numberOfGuessedLetters = 0;
            for (int i = 0; i < userAnswer.length(); i++) {
                if (userAnswer.charAt(i) != hiddenWord.charAt(i) || userAnswer.charAt(i) == encryptionChar) {
                    managedAnswer += encryptionChar;
                } else {
                    managedAnswer += userAnswer.charAt(i);
                    numberOfGuessedLetters++;
                }
            }
            if (numberOfGuessedLetters == 0) {
                System.out.println("Пока что Вы не отгадали ни одной буквы, попробуйте ещё раз!");
            } else
            System.out.printf("Вы отгадали %d букв.\nПродолжайте в том же духе!\n%s\n", numberOfGuessedLetters, managedAnswer);
            userAnswer = encryptingTheString(scanner.nextLine().toLowerCase(Locale.ROOT), encryptedLength, encryptionChar);
        }
            System.out.println("Поздравляем, Вы верно отгадали слово!");
    }

    private static int generateRandomNumber(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }

    private static String encryptingTheString (String encryptedString, int desiredLength, char encryptionChar) {
        while (encryptedString.length() < desiredLength) {
            encryptedString += encryptionChar;
        }
        return encryptedString;
    }
}