package Lesson12_multithreading;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        firstMethod();
        secondMethod();
    }

    public static void firstMethod() {

        final int SIZE = 10000000;
        final int HALF = SIZE / 2;
        float[] arr = new float[SIZE];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }

        long a = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Первый поток отработал за " + (System.currentTimeMillis() - a) + " Миллисекунд");
    }

    public static void secondMethod() throws InterruptedException {

        final int SIZE = 10000000;
        final int HALF = SIZE / 2;
        float[] arr = new float[SIZE];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }

        long startTime = System.currentTimeMillis();
        float[] arr2 = new float[HALF];
        float[] arr3 = new float[HALF];
        System.arraycopy(arr, 0, arr2, 0, HALF);
        System.arraycopy(arr, HALF, arr3, 0, HALF);

        Thread firstThread = new CalculatingArrayThread(arr2);
        Thread secondThread = new CalculatingArrayThread(arr3);
        firstThread.start();
        secondThread.start();
        firstThread.join();
        secondThread.join();
        arr2 = ((CalculatingArrayThread) firstThread).getArray();
        arr3 = ((CalculatingArrayThread) secondThread).getArray();
        System.arraycopy(arr2, 0, arr, 0, HALF);
        System.arraycopy(arr3, 0, arr, HALF, HALF);
        System.out.println(Arrays.toString(arr));
        System.out.println("Второй поток отработал за " + (System.currentTimeMillis() - startTime) + " Миллисекунд");
    }
}