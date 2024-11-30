

import java.util.Scanner;
public class Compras {

    public static void main(String[] args) {
        int qtdParcelas, vistoPrazo;
        double valorCompra, juros, totalComJuros;
        String metodoPagamento;

        // Instaciamento da classe
        Scanner sc = new Scanner(System.in);

        // Garantia de um valor positivo
        do{
            System.out.print("Qual o valor da compra: ");
            valorCompra = sc.nextDouble();
        }while(valorCompra<0);
        
        // Garantia de escolha dentre essas opções
        do{
            System.out.print("Digite \n1 - para pagamento a vista\n2 - para pagamento a prazo:\n-> ");
            vistoPrazo = sc.nextInt();
        }while (vistoPrazo!=1 && vistoPrazo!=2);
        
        +
        
        if (vistoPrazo == 1) {
            do{
                System.out.println("Pagamento a VISTA escolhido");
                System.out.println("P - pagamento via PIX\nB - pagamento via BOLETO");
                metodoPagamento = sc.nextLine();
            }while(metodoPagamento.toLowerCase() != "p" && metodoPagamento.toLowerCase() != "b");
            
            if (metodoPagamento.toLowerCase() == "p") {
                System.out.println("Metodo de pagamento PIX escolhido obtendo 10% de desconto");
                System.out.printf("Você pagará: %.2f", valorCompra*0.9);
            }else if (metodoPagamento.toLowerCase() == "b"){
                System.out.println("Metodo de pagamento BOLETO escolhido obtendo 5% de desconto");
                System.out.printf("Você pagará: R$ %.2f", valorCompra*0.95);
            }
        }else{
            do{      
                System.out.println("Por favor escolha umas das opções abaixo: ");          
                for (int i = 2; i <= 10; i++) {
                    if (i>=5) {
                        juros = valorCompra*i*0.02;
                        totalComJuros = juros+valorCompra;
                        System.out.printf(i+"X de %.2f, totalzando %.2f\n", totalComJuros/i, totalComJuros);
                    }else{
                        System.out.printf(i+"X de %.2f, totalzando %.2f\n", valorCompra/i, valorCompra);
                    }
                }
                System.out.print("->");
                qtdParcelas = sc.nextInt();
            }while (qtdParcelas<2||qtdParcelas>10);

            if (qtdParcelas>4) {
                System.out.printf("Você escolher pagar em "+ qtdParcelas +" de %.2f totalizando %.2f", (valorCompra*qtdParcelas*0.02+valorCompra)/qtdParcelas, valorCompra+(valorCompra*qtdParcelas*0.02));
            }else{
                System.out.println("Você escolheu pagar em "+qtdParcelas+"X de "+ valorCompra/qtdParcelas+" totalizando: "+valorCompra);
            }
        }
        sc.close();
    }
}