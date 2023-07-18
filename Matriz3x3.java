
public class Matriz3x3 {
    
    public static void main(String[] args) {

        int n = 3;

        int[][] matriz = new int[n][n];
        int contador = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = contador;
                contador++;
            }
        }

        System.out.println("Matriz de " + 3 + "x" + 3 + " con números del 1 al 9"+":");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
