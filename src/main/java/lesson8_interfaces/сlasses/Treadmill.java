package lesson8_interfaces.сlasses;

import lesson8_interfaces.interfaces.Obstacle;

public class Treadmill implements Obstacle {
    private static final String name = "Treadmill";
    private int distanceLength;

    public Treadmill(int distanceLength) {
        this.distanceLength = Math.max(distanceLength, 0);
    }

    @Override
    public String getObstacleName() {
        return name;
    }

    @Override
    public int getObstacleSize() {
        return distanceLength;
    }
}