import java.util.Scanner;
public class QualQuadrante {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double cord1 = sc.nextDouble(), cord2 = sc.nextDouble();

        // Res = Q1
        if (cord1>0 && cord2>0) {
            System.out.println("Q1");
        }
        // Res = Q2
        if (cord1<0 && cord2>0) {
            System.out.println("Q2");
        }
        // Res = Q3
        if (cord1<0 && cord2<0) {
            System.out.println("Q3");
        }
        // Res = Q4
        if (cord1>0 && cord2<0) {
            System.out.println("Q4");
        }
        if (cord1==0 && cord2!=0) {
            System.out.println("Eixo Y");
        }
        if (cord1!=0 && cord2==0) {
            System.out.println("Eixo X");
        } 
        // Res = Origem
        if (cord1==0 && cord2==0) {
            System.out.println("Origem");
        }
        sc.close();
    }
}
