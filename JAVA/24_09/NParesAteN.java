import java.util.Scanner;
public class NParesAteN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero par: ");
        int N = sc.nextInt();
        int num = 0, count = 1;
        while (N%2!=0) {
            System.out.println("Digite um numero par: ");
            N = sc.nextInt();
        }
        while (count <= N) {
            System.out.println(count+"° numero par = "+num);
            num+=2;
            count++;
        }
        sc.close();
    }
}
