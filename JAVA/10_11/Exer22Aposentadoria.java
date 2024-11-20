import java.util.Scanner;
public class Exer22Aposentadoria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idade = 0, timeWork = 0;

        do{
            System.out.print("Digite a sua idade: \n->");
            idade = sc.nextInt();
        }while(idade<18 );
        do {
            System.out.print("Digite o seu tempo trabalhado: \n->");
            timeWork = sc.nextInt();
        } while (timeWork<1);
        
        if (idade >= 65) {
            System.out.print("Voce pode se aposentar!");
        }
        else if (timeWork>=30) {
            System.out.print("Voce pode se aposentar!");
        }
        else if (idade >= 60 && timeWork>=25) {
            System.out.print("Voce pode se aposentar!");
        }
        else{
            System.out.print("Voce nao pode se aposentar!");
        }
        sc.close();
    }
}
