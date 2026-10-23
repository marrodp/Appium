public class EjercicioHipotenusa {
    public static void main(String[] args) {
        final double cateto1 = 3;
        final double cateto2 = 4;
        final double hipotenusa = calcularHipotenusa(cateto1, cateto2);
        System.out.printf("Para los catetos %.3f y %.3f, la hipotenusa es %.3f%n", cateto1, cateto2, hipotenusa);
    }

    static double calcularHipotenusa(double cateto1, double cateto2) {
        return Math.sqrt(cateto1 * cateto1 + cateto2 * cateto2);
    }
}
