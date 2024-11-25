import java.util.Scanner;
public class Bee1061Evento {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int diaInicio, horaInicio, minInicio, segInicio, diaFim, horaFim, minFim, segFim;

        do {            
            System.out.print("Dia: ");
            diaInicio = sc.nextLine();
        } while (diaInicio<0);

        // Limpando o buffer
        sc.nextLine();

        do {
            horaInicio = sc.nextInt();
        } while (horaInicio<0);

        // Limpando o buffer
        sc.nextLine();
        System.out.print(" : ");
        do {
            minInicio = sc.nextInt();
        } while (minInicio<0);
        // System.out.print("Dia: ");
        // diaInicio = Integer.parseInt(sc.nextLine());

        // horaInicio = Integer.parseInt(sc.nextLine());
        // System.out.print(" : ");
        
        // minInicio = Integer.parseInt(sc.nextLine());
        // System.out.print(" : ");
    }
}