package lesson6_advancedOOP.Animals;

public class DogPitBull extends Dog{

    public DogPitBull() {
        this.maxRunningLength = 400;
        this.maxSwimmingLength = 15;
        this.maxJumpingLength = 1;
    }

    private static final String breed = "PitBull";

    public static String getBreed() {
        return breed;
    }
}