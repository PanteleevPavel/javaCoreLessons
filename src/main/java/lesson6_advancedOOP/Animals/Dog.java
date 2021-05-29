package lesson6_advancedOOP.Animals;

public abstract class Dog extends Animal {

    @Override
    public String run(int length) {
        if (length > maxRunningLength) {
            return "The dog begged: God pls no!\n";
        }
        return "The dog barked: Of course, master! With pleasure!\n";
    }

    @Override
    public String swim(int length) {
        if (length > maxSwimmingLength) {
            return "The dog begged: God pls no!\n";
        }
        return "The dog barked: Of course, master! With pleasure!\n";
    }

    @Override
    public String jump(int width) {
        if (width > maxJumpingLength) {
            return "The dog begged: God pls no!\n";
        }
        return "The dog barked: Of course, master! With pleasure!\n";
    }

}
