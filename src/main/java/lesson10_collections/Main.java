package lesson10_collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class Main {

    private static String[] wordsArray = {"Машина", "Самолёт", "Трактор", "Машина", "Поезд", "Машина", "Велосипед", "Самокат",
    "Спорткар", "Трактор", "Трамвай", "Троллейбус", "Троллейбус", "Самосвал", "Поезд", "Мотоцикл"};

    public static void main(String[] args) {

        HashSet<String> uniqueWordsArray = new HashSet<>();
        for (int i = 0; i < wordsArray.length; i++) {
            uniqueWordsArray.add(wordsArray[i]);
        }
        System.out.println(uniqueWordsArray);

        HashMap<String, Integer> countingWords = new HashMap<>();
        for (int i = 0; i < wordsArray.length; i++) {
            if (countingWords.containsKey(wordsArray[i])) {
                countingWords.put(wordsArray[i],countingWords.get(wordsArray[i]) + 1);
            } else countingWords.put(wordsArray[i], 1);
        }
        System.out.println(countingWords);
    }
}
