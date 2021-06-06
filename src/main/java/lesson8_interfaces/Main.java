package lesson8_interfaces;

import lesson8_interfaces.interfaces.Jump;
import lesson8_interfaces.interfaces.Obstacle;
import lesson8_interfaces.interfaces.PreCompetitionCheckUp;
import lesson8_interfaces.interfaces.Run;
import lesson8_interfaces.сlasses.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Создаём коллекции препятствий и участников
        List<Object> obstacles = new ArrayList<>();
        List<Object> participants = new ArrayList<>();

        //Заполняем коллекции препятствиями и участниками
        Treadmill treadmill1 = new Treadmill(generateRandomNumber(10, 20));
        Wall wall1 = new Wall(generateRandomNumber(1, 2));
        Treadmill treadmill2 = new Treadmill(generateRandomNumber(20, 40));
        Wall wall2 = new Wall(generateRandomNumber(2, 4));
        Treadmill treadmill3 = new Treadmill(generateRandomNumber(40, 80));
        Wall wall3 = new Wall(generateRandomNumber(4, 8));

        obstacles.add(treadmill1);
        obstacles.add(wall1);
        obstacles.add(treadmill2);
        obstacles.add(wall2);
        obstacles.add(treadmill3);
        obstacles.add(wall3);

        Cat cat = new Cat(15, 1);
        Person person = new Person(40, 10);
        Robot robot = new Robot(100, 10);

        participants.add(cat);
        participants.add(person);
        participants.add(robot);

        //Даём команду всем участникам к прохождению препятствий
        for (int i = 0; i < obstacles.size(); i++) {
            System.out.println(i + 1 + " Препятствие:");
            for (int j = 0; j < participants.size(); j++) {
                if (participants.get(j) instanceof PreCompetitionCheckUp &&
                        participants.get(j) instanceof Jump &&
                        participants.get(j) instanceof Run) {
                    ((PreCompetitionCheckUp) participants.get(j)).whatDoWeSee(obstacles.get(i));
                    if (obstacles.get(i) instanceof Obstacle) {
                        if (((Obstacle) obstacles.get(i)).getObstacleName().equals("Treadmill")) {
                            if (((Run) participants.get(j)).getMaxRunningLength() < ((Obstacle) obstacles.get(i)).getObstacleSize()) {
                                System.out.println("К сожалению, предыдущий участник выбывает из соревнований");
                                participants.remove(participants.get(j));
                                j--;
                            }
                        } else if (((Obstacle) obstacles.get(i)).getObstacleName().equals("Wall")) {
                            if (((Jump) participants.get(j)).getMaxJumpHeight() < ((Obstacle) obstacles.get(i)).getObstacleSize()) {
                                System.out.println("К сожалению, " + (j + 1) + " участник выбывает из соревнований");
                                participants.remove(participants.get(j));
                                j--;
                            }
                        }
                    }
                }
            }
            System.out.println();
        }
    }

    //Генератор случайных чисел в интервале от min до max
    private static int generateRandomNumber(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }
}