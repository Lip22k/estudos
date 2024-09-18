import javax.swing.JOptionPane;

public class Exer31 {
    public static void main(String[] args){
        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor inteiro: "));
        JOptionPane.showMessageDialog(null,"O Antecessor do seu numero é: " + (num-1));
        JOptionPane.showMessageDialog(null,"O Sucessor do seu numero é: " + (num+1));
    }
}
