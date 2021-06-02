package lesson6_advancedOOP.animals;

public class CatLopEared extends Cat {

    private static final String breed = "CatLopEared";

    public CatLopEared(int maxRunningLength, int maxSwimmingLength, double maxJumpingLength) {
        super(maxRunningLength, maxSwimmingLength, maxJumpingLength);
    }

    public static String getBreed() {
        return breed;
    }
}
