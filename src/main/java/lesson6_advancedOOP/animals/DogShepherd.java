package lesson6_advancedOOP.animals;

public class DogShepherd extends Dog{

    private static final String breed = "Shepherd";

    public DogShepherd() {
        this.maxRunningLength = 600;
        this.maxSwimmingLength = 10;
        this.maxJumpingLength = 1;
    }

    public static String getBreed() {
        return breed;
    }
}