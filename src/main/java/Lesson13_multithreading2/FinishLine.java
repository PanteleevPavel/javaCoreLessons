package Lesson13_multithreading2;

public class FinishLine extends Stage{
    @Override
    public synchronized void go(Car c){
        if (Main.winner.getCount() == 1) {
            Main.winner.countDown();
            System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> " + c.getName() + " ПОБЕДИТЕЛЬ!!!");
        }
        Main.cdl2.countDown();
    }
}