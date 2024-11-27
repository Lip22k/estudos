import java.util.Scanner;
public class Salario {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double salario;
        do{
            salario=sc.nextDouble();
        }while(salario<0);

        if (salario>0 && salario<=400) {
            System.out.printf("Novo salario: %.2f\n",salario*1.15);
            System.out.printf("Reajuste ganho: %.2f\n",salario*0.15);
            System.out.println("Em percentual: 15 %");
        }else if(salario<=800){
            System.out.printf("Novo salario: %.2f\n",salario*1.12);
            System.out.printf("Reajuste ganho: %.2f\n",salario*0.12);
            System.out.println("Em percentual: 12 %");
        }else if(salario<=1200){
            System.out.printf("Novo salario: %.2f\n",salario*1.1);
            System.out.printf("Reajuste ganho: %.2f\n",salario*0.1);
            System.out.println("Em percentual: 10 %");
        }else if(salario<=2000){
            System.out.printf("Novo salario: %.2f\n",salario*1.07);
            System.out.printf("Reajuste ganho: %.2f\n",salario*0.07);
            System.out.println("Em percentual: 7 %");
        }else{
            System.out.printf("Novo salario: %.2f\n",salario*1.04);
            System.out.printf("Reajuste ganho: %.2f\n",salario*0.04);
            System.out.println("Em percentual: 4 %");
        }
    }
}
