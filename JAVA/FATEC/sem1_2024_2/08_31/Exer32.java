import javax.swing.JOptionPane;

public class Exer32 {
    public static void main(String[] args){
        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor inteiro: "));
        JOptionPane.showMessageDialog(null,"A soma do sucessor de seu triplo com o antecessor de seu dobro é: " + ((3*num+1)+(2*num-1)));
        // JOptionPane.showMessageDialog(null,"O Sucessor do seu numero é: " + (num+1));
    }   
}
