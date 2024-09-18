/*
    Leia uma temperatura em graus Fahrenheit e apresente-a convertida em graus Celsius.
    A formula de convers ´ ao˜ e: ´ C = 5.0 ∗ (F − 32.0)/9.0, sendo C a temperatura em Celsius
    e F a temperatura em Fahrenheit. 
*/
import javax.swing.JOptionPane;
public class Exer07 {
    public static void main(String[] args){
        // Entrada dos dados do usuario (Temperatura em °F).
        double f = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a temperatura de hoje em °F:"));
        // Processamento com a formula para coversão de °F para °C, em formato string.
        String c = "Hoje está fazendo "+ String.format("%.2f", 5*(f-32)/9);
        // Saida bonita para o usuario.
        JOptionPane.showMessageDialog(null, c.toUpperCase() + "°C", null, 1);
    }
}
