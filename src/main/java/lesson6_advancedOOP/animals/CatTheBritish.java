package lesson6_advancedOOP.animals;

public class CatTheBritish extends Cat{

    private static final String breed = "CatTheBritish";

    public CatTheBritish(int maxRunningLength, int maxSwimmingLength, double maxJumpingLength) {
        super(maxRunningLength, maxSwimmingLength, maxJumpingLength);
    }

    public static String getBreed() {
        return breed;
    }
}
