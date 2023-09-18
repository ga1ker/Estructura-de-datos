public class sumatoria {
    public static void main(String[] args) {
        int numero = 5;
        int resultado = sumaCuadrados(numero);
        System.out.println("La suma de los cuadrados de los números del 1 al " + numero + " es: " + resultado);
    }

    public static int sumaCuadrados(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * n + sumaCuadrados(n - 1);
        }
    }
}
