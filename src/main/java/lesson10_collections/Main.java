package lesson10_collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Main {

    private static final String[] wordsArray = {"Машина", "Самолёт", "Трактор", "Машина", "Поезд", "Машина", "Велосипед", "Самокат",
            "Спорткар", "Трактор", "Трамвай", "Троллейбус", "Троллейбус", "Самосвал", "Поезд", "Мотоцикл"};

    public static void main(String[] args) {

        System.out.println("Первое задание:");
        HashSet<String> uniqueWordsArray = new HashSet<>(Arrays.asList(wordsArray));
        System.out.println(uniqueWordsArray);
        System.out.println();

        System.out.println("Второе задание:");
        HashMap<String, Integer> countingWords = new HashMap<>();
        for (String s : wordsArray) {
            if (countingWords.containsKey(s)) {
                countingWords.put(s, countingWords.get(s) + 1);
            } else countingWords.put(s, 1);
        }
        System.out.println(countingWords);
        System.out.println();

        System.out.println("Третье задание:");
        PhoneDirectory phoneDirectory = new PhoneDirectory();
        phoneDirectory.add("Alex", "79168888888");
        phoneDirectory.add("Boris", "79165555566");
        phoneDirectory.add("Vladimir", "79164444488");
        phoneDirectory.add("Pavel", "79166776076");
        phoneDirectory.add("Pavel", "79166776076");
        phoneDirectory.add("Pavel", "79165511111");
        phoneDirectory.get("Alex");
        phoneDirectory.get("Boris");
        phoneDirectory.get("Vladimir");
        phoneDirectory.get("Pavel");
    }
}