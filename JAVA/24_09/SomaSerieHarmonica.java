import java.util.Scanner;
public class SomaSerieHarmonica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double i = 1;
        double h = 0;
        int count = 0;
        // System.out.println(1/1);
        while (count<n) {
            h = h + 1/i;
            i++;
            count++;
        }
        System.out.println("H = "+String.format("%.5f", h));
        sc.close();
    }
}
