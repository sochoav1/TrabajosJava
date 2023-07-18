import java.util.Random;
import java.util.Scanner;

public class MatrizAleatoria {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        // Pedir al usuario el tamaño de la matriz
        System.out.print("Ingrese el número de filas y columnas: ");
        int n = sc.nextInt();

        // Crear la matriz y llenarla con números aleatorios del 0 al 10
        int[][] matriz = new int[n][n];
        for (int fila = 0; fila < n; fila++) {
            for (int columna = 0; columna < n; columna++) {
                matriz[fila][columna] = rand.nextInt(11);
            }
        }

        // Mostrar la matriz en la consola
        for (int fila = 0; fila < n; fila++) {
            for (int columna = 0; columna < n; columna++) {
                System.out.print(matriz[fila][columna] + " ");
            }
            System.out.println();
        }
    }
}

