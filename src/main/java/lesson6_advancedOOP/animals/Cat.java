package lesson6_advancedOOP.animals;

public abstract class Cat extends Animal {

    public Cat(int maxRunningLength, int maxSwimmingLength, double maxJumpingLength) {
        this.maxRunningLength = maxRunningLength;
        this.maxSwimmingLength = maxSwimmingLength;
        this.maxJumpingLength = maxJumpingLength;
    }

    @Override
    public String run(int length) {
        if (length > maxRunningLength) {
            return "The cat begged: God pls no!\n";
        }
        return "The cat meowed: Okay, I'll run this distance, but I hope you'll give me a treat for it.\n";
    }

    @Override
    public String swim(int length) {
        if (length > maxSwimmingLength) {
            return "The cat begged: God pls no!\n";
        }
        return "The cat meowed: Okay, I'll swim that distance, but I hope you'll give me a treat for it.\n";
    }

    @Override
    public String jump(int width) {
        if (width > maxJumpingLength) {
            return "The cat begged: God pls no!\n";
        }
        return "The cat meowed: Okay, I'll jump, but I hope you'll give me a treat for it.\n";
    }
}
