
public class Bee1097Sequencia {
    public static void main(String[] args) {
        int i = 1, j = i+6, count = 1;
        while (i<=9) {
            System.out.println("I="+i+" J="+j);
            if (count%3==0) {
                i= i+2;
                j= i+6;
            }else{
                j-=1;
            }
            count++;
        }
    }
}
