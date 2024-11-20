import java.util.Scanner;
public class MDC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o 1 valor");
        int valor1 = sc.nextInt();
        //
        System.out.println("Digite o 2 valor");
        int valor2 = sc.nextInt(), mdc = 0;

        while (valor1%valor2>0) {
            mdc=valor1%valor2;
            valor1 = valor2;
            valor2 = mdc;
            System.out.println("O MDC é: "+mdc);
        }
    }
}
