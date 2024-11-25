/*
    2. Escreva um programa que escreva na tela, de 1 ate 100, de 1 em 1, 3 vezes. A primeira ´
    vez deve usar a estrutura de repetic¸ao˜ for, a segunda while, e a terceira do while 
*/

public class PrintAte100 {
    public static void main(String[] args) {
        // Utilizando FOR
        System.out.println("Escrevendo até 100 utilizando FOR:");
        for (int i = 1; i <= 100; i++) {
            System.out.print(i+" ");
        }
        System.out.println("\n");
        
        // Utilizando WHILE
        int i = 1;
        System.out.println("Escrevendo até 100 utilizando WHILE:");
        while (i<=100) {
            System.out.print(i+" ");
            i++;
        }
        System.out.println("\n");
        // Utilizando DO-WHILE
        i=1;
        System.out.println("Escrevendo até 100 utilizando DO-WHILE:");
        do {
            System.out.print(i+" ");
            i++;
        } while (i<=100);
    }
}
