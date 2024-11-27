import java.util.Scanner;
public class Bee1019ConverterTempo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int segundos = sc.nextInt();
        int minutos = 0, horas = 0;
        if (segundos>60) {
            minutos = segundos/60;
            segundos = segundos%60;
        }
        if (minutos>60) {
            horas = minutos/60;
            minutos = minutos%60;
        }
        System.out.println(horas+":"+minutos+":"+segundos);
        sc.close();
    }
}
