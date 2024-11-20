import java.util.Scanner;

public class Bee1051Imposto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salario = 0, salarioResto = 0, imposto = 0;

        do {
            System.out.print("Digite o valor do seu salario mensal:\n-> ");
            salario = sc.nextInt();
        } while (salario < 0);
        // salarop = 3002.00

        if (salario <= 2000) {
            System.out.print("Isento");
        } else if (salario >= 3000) {
            if (salario >= 4500) {
                salario = salario - 2000;
                salarioResto = salario % 1000;
                salario = salario - salarioResto;
                imposto = (salario * 0.08) + (salarioResto * 0.18);
                System.out.print("R$ " + String.format("%.2f", imposto));
            }
            salario = salario - 2000;
            salarioResto = salario % 1000;
            salario = salario - salarioResto;
            imposto = (salario * 0.08) + (salarioResto * 0.18);
            System.out.print("R$ " + String.format("%.2f", imposto));
        }
    }
}
