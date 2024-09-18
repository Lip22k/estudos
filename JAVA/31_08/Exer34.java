import javax.swing.JOptionPane;

public class Exer34{
    public static void main(String[] args){
        double raio = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a area do circulo: "));
        JOptionPane.showMessageDialog(null, "A area do circulo é: "+String.format("%.2f", Math.PI * Math.pow(raio, 2)), "Calculo de are de circulo", 1);
    }
} 