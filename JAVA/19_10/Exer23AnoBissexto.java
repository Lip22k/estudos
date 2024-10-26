import java.util.Scanner;
public class Exer23AnoBissexto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o ano que deseja saber se e bissexto:\n->");
        int ano = sc.nextInt();
        
        if (ano%100!=0 && ano%4==0) {
            System.out.print("O ano "+ano+" e bissexto");
        }else{
            System.out.print("O ano "+ano+" naow e bissexto");
        }
        sc.close();
    }
}
