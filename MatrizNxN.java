import java.util.Scanner;

public class MatrizNxN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor de n: ");
        int n = scanner.nextInt();

        int[][] matriz = new int[n][n];
        int contador = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = contador;
                contador++;
            }
        }

        System.out.println("Matriz de " + n + "x" + n + " con números del 1 al " + (n * n) + ":");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
