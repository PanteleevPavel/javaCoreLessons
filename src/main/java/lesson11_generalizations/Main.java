package lesson11_generalizations;

import lesson11_generalizations.products.Apple;
import lesson11_generalizations.products.Orange;

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
        System.out.println();

        System.out.println("Третье задание:");
        //Создаём фруктики
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();

        //Создаём коробки
        Box<Apple> appleBox1 = new Box<>();
        Box<Apple> appleBox2 = new Box<>();
        Box<Orange> orangeBox1 = new Box<>();
        Box<Orange> orangeBox2 = new Box<>();

        //Далее кладём фрукты в коробки
        appleBox1.add(apple1);
        appleBox1.add(apple2);
        appleBox1.add(apple3);

        appleBox2.add(apple1);
        appleBox2.add(apple2);
        appleBox2.add(apple3);

        orangeBox1.add(orange1);
        orangeBox1.add(orange2);
        orangeBox1.add(orange3);

        orangeBox2.add(orange1);
        orangeBox2.add(orange2);
        orangeBox2.add(orange3);

        //Далее вывод результатов функций, для проверки
        System.out.println("Вес первой коробки с яблоками: " + appleBox1.getBoxWeight());
        System.out.println("Вес второй коробки с яблоками: " + appleBox2.getBoxWeight());
        System.out.println("Вес первой коробки с апельсинами: " + orangeBox1.getBoxWeight());
        System.out.println("Вес второй коробки с апельсинами: " + orangeBox2.getBoxWeight());

        System.out.println("Вес коробок с яблоками одинаковый? " + appleBox1.compare(appleBox2));
        appleBox1.pourInto(appleBox2); // Пересып яблок из первой коробки во вторую
        System.out.println("После пересыпа яблок, вес первой коробки стал: " + appleBox1.getBoxWeight());
        System.out.println("После пересыпа яблок, вес второй коробки стал: " + appleBox2.getBoxWeight());

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