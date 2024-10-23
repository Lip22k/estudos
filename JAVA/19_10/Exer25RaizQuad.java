import java.util.Scanner;
public class Exer25RaizQuad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a,b,c, DEL;
        String x1, x2;
        System.out.print("Digite o valor de A\n-> ");
        a = sc.nextDouble();
        System.out.print("Digite o valor de B\n-> ");
        b = sc.nextDouble();
        System.out.print("Digite o valor de C\n-> ");
        c = sc.nextDouble();

        DEL = Math.pow((Math.pow(b, 2))-(4*a*c), 0.5);
        if (DEL > 0) {
            System.out.print("O valor do DELTA é:\n-> "+DEL+"\n");
            x1 = Double.toString(((b*-1)+DEL)/(2*a));
            x2 = Double.toString(((b*-1)-DEL)/(2*a));

            if (x1.length()>4) {
                System.out.print(((b*-1)+DEL)+"/"+(2*a)+"\n");
            }else{
                System.out.print("O valor de X' é:\n-> "+x1+"\n");
            }
            
            if (x2.length()>4) {
                System.out.print(((b*-1)-DEL)+"/"+(2*a)+"\n");
            }else{   
                System.out.print("O valor de X'' é:"+x2.length()+"\n-> "+x2);
            }
        }else{
            System.out.print("Raiz impossivel");
        }
        sc.close();
        // expressao = sc.nextLine().replaceAll("\\s+", " ");

    }
}
