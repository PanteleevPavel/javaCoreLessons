package lesson9_exceptions;

import lesson9_exceptions.exceptions.MyArrayDataException;
import lesson9_exceptions.exceptions.MyArraySizeException;

public class Main {

    public static void main(String[] args){
        String[][] createArray = new String[4][4];
        for (int i = 0; i < createArray.length; i++) {
            for (int j = 0; j < createArray[createArray.length - 1].length; j++) {
                createArray[i][j] = "1";
            }
        }

        try {
            System.out.println(countingNumbersInAnArray(createArray));
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }
    }

    public static int countingNumbersInAnArray(String[][] justArray) throws MyArraySizeException, MyArrayDataException {
        int stringMaxLength = 0;
        int stringMinLength = justArray[0].length;
        for (int i = 0; i < justArray.length; i++) {
            stringMaxLength = Math.max(justArray[i].length, stringMaxLength);
            stringMinLength = Math.min(justArray[i].length, stringMinLength);
        }
        if (justArray.length != 4 || stringMaxLength != 4 || stringMinLength != 4) {
            throw new MyArraySizeException("Incorrect array length");
        }
        int sumInt = 0;
        for (int i = 0; i < justArray.length; i++) {
            for (int j = 0; j < justArray[i].length; j++) {
                try {
                    sumInt += Integer.parseInt(justArray[i][j]);
                } catch (Exception e) {
                    throw new MyArrayDataException("Incorrect data in: countingNumbersInAnArray[" + i + "][" + j + "] value: " + justArray[i][j]);
                }
            }
        }
        return sumInt;
    }
}