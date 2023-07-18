import java.util.Scanner;

public class MatrizSumaFilasColumnasStringsFinal {
    public static void main(String[] args) {
        int[][] matrizNumeros;
        String[][] matrizStrings;
        int[] sumaFilas;
        int[] sumaColumnas;
        String[][] matrizResultante;

        matrizNumeros = leerMatrizNumeros();
        matrizStrings = leerMatrizStrings(matrizNumeros.length, matrizNumeros[0].length);
        sumaFilas = sumarFilas(matrizNumeros);
        sumaColumnas = sumarColumnas(matrizNumeros);
        matrizResultante = crearMatrizResultante(matrizNumeros, matrizStrings, sumaFilas, sumaColumnas);
        imprimirMatriz(matrizResultante);
    }

    public static int[][] leerMatrizNumeros() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el número de filas y columnas:");
        int filas = scanner.nextInt();
        int columnas = scanner.nextInt();
        int[][] matriz = new int[filas][columnas];

        System.out.println("Ingrese la matriz de números enteros:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }
        return matriz;
    }

    public static String[][] leerMatrizStrings(int filas, int columnas) {
        Scanner scanner = new Scanner(System.in);
        String[][] matriz = new String[filas][columnas];

        System.out.println("Ingrese la matriz de strings:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = scanner.next();
            }
        }
        return matriz;
    }

    public static int[] sumarFilas(int[][] matriz) {
        int[] sumaFilas = new int[matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                sumaFilas[i] += matriz[i][j];
            }
        }
        return sumaFilas;
    }

    public static int[] sumarColumnas(int[][] matriz) {
        int[] sumaColumnas = new int[matriz[0].length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                sumaColumnas[j] += matriz[i][j];
            }
        }
        return sumaColumnas;
    }
    public static String[][] crearMatrizResultante(int[][] matrizNumeros, String[][] matrizStrings, int[] sumaFilas, int[] sumaColumnas) {
        String[][] matrizResultante = new String[matrizNumeros.length + 1][matrizNumeros[0].length + 1];
    
        for (int i = 0; i < matrizNumeros.length; i++) {
            for (int j = 0; j < matrizNumeros[i].length; j++) {
                matrizResultante[i][j] = matrizStrings[i][j];
            }
        }
    
        for (int i = 0; i < sumaFilas.length; i++) {
            matrizResultante[i][matrizNumeros[0].length] = String.valueOf(sumaFilas[i]);
        }
    
        for (int j = 0; j < sumaColumnas.length; j++) {
            matrizResultante[matrizNumeros.length][j] = String.valueOf(sumaColumnas[j]);
        }
    
        int sumaTotal = 0;
        for (int i = 0; i < matrizNumeros.length; i++) { 
            for (int j = 0; j < matrizNumeros[i].length; j++) {
                sumaTotal += matrizNumeros[i][j];
            }
        }
    
        matrizResultante[matrizNumeros.length][matrizNumeros[0].length] = String.valueOf(sumaTotal);
    
        return matrizResultante;
    }
    
    
    public static void imprimirMatriz(String[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
} 

