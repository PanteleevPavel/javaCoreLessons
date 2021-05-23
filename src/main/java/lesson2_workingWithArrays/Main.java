package lesson2_workingWithArrays;

import java.util.Arrays;

public class Main {

    //Сорри, если генераторы случайных чисел/массивов могут как-то путать, просто всегда считал, что хардкодить что-то плохая практика))

    public static void main(String[] args) {
        first();
        second();
        third();
        fourth();
        fifth(10, 1, 9);
        System.out.println(sixth(generateRandomArray(generateRandomNumber(10, 15),1,9)));
        seventh(generateRandomArray(10, 0, 9), generateRandomNumber(-5,5));
    }

    private static void first () {
        System.out.println("1 Задание");
        int[] tenNumbers = new int[10];
        for (int i = 0; i < tenNumbers.length; i++) {
            tenNumbers[i] = generateRandomNumber(0, 1);
        }
        for (int i = 0; i < tenNumbers.length; i++) {
            if (tenNumbers[i] == 0) {
                tenNumbers[i] = 1;
            } else {
                tenNumbers[i] = 0;
            }
        }
        System.out.println(Arrays.toString(tenNumbers));
    }

    private static void second() {
        System.out.println('\n' + "2 Задание");
        int[] eightNumbers = new int[8];
        int step = 3;
        for (int i = 0; i < eightNumbers.length; i++) {
            eightNumbers[i] = i * step;
        }
        System.out.println(Arrays.toString(eightNumbers));
    }

    private static void third() {
        System.out.println('\n' + "3 Задание");
        int[] readyArray = new int[] {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < readyArray.length; i++) {
            if (readyArray[i] < 6) {
                readyArray[i] *= 2;
            }
        }
        System.out.println(Arrays.toString((readyArray)));
    }

    private static void fourth() {
        System.out.println('\n' + "4 Задание");
        int[][] squareArray = new int[10][10];
        for (int i = 0; i < squareArray.length; i++) {
            int[] line = squareArray[i];
            for (int j = 0; j < line.length; j++) {
                if (i == j || i + j == 9) {
                    line[j] = 1;
                }
            }
            System.out.println(Arrays.toString((line)));
        }
    }

    private static void fifth(int length, int min, int max) {
        System.out.println('\n' + "5 Задание");
        int[] randomArray = new int[length];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = generateRandomNumber(min, max);
        }
        int minValue = randomArray[0];
        int maxValue = randomArray[0];
        for (int i = 0; i < randomArray.length; i ++) {
            if (randomArray[i] < minValue) {
                minValue = randomArray[i];
            }
            if (randomArray[i] > maxValue) {
                maxValue = randomArray[i];
            }
        }
        System.out.println(Arrays.toString((randomArray)));
        System.out.println("Минимальное значение в массиве: " + minValue + '\n' + "Максимальное значение в массиве: " + maxValue);
    }

    private static boolean sixth(int[] newArray) {
        System.out.println('\n' + "6 Задание");
        System.out.println(Arrays.toString(newArray));
        int leftSide = 0;
        for (int i = 0; i < newArray.length - 1; i++) {
            leftSide += newArray[i];
            int rightSide = 0;
            for (int j = ++i; j < newArray.length ; j++) {
                rightSide += newArray[j];
            }
            i--;
            System.out.println("Левая часть " + leftSide + " vs " + rightSide + " Правая часть");
            if (leftSide == rightSide) {
                return true;
            } else if (leftSide > rightSide) {
                return false;
            }
        }
        return false;
    }

    private static void seventh(int[] newArray, int n) {
        System.out.println('\n' + "7 Задание");
        System.out.println("Полученный массив: " + Arrays.toString(newArray));
        if (n > 0) {
            System.out.println("Смещение на: " + n + " вправо");
            while (n > 0) {
                int cache = newArray[newArray.length - 1];
                for (int i = newArray.length - 1; i >= 0; i--) {
                    if (i == 0) {
                        newArray[i] = cache;
                        continue;
                    }
                    newArray[i] = newArray[i - 1];
                }
                n--;
            }
            System.out.println("Результат смещения: " + Arrays.toString(newArray));
        } else if (n < 0) {
            System.out.println("Смещение на: " + n + " влево");
            while (n < 0) {
                int cache = newArray[0];
                for (int i = 0; i < newArray.length; i++) {
                    if (i == newArray.length - 1) {
                        newArray[i] = cache;
                        continue;
                    }
                    newArray[i] = newArray[i + 1];
                }
                n++;
            }
            System.out.println("Результат смещения: " + Arrays.toString(newArray));
        } else {
            System.out.println("Сорри, сгенерировалось смещение на 0 элементов, запустите программу повторно.");
        }
    }

    private static int generateRandomNumber(int min , int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }

    private static int[] generateRandomArray(int length, int min, int max) {
        int[] randomArray = new int[length];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = generateRandomNumber(min, max);
        }
        return randomArray;
    }
}