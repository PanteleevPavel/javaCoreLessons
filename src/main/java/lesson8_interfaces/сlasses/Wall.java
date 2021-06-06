package lesson8_interfaces.сlasses;

import lesson8_interfaces.interfaces.Obstacle;

public class Wall implements Obstacle {
    private static final String name = "Wall";
    private int wallHeight;

    public Wall(int wallHeight) {
        this.wallHeight = Math.max(wallHeight, 0);
    }

    @Override
    public String getObstacleName() {
        return name;
    }

    @Override
    public int getObstacleSize() {
        return wallHeight;
    }
}