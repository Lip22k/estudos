/*1. Faça um programa que determine o mostre os cinco primeiros multiplos de 3, conside- ´
rando numeros maiores que 0. */

public class MultiplosDe3 {

    public static void main(String[] args) {
        // Utilizando For
        System.out.println("Mostrar os multiplos de 3, utilizando FOR:");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i * 3 + " ");
        }
        System.out.println("\n");

        // Utilizando While
        System.out.println("Mostrar os multiplos de 3, utilizando WHILE:");
        int i = 1;
        while (i <= 5) {
            System.out.print(i * 3 + " ");
            i++;
        }
        System.out.println("\n");

        // Utilizando DO-While
        System.out.println("Mostrar os multiplos de 3, utilizando DO-WHILE:");
        i = 1;
        do {
            System.out.print(i * 3 + " ");
            i++;
        } while (i <= 5);
    }
}