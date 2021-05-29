package lesson1_introductionToJava;

import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    //1
    public static void main(String[] args) {

        //2 задание
        // (закоментил, т.к. раздражают предупреждения, что переменные ни где не используются =D
        // (Сори, мой перфекционизм не даёт мне покоя))
//        int nine = 9;
//        char three = '3';
//        double pi = 3.14;
//        boolean notLie = true;
//        byte four = 4;
//        short reallyShort = 15568;
//        long reallyLong = 546845618;
//        float itsFloat = 5.21f;
//        String iLoveProgramming = "I love programming";

        //Для удобной проверки
        System.out.println("Результат выражения a * (b + (c / d)) = " + iReturnResult()); //3 задание
        System.out.println(withinTen()); //4 задание
        positiveOrNegative(); //5 задание
        System.out.println(positiveOrNegativeBoolean()); //6 задание
        helloName(); //7 задание (Если закомментить предыдущие вызовы методов, то работает корректно,
        //но если вызов идёт в последовательно в общей цепочке, то он, почему-то проскакивает ввод имени.
        //В дебагере поковырялся. Вижу, что он просто принимает пустое значение,
        //но нет понимания, почему при одиночном вызове всё ок, а так ошибка. Хотелось бы разобраться поподробней)
        leapYear(); //8 задание
    }

    //3 задание
    private static float iReturnResult() {
        final float fistArgs = (float) 5.55;
        final float secondArgs = (float) 6.66;
        final float thirdArgs = (float) 7.77;
        float fourthArgs = (float) 8.88;
        return fistArgs * (secondArgs + (thirdArgs / fourthArgs));
    }

    //4 задание
    private static boolean withinTen() {
        System.out.println("Введите первое число");
        int firstInt = scanner.nextInt();
        System.out.println("Введите второе число");
        int secondInt = scanner.nextInt();
        int sumResult = firstInt + secondInt;
        return sumResult >= 10 && sumResult <= 20;
    }

    //5 задание
    private static void positiveOrNegative() {
        System.out.println("Введите число");
        int simpleInt = scanner.nextInt();
        if (simpleInt < 0) {
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число положительное");
        }
    }

    //6 задание
    private static boolean positiveOrNegativeBoolean() {
        System.out.println("Введите число");
        int simpleInt = scanner.nextInt();
        return simpleInt < 0;
    }

    //7 задание
    private static void helloName() {
        System.out.println("Введите Ваше имя");
        String userName = scanner.nextLine();
        System.out.println("Привет, " + userName + "!");
    }

    //8 задание
    private static void leapYear() {
        System.out.println("Введите год");
        int yearNow = scanner.nextInt();
        if (yearNow % 4 == 0 && yearNow % 100 != 0 || yearNow % 400 == 0) {
            System.out.println("Год високосный!");
        } else {
            System.out.println("Год не високосный");
        }
    }
}
