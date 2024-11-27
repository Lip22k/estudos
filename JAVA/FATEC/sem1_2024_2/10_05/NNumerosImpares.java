import java.util.Scanner;
public class NNumerosImpares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um numero inteiro:");
        int n = sc.nextInt(), impar = 1, count = 0;
        while (count<n) {
            System.out.print(impar+" ");
            impar+=2;
            count++;
        }
        sc.close();
    }    
}
