import java.util.Scanner;
public class Exer21Opcoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;
        double n1, n2;

        do {
            System.out.print("Escolha uma das opcoes:\n 1 - Soma de 2 numeros\n 2 - diferenca de 2 numeros\n 3 - Produto entre 2 numeros\n 4 -  Divis~ao entre 2 numeros\n->");
            opcao = sc.nextInt();
        } while (opcao<1 || opcao>4);

        if (opcao==1) {
            System.out.print("Digite o 1° valor:\n->");
            n1 = sc.nextDouble();
            System.out.print("Digite o 2° valor:\n->");
            n2 = sc.nextDouble();
            System.out.print("A diferenca dos numeros escolhidos = "+(n1+n2));
        }
        if (opcao==2) {
            System.out.print("Digite o 1° valor:\n->");
            n1 = sc.nextDouble();
            System.out.print("Digite o 2° valor:\n->");
            n2 = sc.nextDouble();

            if (n1>n2) {
                System.out.print("A diferenca dos numeros escolhidos = "+(n1-n2));
            }else{
                System.out.print("A diferenca dos numeros escolhidos = "+(n2-n1));
            }
        }
        if (opcao==3) {
            System.out.print("Digite o 1° valor:\n->");
            n1 = sc.nextDouble();
            System.out.print("Digite o 2° valor:\n->");
            n2 = sc.nextDouble();

            System.out.print("O produto dos numeros escolhidos = "+n1*n2);
        }
        if (opcao==4) {
            System.out.print("Digite o valor do numerador:\n->");
            n1 = sc.nextDouble();

            do {
                System.out.print("Digite o valor do denominador:\n->");
                n2 = sc.nextDouble();
            } while (n2==0);

            System.out.print("O produto dos numeros escolhidos = "+n1/n2);
        }
        sc.close();
    }

}
