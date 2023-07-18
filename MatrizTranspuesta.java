import java.util.Scanner;
import java.util.Random;

public class MatrizTranspuesta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Ingrese el valor de n: ");
        int n = scanner.nextInt();

        int[][] matriz1 = new int[n][n];
        int[][] matriz2 = new int[n][n];

        // Llenar matriz1 con números aleatorios del 0 al 99
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz1[i][j] = random.nextInt(100);
            }
        }

        // Transponer matriz1 en matriz2
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz2[j][i] = matriz1[i][j];
            }
        }

        // Imprimir matriz1
        System.out.println("Matriz1 de " + n + "x" + n + " con números aleatorios del 0 al 99:");
        imprimirMatriz(matriz1, n);

        // Imprimir matriz2 (transpuesta)
        System.out.println("Matriz2 (transpuesta de Matriz1):");
        imprimirMatriz(matriz2, n);

        // Imprimir la diagonal de matriz2
        System.out.println("Diagonal de Matriz2:");
        for (int i = 0; i < n; i++) {
            System.out.print(matriz2[i][i] + " ");
        }
    }

    public static void imprimirMatriz(int[][] matriz, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
