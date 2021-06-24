package Lesson12_multithreading;

public class CalculatingArrayThread extends Thread{

    private float[] array;

    public CalculatingArrayThread(float[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1; i++) {
            try {
                for (int j = 0; j < array.length; j++) {
                    array[j] = (float)(array[j] * Math.sin(0.2f + j / 5) * Math.cos(0.2f + j / 5) * Math.cos(0.4f + j / 2));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public float[] getArray() {
        return this.array;
    }

}