import java.util.Scanner;

public class Bee1051Imposto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salario = 0, aux = 0, imposto = 0;

        do {
            System.out.print("Digite o valor do seu salario mensal:\n-> ");
            salario = sc.nextDouble();
        } while (salario < 0);
        // salarop = 3002.00
        if (salario<=2000){
            System.out.println("Isento");
        }else if (salario<3000.01) {
            imposto = 0.08*(salario-2000);
            System.out.println("R$ "+String.format("%.02f", imposto));
        }else if (salario<4500.01) {
            aux = 0.08*1000;
            imposto = 0.18*(salario-3000)+aux;
        }else if (salario<=3000) {
            salario = salario-2000;
            imposto = 0.08*(salario%1000);
            System.out.println("R$ "+String.format("%.02f", imposto));
        }else if (salario<=4500) {
            salario = salario-3000;
            aux = 0.08*1000;
            imposto = 0.18*(salario%1000)+aux;
            System.out.println("R$ "+String.format("%.02f", imposto));
        }else{
            aux = 0.08*1000+0.18*1500;
            imposto = 0.28*(salario-4500)+aux;
            imposto = 0.28*(salario%1000)+aux;
            System.out.println("R$ "+String.format("%.02f", imposto));
        }
    }
}
