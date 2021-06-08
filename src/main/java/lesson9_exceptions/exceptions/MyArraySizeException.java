package lesson9_exceptions.exceptions;

public class MyArraySizeException extends Exception {
    public MyArraySizeException(String message) {
        super(message);
    }
}