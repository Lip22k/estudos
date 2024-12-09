import java.util.Scanner;
public class PositivoMedia{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double val[] = new double[6], media = 0;
        int qtd=0;

        for (int i = 0; i < 6; i++) {
            val[i] = sc.nextDouble();
            if (val[i]>0) {
                qtd++;
                media = media+val[i];
            }
        }
        System.out.println(qtd+" valores positivos");
        System.out.println(String.format("%.1f",media/qtd));
    }
}