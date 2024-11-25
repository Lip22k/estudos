import java.util.Scanner;
public class Bee1061Evento {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int diaInicio, horaInicio, minInicio, segInicio, diaFim, horaFim, minFim, segFim;

        System.out.print("Dia: ");
        diaInicio = sc.nextInt();

        horaInicio = sc.nextInt();

        System.out.print(" : ");
        minInicio = sc.nextInt();

        System.out.print(" : ");
        segInicio = sc.nextInt();

        System.out.print("\n"+horaInicio+" : "+minInicio+" : "+segInicio);
    }
}