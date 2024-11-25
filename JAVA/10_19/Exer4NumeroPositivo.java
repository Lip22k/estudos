import java.util.Scanner;
public class Exer4NumeroPositivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double value;
        
        System.out.println("Digite um numero positivo");
        value = sc.nextInt();

        if (value > 0) {
            System.out.print("O quadrado desse numero é:\n-> "+Math.pow(value, 2)+"\na raiz desse numero e:\n-> "+Math.pow(value, 0.5));
        }else{
            System.err.println("O numero nao e positivo, por favor reinicie o sistema");
        }

        sc.close();
    }
}
