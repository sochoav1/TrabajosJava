import java.util.Scanner;
import java.util.Random;

public class MatrizNxM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Ingrese el valor de n (filas): ");
        int n = scanner.nextInt();

        System.out.print("Ingrese el valor de m (columnas): ");
        int m = scanner.nextInt();

        int[][] matrizNxM = new int[n][m];
        int[] matrizSumaFilas = new int[n];

        // Llenar matriz NxM con números aleatorios del 0 al 10
        for (int i = 0; i < n; i++) {
            int sumaFila = 0;
            for (int j = 0; j < m; j++) {
                int numeroAleatorio = random.nextInt(11);
                matrizNxM[i][j] = numeroAleatorio;
                sumaFila += numeroAleatorio;
            }
            matrizSumaFilas[i] = sumaFila;
        }

        // Imprimir matriz NxM
        System.out.println("Matriz de " + n + "x" + m + " con números aleatorios del 0 al 10:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrizNxM[i][j] + "\t");
            }
            System.out.println();
        }

        // Imprimir matriz de sumas
        System.out.println("Matriz con la suma de cada fila de la matriz de " + n + "x" + m + ":");
        for (int i = 0; i < n; i++) {
            System.out.println("fila " + (i + 1) + ": " + matrizSumaFilas[i]);
        }
    }
}
