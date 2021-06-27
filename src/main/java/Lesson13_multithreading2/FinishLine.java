package Lesson13_multithreading2;

public class FinishLine extends Stage{
    @Override
    public synchronized void go(Car c){
        if (Main.cdl2.getCount() == Main.CARS_COUNT) {
            Main.cdl2.countDown();
            System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> " + c.getName() + " ПОБЕДИТЕЛЬ!!!");
        } else {
            Main.cdl2.countDown();
            System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> " + c.getName() + " ФИНИШИРОВАЛ " + (Main.CARS_COUNT - Main.cdl2.getCount()));
        }
    }
}