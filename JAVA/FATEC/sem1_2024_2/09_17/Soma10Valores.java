import java.util.Scanner;

public class Soma10Valores {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int count = 0;

        System.out.print("Digite um valor: ");
        double numUser = scanner.nextDouble();

        while (count<10) {
            System.out.print("Digite mais um valor: ");
            numUser = numUser + scanner.nextDouble();
            count++;
        }
        System.out.println(numUser);
        scanner.close();
    }
}