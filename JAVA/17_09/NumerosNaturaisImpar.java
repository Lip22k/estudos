import java.util.Scanner;

public class NumerosNaturaisImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numUser = scanner.nextInt();
        int count = 0;
        int impar = 1;
        while (count <= numUser && impar%2 == 1) {
            System.out.println(count+"° numero natural impar: "+impar);
            count++;
            impar = impar+2;
        }
        scanner.close();
    }
}
