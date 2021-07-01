package Lesson14_testing;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {

        System.out.println(Arrays.toString(returnNewArray(new int[]{1, 2, 4, 4, 2, 3, 4, 1, 7, 4})));
        System.out.println(check1_4(new int[]{1, 1, 1, 4, 1, 3, 1, 1,}));
    }

    public static int[] returnNewArray(int[] intArray) throws Exception {
        int[] newArray;
        int searchIndex = -1;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == 4) {
                searchIndex = i;
            }
        }
        if (searchIndex < 0) {
            throw new NewArrayDataException("В массиве нет ни одной цифры 4");
        } else {
            newArray = Arrays.copyOfRange(intArray, searchIndex + 1, intArray.length);
        }
        return newArray;
    }

    public static boolean check1_4(int[] intArray) {
        boolean thereIs1 = false;
        boolean thereIs4 = false;
        for (int j : intArray) {
            if (j == 1) {
                thereIs1 = true;
            } else if (j == 4) {
                thereIs4 = true;
            } else {
                return false;
            }
        }
        return thereIs1 && thereIs4;
    }
}