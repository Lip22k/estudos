import java.util.Scanner;
public class Lanches {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt(), n2 = sc.nextInt();

        if (n1==1) {
            System.out.println("Total: R$ "+String.format("%.2f",4.00*n2));
        }else if(n1==2){
            System.out.println("Total: R$ "+String.format("%.2f",4.50*n2));
        }else if(n1==3){
            System.out.println("Total: R$ "+String.format("%.2f",5.00*n2));
        }else if(n1==4){
            System.out.println("Total: R$ "+String.format("%.2f",2.00*n2));
        }else if(n1==5){
            System.out.println("Total: R$ "+String.format("%.2f",1.50*n2));
        }
        sc.close();
    }
}
