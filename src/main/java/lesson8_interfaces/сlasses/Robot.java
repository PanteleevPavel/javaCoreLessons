package lesson8_interfaces.сlasses;

import lesson8_interfaces.interfaces.Jump;
import lesson8_interfaces.interfaces.Obstacle;
import lesson8_interfaces.interfaces.PreCompetitionCheckUp;
import lesson8_interfaces.interfaces.Run;

public class Robot implements Jump, Run, PreCompetitionCheckUp {
    private int maxRunningLength;
    private int maxJumpHeight;

    public Robot(int maxRunningLength, int maxJumpHeight) {
        this.maxRunningLength = Math.max(maxRunningLength, 0);
        this.maxJumpHeight = Math.max(maxJumpHeight, 0);
    }

    @Override
    //Различим препятствие и поймём, что нам делать
    public void whatDoWeSee(Object obstacle) {
        if (obstacle instanceof Obstacle) {
            if (((Obstacle) obstacle).getObstacleName().equals("Treadmill")) {
                run(((Obstacle) obstacle).getObstacleSize());
            } else if (((Obstacle) obstacle).getObstacleName().equals("Wall")) {
                jump(((Obstacle) obstacle).getObstacleSize());
            }
        }
    }

    @Override
    public void run(int length) {
        if (length <= maxRunningLength) {
            System.out.println("Робот удачно пробежал");
        } else {
            System.out.println("Робот развалился, пока пытался добежать до конца");
        }
    }

    @Override
    public void jump(int height) {
        if (height <= maxJumpHeight) {
            System.out.println("Робот удачно прыгнул");
        } else {
            System.out.println("Робот все пружины поломал, пока пытался перепрыгнуть");
        }
    }

    @Override
    public int getMaxJumpHeight() {
        return maxJumpHeight;
    }

    @Override
    public int getMaxRunningLength() {
        return maxRunningLength;
    }
}