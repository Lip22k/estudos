import java.util.Scanner;

public class Bee1002 {
 
    public static void main(String[] args){
        Scanner ch = new Scanner(System.in);

        double A = ch.nextDouble();
        
        double B = ch.nextDouble();
        
        double X = ((A*3.5)+(B*7.5))/11;
        System.out.println("MEDIA = "+String.format("%.5f", X));
        ch.close();
    }
 
}