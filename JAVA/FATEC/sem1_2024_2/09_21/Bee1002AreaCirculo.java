import java.util.Scanner;
public class Bee1002AreaCirculo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double r = scanner.nextDouble();
        double area = 3.14159*Math.pow(r, 2);
        System.out.println("A="+String.format("%.4f", area));
        scanner.close();
    }
}
