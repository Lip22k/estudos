import javax.swing.JOptionPane;

public class Exer13 {
    public static void main(String[] args){
        double km = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a distancia em KM: "));
        JOptionPane.showMessageDialog(null, "A distancia em milhas é: " + String.format("%.2f",km/1.61), "Calculo de distancia em milhas", 2);
    }
}
