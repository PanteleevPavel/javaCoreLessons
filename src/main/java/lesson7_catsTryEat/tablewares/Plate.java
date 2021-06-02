package lesson7_catsTryEat.tablewares;

public class Plate {
    private int maxAmountOfFood = 10;
    private int amountOfFood;

    public Plate(int amountOfFood) {
        this.amountOfFood = amountOfFood;
        if (amountOfFood > maxAmountOfFood) {
            this.amountOfFood = maxAmountOfFood;
        }
    }

    public void removeFood(int quantity) {
        for (int i = 0; i < quantity; i++) {
            if (amountOfFood - 1 >= 0) {
                amountOfFood--;
            }
        }
    }

    public void putFoodIn (int quantity) {
        for (int i = 0; i < quantity; i++) {
            if (amountOfFood + 1 <= maxAmountOfFood)
            amountOfFood++;
        }
    }

    public int getAmountOfFood() {
        return amountOfFood;
    }
}