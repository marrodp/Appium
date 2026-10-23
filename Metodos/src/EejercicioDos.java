import java.util.Random;

public class EejercicioDos {
    public static void main(String[] args) {
        final var random = new Random();
        
        final var velocidadInicial = RandomUtilities.generateRandomDouble(10, 30, random);
        final var aceleracion = RandomUtilities.generateRandomDouble(2, 5, random);
        final var tiempo = RandomUtilities.generateRandomInt(3, 5, random);

        final var velocidadFinal = calcularVelocidadFinal(velocidadInicial, aceleracion, tiempo);
        imprimirResultado(velocidadInicial, aceleracion, tiempo, velocidadFinal);
    }

    static double calcularVelocidadFinal(double velocidadInicial, double aceleracion, int tiempo) {
        return velocidadInicial * aceleracion * tiempo;
    }

    static void imprimirResultado(double velocidadInicial, double aceleracion, int tiempo, double velocidadFinal) {
        System.out.printf("Para una velocidad inicial de %.3f, una aceleración de %.3f y un tiempo de %d se tiene una velocidad final de %.3f usando MRUV",
         velocidadInicial, aceleracion, tiempo, velocidadFinal);
    }
}
