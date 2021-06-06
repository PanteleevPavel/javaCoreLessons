package lesson7_catsTryEat.cats;

import lesson7_catsTryEat.tablewares.Plate;

public class Cat {

    private String name;
    private int appetite;
    private boolean hungry = true;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        if (appetite <= 0) {
            this.appetite = 1;
        }
    }

    public void eat(Plate a) {
        for (int i = 0; i < appetite;) {
            if (a.getAmountOfFood() == 0) {
                break;
            }
            a.removeFood(1);
            appetite--;
        }
        if (this.appetite == 0) {
            hungry = false;
        }
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean isHungry() {
        return hungry;
    }

    public String getInfo() {
        return "Имя кота: " + getName() + '\n' + "Голодный на: " + getAppetite() + '\n'+ "Голодный: " + isHungry();
    }
}