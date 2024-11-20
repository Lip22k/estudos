import java.util.Scanner;

public class Modulo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o modulo que deseja");
        int modulo = sc.nextInt();

        for (int i = 0; i < modulo; i++) {
            for (int j = 0; j < modulo; j++) {
                System.out.print(((i+j)%modulo)+" ");
            }
            System.out.println();
        }
    }
}