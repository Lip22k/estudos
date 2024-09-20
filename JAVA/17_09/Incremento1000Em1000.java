public class Incremento1000Em1000 {
    public static void main(String[] args) {
        int count = 0;
        while (count<100000) {
            System.out.println("falta "+(100000-count)+" para o valor ser atingido");
            count = count+1000;
        }
        System.out.println("CHEGOUUUUU ^^");
    }
}
