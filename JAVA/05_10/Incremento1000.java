public class Incremento1000 {

    public static void main(String[] args) {
        int num = 0;

        System.out.println("Usando FOR:");
        for (int i = 0; i <= 100000; i+=1000) {
            System.out.print(i+" ");
        }
        System.out.println("\n");
        
        System.out.println("Usando WHILE:");
        while (num<=100000) {
            System.out.print(num+" ");
            num = num+1000;
        }
        System.out.println("\n");
        
        System.out.println("Usando DO-WHILE:");
        num = 0;
        do{
            System.out.print(num+" ");
            num+=1000;
        }while(num<=100000);
    }
}