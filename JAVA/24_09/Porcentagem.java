import java.util.Scanner;

public class Porcentagem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o o nome do 1° investidor: ");
        String nome1 = sc.next();
        System.out.print("Digite o o nome do 2° investidor: ");
        String nome2 = sc.next();
        System.out.print("Digite o o nome do 3° investidor: ");
        String nome3 = sc.next();

        System.out.print("Digite o 1° valor investido: ");
        double valor1 = sc.nextInt();
        System.out.print("Digite o 2° valor investido: ");
        double valor2 = sc.nextInt();
        System.out.print("Digite o 3° valor investido: ");
        double valor3 = sc.nextInt();
        System.out.print("Digite o valor do premio: ");
        double premio = sc.nextInt();

        while (valor1 < 0 || valor2 < 0 || valor3 < 0) {
            if (valor1 < 0) {
                System.out.print(nome1+" digite valor valido: ");
                valor1 = sc.nextInt();
            }
            if (valor2 < 0) {
                System.out.print(nome2+" digite valor valido: ");
                valor2 = sc.nextInt();
            }
            if (valor3 < 0) {
                System.out.print(nome3+" digite valor valido: ");
                valor3 = sc.nextInt();
            }
        }

        double totalInvestido = valor1 + valor2 + valor3, porc1 = valor1 / totalInvestido, porc2 = valor2 / totalInvestido, porc3 = valor3 / totalInvestido;
        System.out.println("O "+nome1+" receberá: R$"+premio*porc1);
        System.out.println("O "+nome2+" receberá: R$"+premio*porc2);
        System.out.println("O "+nome3+" receberá: R$"+premio*porc3);
    }
}
