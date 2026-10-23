import java.util.Random;

public class RandomUtilities {
    static int generateRandomInt(int min, int max, Random random) {
        return random.nextInt((max - min) + 1) + min;
    }

    static double generateRandomDouble(double min, double max, Random random) {
        return min + (max - min) * random.nextDouble();
    }

}