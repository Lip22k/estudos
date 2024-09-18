import javax.swing.JOptionPane;

public class Exer35{
    public static void main(String[] args){
        double cateto1 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor do 1° cateto"));
        double cateto2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor do 2° cateto"));
        JOptionPane.showMessageDialog(null, "O valor da hipotenusa = "+(Math.pow(Math.pow(cateto1, 2)+Math.pow(cateto2, 2), 0.5)));
    }
}