import java.util.Scanner;
import java.util.Random;

public class Estudiantes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[][] matriz = new int[3][4];

        // Llenar matriz con datos aleatorios válidos para cada columna
        for (int i = 0; i < 3; i++) {
            matriz[i][0] = i + 1; // ID
            matriz[i][1] = random.nextInt(15) + 16; // Edad (entre 16 y 30 años)
            matriz[i][2] = random.nextInt(22) + 1990; // Año de nacimiento (entre 1990 y 2011)
            matriz[i][3] = random.nextInt(11); // Número de materias (entre 0 y 10)
        }

        // Pedir al usuario un ID de estudiante e imprimir todos los datos del estudiante
        System.out.print("Ingrese el ID de un estudiante: ");
        int idBuscado = scanner.nextInt();
        boolean encontrado = false;

        for (int i = 0; i < 10; i++) {
            if (matriz[i][0] == idBuscado) {
                System.out.println("Datos del estudiante con ID " + idBuscado + ":");
                System.out.println("ID: " + matriz[i][0]);
                System.out.println("Edad: " + matriz[i][1]);
                System.out.println("Año de nacimiento: " + matriz[i][2]);
                System.out.println("Número de materias: " + matriz[i][3]);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Estudiante con ID " + idBuscado + " no encontrado.");
        }

        // Imprimir el número de estudiantes que hay entre un rango de edad
        System.out.print("Ingrese el límite inferior del rango de edad: ");
        int edadMin = scanner.nextInt();
        System.out.print("Ingrese el límite superior del rango de edad: ");
        int edadMax = scanner.nextInt();
        int contadorEdades = 0;

        for (int i = 0; i < 3; i++) {
            if (matriz[i][1] >= edadMin && matriz[i][1] <= edadMax) {
                contadorEdades++;
            }
        }
        System.out.println("Número de estudiantes con edad entre " + edadMin + " y " + edadMax + ": " + contadorEdades);

        // Imprimir todos los estudiantes
        System.out.println("Todos los estudiantes:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Estudiante " + (i + 1) + ":");
            System.out.println("ID: " + matriz[i][0]);
            System.out.println("Edad: " + matriz[i][1]);
            System.out.println("Año de nacimiento: " + matriz[i][2]);
            System.out.println("Número de materias: " + matriz[i][3]);
            System.out.println();
        }

        // Imprimir los estudiantes de un año determinado
        System.out.print("Ingrese un año de nacimiento: ");
        int aBuscado = scanner.nextInt();

        System.out.println("Estudiantes nacidos en el año " + aBuscado + ":");
        boolean aEncontrado = false;
        for (int i = 0; i < 3; i++) {
            if (matriz[i][2] == aBuscado) {
                System.out.println("Estudiante " + (i + 1) + ":");
                System.out.println("ID: " + matriz[i][0]);
                System.out.println("Edad: " + matriz[i][1]);
                System.out.println("Año de nacimiento: " + matriz[i][2]);
                System.out.println("Número de materias: " + matriz[i][3]);
                System.out.println();
                aEncontrado = true;
            }
        }
        if (!aEncontrado) {
            System.out.println("No se encontraron estudiantes nacidos en el año " + aBuscado + ".");
        }

        // Imprimir el número promedio de materias de toda la matriz
        int sumaMaterias = 0;
        for (int i = 0; i < 3; i++) {
            sumaMaterias += matriz[i][3];
        }
        double promedioMaterias = (double) sumaMaterias / 3;
        System.out.println("Promedio de materias de todos los estudiantes: " + promedioMaterias);
    }
}
