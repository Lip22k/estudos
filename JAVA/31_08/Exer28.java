import javax.swing.JOptionPane;

public class Exer28 {
    public static void main(String[] args){
        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o 1° numero"));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o 2° numero"));
        double num3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o 3° numero"));

        JOptionPane.showMessageDialog(null, "A soma dos quadrados dos 3 numeros = " + String.format("%.0f",Math.pow(num1, 2) + Math.pow(num2, 2) + Math.pow(num3, 2)));
    }
}
