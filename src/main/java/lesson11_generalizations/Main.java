package lesson11_generalizations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        System.out.println("Первое задание:");
        Integer[] intArr = new Integer[]{1, 2};
        String[] stringArr = new String[]{"First value", "Second Value"};

        swappingElements(intArr, 0, 1);
        System.out.println("Результат первой замены: " + Arrays.toString(intArr));

        swappingElements(stringArr, 0, 1);
        System.out.println("Результат второй замены: " + Arrays.toString(stringArr));
        System.out.println();

        System.out.println("Второе задание:");

        //Можем так (Но так будет не удобно потом работать с этими листами из за не явного указания типа)
        ArrayList newList = arrayToArrayList(intArr);
        ArrayList newList2 = arrayToArrayList(stringArr);

        //А можем и вот так
        ArrayList<Integer> newList3 = arrayToArrayList(intArr);
        ArrayList<String> newList4 = arrayToArrayList(stringArr);

        //А так (Указать не корректный тип) не сможем, потому, что как раз метод возвращает уже типизированный лист :-)
//        ArrayList<String> newList5 = arrayToArrayList(intArr);
//        ArrayList<Integer> newList6 = arrayToArrayList(stringArr);

        System.out.println("Преобразовали Integer массив в ArrayList: " + newList);
        System.out.println("Преобразовали String массив в ArrayList: " + newList2);
        System.out.println("Преобразовали Integer массив в типизированный ArrayList: " + newList3);
        System.out.println("Преобразовали String массив в типизированный ArrayList: " + newList4);
    }

    public static <arr> void swappingElements(arr[] array, int first, int second) {
        HashMap<Integer, arr> writingValues = new HashMap<>();
        writingValues.put(first, array[first]);
        writingValues.put(second, array[second]);
        array[first] = writingValues.get(second);
        array[second] = writingValues.get(first);
    }

    public static <arr> ArrayList<arr> arrayToArrayList(arr[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }
}