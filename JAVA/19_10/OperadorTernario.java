import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sal;
        do{
            System.out.print("Digite o valor do salario:\n-> ");
            sal = sc.nextDouble();
        }while(sal<0);

        String aumento = sal < 3000?"Aumento de Salario para "+(sal+(sal*0.1)):"Aumento de Salario para "+(sal+(sal*0.07));
        System.out.print(aumento);
    }
}
