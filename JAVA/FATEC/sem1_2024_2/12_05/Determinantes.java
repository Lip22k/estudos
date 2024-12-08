import java.util.Scanner;

public class Determinantes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lenMatriz = sc.nextInt(), detA = 0;
        double matriz[][] = new double[lenMatriz][lenMatriz],matrizDetA[][] = new double[lenMatriz][lenMatriz];

        // Matriz A
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = sc.nextDouble();
            }
        }
        // Matriz Det A
        for (int i = 0; i < matrizDetA.length; i++) {
            for (int j = 0; j < matrizDetA.length; j++) {
                detA = (i+1)+(j+1);
                matrizDetA[i][j] = Math.pow(-1, detA);
            }
        }

        //Print Matriz A
        System.out.print("Matriz A:\n");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.print("\n");
        }

        //Print Matriz A Transposta
        System.out.print("Transposta da Matriz A:\n");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[j][i]+" ");
            }
            System.out.print("\n");
        }

        //Print Matriz Det A
        System.out.print("Determinante da Matriz A:\n");
        for (int i = 0; i < matrizDetA.length; i++) {
            for (int j = 0; j < matrizDetA.length; j++) {
                System.out.print(matrizDetA[i][j]+" ");
            }
            System.out.print("\n");
        }

        sc.close();
         
    }
}