/*
 Ler 2 numeros
 ler o operador (+, -. , /)
    Verificar se o 2 numero é 0
 */
import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, num2;
        char operation;
        System.out.print("Digite o 1° valor:\n->");
        num1 = sc.nextDouble();
        System.out.print("Digite o 2° valor:\n->");
        num2 = sc.nextDouble();
        System.out.print("Digite a operação que queira (+, -, *, /, ^, r):\n->");
        sc.nextLine();
        operation = sc.nextLine().charAt(0);

        switch (operation) {
            case '+':
                System.out.print("A soma entre "+num1+" e "+num2+" = "+(num1+num2));
                break;
            case '-':
                System.out.print("A diferença entre "+num1+" e "+num2+" = "+(num1-num2));
                break;
            case '*':
                System.out.print("O produto entre "+num1+" e "+num2+" = "+(num1*num2));
                break;
            case '/':
                if (num2==0) {
                    System.out.print("Não é possivel dividir por zero cabaço");
                }else{
                    System.out.print("A razão entre "+num1+" e "+num2+" = "+(num1/num2));
                }
                break;
            case '^':
                System.out.print("A potenciação entre "+num1+" e "+num2+" = "+Math.pow(num1, num2));
                break;
            case 'r':
                System.out.print("A raiz entre "+num1+" e "+num2+" = "+Math.pow(num1, 1/num2));
                break;
            default:
                System.out.println("Operação invalida burro, sabe mat não?");
                break;
        }
        sc.close();
    }
}
