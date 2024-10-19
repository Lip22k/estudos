import java.util.Scanner;
public class SomaSerieHarmonica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), count = 0;
        double i = 1, h = 0;
        // int 
        while (count<n) {
            h = h + 1/i;
            i++;
            count++;
        }
        System.out.println("H = "+String.format("%.5f", h));
        sc.close();
    }
}
