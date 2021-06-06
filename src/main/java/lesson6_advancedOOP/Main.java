package lesson6_advancedOOP;

import lesson6_advancedOOP.animals.*;

public class Main {
    public static void main(String[] args) {

        Animal[] animal = new Animal[4];

        animal[0] = new CatLopEared(200, 0, 2);
        animal[1] = new CatTheBritish(210, 0, 1.5);
        animal[2] = new DogPitBull();
        animal[3] = new DogShepherd();

        //Попросим животных выполнять упражнения сначала с заведомо слишком высоким значением, затем с минимальным.
        for (int i = 0; i < animal.length; i++) {
            System.out.println(animal[i].animalsPerformPhysicalEducation(1000, 1));
        }
    }
}