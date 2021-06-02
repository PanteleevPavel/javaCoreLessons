package lesson6_advancedOOP;

import lesson6_advancedOOP.animals.*;

public class Main {
    public static void main(String[] args) {
        CatLopEared cat1 = new CatLopEared(200, 0, 2);
        CatTheBritish cat2 = new CatTheBritish(210, 0, 1.5);
        DogPitBull dog1 = new DogPitBull();
        DogShepherd dog2 = new DogShepherd();

        System.out.println("Заставим делать упражнения вислоухого");
        System.out.println(cat1.animalsPerformPhysicalEducation(1000, 1));
        System.out.println("Заставим делать упражнения британского");
        System.out.println(cat2.animalsPerformPhysicalEducation(1000, 1));
        System.out.println("Дадим команду питбулю!");
        System.out.println(dog1.animalsPerformPhysicalEducation(1000, 1));
        System.out.println("Дадим команду Овчарке!");
        System.out.println(dog2.animalsPerformPhysicalEducation(1000, 1));
    }
}