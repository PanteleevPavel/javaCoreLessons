package lesson6_advancedOOP.animals;

import java.util.Arrays;

public abstract class Animal {
    int maxRunningLength;
    int maxSwimmingLength;
    double maxJumpingLength;

    public abstract String run(int length);

    public abstract String swim(int length);

    public abstract String jump(int width);

    public String animalsPerformPhysicalEducation(int firstTry, int secondTry) {
        String[] cache = {
                this.run(firstTry),
                this.swim(firstTry),
                this.jump(firstTry),
                this.run(secondTry),
                this.swim(secondTry),
                this.jump(secondTry)
        };
        return Arrays.toString(cache).replace(",", "").replace("]", "").replace("[", "");
    }

    public int getMaxRunningLength() {
        return maxRunningLength;
    }

    public int getMaxSwimmingLength() {
        return maxSwimmingLength;
    }

    public double getMaxJumpingLength() {
        return maxJumpingLength;
    }
}