import java.util.Scanner;
import java.util.Random;

public class menu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el valor de n: ");
        int n = input.nextInt();

        int[][] matriz = new int[n][n];

        int opcion;
        do {
            System.out.println("\nMenú:");
            System.out.println("1. Llenar matriz con números ingresados por el usuario");
            System.out.println("2. Llenar matriz con números aleatorios");
            System.out.println("3. Imprimir matriz");
            System.out.println("4. Sumar elementos de una fila");
            System.out.println("5. Sumar elementos de una columna");
            System.out.println("6. Imprimir diagonal principal");
            System.out.println("7. Sumar elementos de la diagonal principal");
            System.out.println("8. Sumar todos los elementos de la matriz");
            System.out.println("9. Calcular el promedio de los elementos de la matriz");
            System.out.println("0. Salir");
            System.out.print("Elija una opción: ");
            opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    llenarMatrizUsuario(matriz, input);
                    break;
                case 2:
                    llenarMatrizAleatoria(matriz);
                    break;
                case 3:
                    imprimirMatriz(matriz);
                    break;
                case 4:
                    System.out.print("Ingrese el índice de la fila (0 a " + (n - 1) + "): ");
                    int fila = input.nextInt();
                    System.out.println("Suma de la fila: " + sumarFila(matriz, fila));
                    break;
                case 5:
                    System.out.print("Ingrese el índice de la columna (0 a " + (n - 1) + "): ");
                    int columna = input.nextInt();
                    System.out.println("Suma de la columna: " + sumarColumna(matriz, columna));
                    break;
                case 6:
                    imprimirDiagonalPrincipal(matriz);
                    break;
                case 7:
                    System.out.println("Suma de la diagonal principal: " + sumarDiagonalPrincipal(matriz));
                    break;
                case 8:
                    System.out.println("Suma de todos los elementos: " + sumaTotal(matriz));
                    break;
                case 9:
                    System.out.println("Promedio de los elementos: " + promedioTotal(matriz));
                    break;
            }
        } while (opcion != 0);
    }
///enfasis en que ya aprendí a usar switch
    public static void llenarMatrizUsuario(int[][] matriz, Scanner input) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Ingrese el elemento en la posición [" + i + "][" + j + "]: ");
                matriz[i][j] = input.nextInt();
            }
        }
    }

    public static void llenarMatrizAleatoria(int[][] matriz) {
        Random random = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(100); // Generar números aleatorios entre 0 y 99
            }
        }
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int sumarFila(int[][] matriz, int fila) {
        int suma = 0;
        for (int j = 0; j < matriz[fila].length; j++) {
            suma += matriz[fila][j];
        }
        return suma;
    }

    public static int sumarColumna(int[][] matriz, int columna) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            suma += matriz[i][columna];
        }
        return suma;
    }

    public static void imprimirDiagonalPrincipal(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][i] + " ");
        }
        System.out.println();
    }

    public static int sumarDiagonalPrincipal(int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            suma += matriz[i][i];
        }
        return suma;
    }

    public static int sumaTotal(int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }
        }
        return suma;
    }

    public static double promedioTotal(int[][] matriz) {
        int suma = sumaTotal(matriz);
        int cantidad = matriz.length * matriz[0].length;
        return (double) suma / cantidad;
    }
}
