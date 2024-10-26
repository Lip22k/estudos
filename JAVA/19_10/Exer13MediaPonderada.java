import java.util.Scanner;
public class Exer13MediaPonderada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double p1,p2,p3, media;

        do {
            System.out.print("Digite a 1° nota:\n->");
            p1 = sc.nextDouble();
        } while (p1<0);

        do {
            System.out.print("Digite a 2° nota:\n->");
            p2 = sc.nextDouble();
        } while (p2<0);

        do {
            System.out.print("Digite a 3° nota:\n->");
            p3 = sc.nextDouble();
        } while (p2<0);

        media = (p1+p2+(p3*2))/p1+p2+p3;

        if (media>=60) {
            System.out.printf("A media do aluno é: %.2f\n",media);
            System.out.print("Aluno aprovado");
        }else{
            System.out.printf("A media do aluno é: %.2f\n",media);
            System.out.print("Aluno desaprovado");
        }

        sc.close();
    }
}
