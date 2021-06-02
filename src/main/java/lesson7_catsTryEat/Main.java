package lesson7_catsTryEat;

import lesson7_catsTryEat.Cats.Cat;
import lesson7_catsTryEat.tablewares.Plate;

public class Main {
    public static void main(String[] args) {

        Cat[] cats = new Cat[5]; //Создаём массив котиков
        Plate plate1 = new Plate(9); //Создаём тарелку

        //Заполняем массив котиками
        for(int i = 0; i < cats.length; i++) {
            cats[i] = new Cat("Барсик" + (i + 1), 1 + i);
        }

        //Выводим информацию о начальной наполненности тарелки
        System.out.println("Изначально еды в тарелке: " + plate1.getAmountOfFood());
        System.out.println();

        //Ставим тарелку с едой перед котиками
        for (int i = 0; i < cats.length; i++) {
            //Выводим информацию о котике перед тем, как он покушает
            System.out.println(cats[i].getInfo());
            //Котик кушает
            cats[i].eat(plate1);
            //Выводим информацию о том, сколько в тарелке осталось еды после котика
            System.out.println("Еды в тарелке осталось после котика: " + plate1.getAmountOfFood());
            //Выводим информацию о котике после того, как он покушает
            System.out.println(cats[i].getInfo());
            //Делаем отступ для более удобного восприятия
            System.out.println();
        }

        //Пытаемся положить в тарелку больше еды, чем её объём
        plate1.putFoodIn(15);
        System.out.println(plate1.getAmountOfFood());
    }
}