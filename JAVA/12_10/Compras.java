import javax.swing.JOptionPane;

public class Compras {
    public static void main(String[] args){
        // Declaração de variaveis
        double valorCompra;
        char metodoPagamento;
        int pagamento, count=2;

        valorCompra = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor da compra", "COMPRA DE VALORS", 2));
        
        while(valorCompra<=0){
            JOptionPane.showMessageDialog(null, "DIGITE O PREÇO CORRETO DO PRODUTO", null, 0);
            valorCompra = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor da compra", "COMPRA DE VALORS", 2));
        }

        do {
            pagamento = Integer.parseInt(JOptionPane.showInputDialog(null, "1 - pagamento a vista\n2 - pagamento a prazo", "COMPRA DE VALORS", 2));
        } while (pagamento != 1 && pagamento !=2);

        if (pagamento==1) {
            do{
                metodoPagamento = JOptionPane.showInputDialog(null, "P - pagamento via PIX\nB - pagamento via BOLETO", "COMPRA DE VALORS", 2).charAt(0);
            }while(metodoPagamento !='P' && metodoPagamento!='B' && metodoPagamento !='p' && metodoPagamento !='b');
            
            if (metodoPagamento=='P' || metodoPagamento=='p') {
                JOptionPane.showMessageDialog(null, "Você obteve 10% de desconto\nvalor a pagar:\n-> "+valorCompra*0.9, "COMPRA DE VALORS", 1);
            }else{
                JOptionPane.showMessageDialog(null, "Você obteve 10% de desconto\nvalor a pagar:\n-> "+valorCompra*0.95, "COMPRA DE VALORS", 1);
            }
        }else{
            String parcelas="", aux;
            while (count<=10) {
                if (count>6) {
                    aux = count+"X de R$"+ String.format("%.2f", (valorCompra*count*0.02)/10);
                    parcelas = parcelas+aux+"\n";
                    count++;
                }else{
                    aux = count+"X de R$"+ String.format("%.2f", valorCompra/count);
                    parcelas = parcelas+aux+"\n";
                    count++;
                }
            }
            do{
                pagamento = Integer.parseInt(JOptionPane.showInputDialog(null, parcelas,"COMPRA DE VALORS", 2));
            }while(pagamento<2 || pagamento>10);
            if (pagamento>6) {
                JOptionPane.showMessageDialog(null, "Você pagara "+pagamento+"X de R$"+ String.format("%.2f", (valorCompra*pagamento*0.02)/10), "COMPRA DE VALORS", 1);
            }else{
                JOptionPane.showMessageDialog(null, "Você pagara "+pagamento+"X de R$"+ String.format("%.2f", valorCompra/pagamento), "COMPRA DE VALORS", 1);
            }
        }
    }
}