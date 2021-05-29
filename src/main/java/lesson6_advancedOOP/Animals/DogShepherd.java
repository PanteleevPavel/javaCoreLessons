package lesson6_advancedOOP.Animals;

public class DogShepherd extends Dog{

    public DogShepherd() {
        this.maxRunningLength = 600;
        this.maxSwimmingLength = 10;
        this.maxJumpingLength = 1;
    }

    private static final String breed = "Shepherd";

    public static String getBreed() {
        return breed;
    }
}