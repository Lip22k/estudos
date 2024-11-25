import java.util.*;
public class Multiplos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1=sc.nextInt(), n2=sc.nextInt();

        if (n1>=n2) {
            if (n1%n2 == 0) {
                System.out.println("Sao Multiplos");
            }else{
                System.out.println("Nao sao Multiplos");
            }
        }else{
            if (n2%n1 == 0) {
                System.out.println("Sao Multiplos");
            }else{
                System.out.println("Nao sao Multiplos");
            }
        }
        sc.close();
    }
}
