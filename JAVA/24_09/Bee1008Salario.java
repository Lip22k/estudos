import java.util.Scanner;

public class Bee1008Salario {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int numberId = scanner.nextInt(), valorHora = scanner.nextInt();
        double hora = scanner.nextDouble();

        System.out.println("NUMBER = " + numberId);
        System.out.println("SALARY = U$ " + String.format("%.2f" , (valorHora*hora)));

    }
}