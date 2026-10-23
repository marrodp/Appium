import java.util.Random;

public class EjercicioRandom {
    public static void main(String[] args) {
       final var random = new Random();

       final var randomInt = RandomUtilities.generateRandomInt(20, 100, random);
       final var randomDouble = RandomUtilities.generateRandomDouble(100, 500, random);

       System.out.printf("Random Int: %d%n", randomInt);
       System.out.printf("Random Double: %.2f%n", randomDouble);
    }
}
