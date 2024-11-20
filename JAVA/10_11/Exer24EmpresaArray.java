/*
Uma empresa vende o mesmo produto para quatro diferentes estados. Cada estado
possui uma taxa diferente de imposto sobre o produto (MG 07%; SP 12%; RJ 15%; MS
08%). Fac¸a um programa em que o usuario entre com o valor e o estado destino do ´
produto e o programa retorne o prec¸o final do produto acrescido do imposto do estado
em que ele sera vendido. Se o estado digitado n ´ ao for v ˜ alido, mostrar uma mensagem ´
de erro. 
*/

import javax.swing.JOptionPane;
public class Exer24EmpresaArray {

    public static void main(String[] args) {
        String mg = "mg", sp= "sp", rj= "rj", ms= "ms";
        double mgImposto = 1.07, spImposto=1.12, rjImposto=1.15, msImposto=1.08;

        double valorProduto = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do produto"));
        String estadoImposto = JOptionPane.showInputDialog(null, "Digite o estado \n->MG - Minas Gerais \n->SP - São Paulo \n->RJ - Rio de Janeiro\n->MS - Mato Grosso do Sul");
        
        if (mg.equals(estadoImposto.toLowerCase())) {
            JOptionPane.showMessageDialog(null, "O valor original do produto é: R$"+valorProduto+"\n o imposto do estado de "+mg+" é de "+mgImposto+"%\n Você pagará no total: R$"+valorProduto*mgImposto);
        }else if(sp.equals(estadoImposto.toLowerCase())){
            JOptionPane.showMessageDialog(null, "O valor original do produto é: R$"+valorProduto+"\n o imposto do estado de "+sp+" é de "+spImposto+"%\n Você pagará no total: R$"+valorProduto*spImposto);
        }else if(rj.equals(estadoImposto.toLowerCase())){
            JOptionPane.showMessageDialog(null, "O valor original do produto é: R$"+valorProduto+"\n o imposto do estado de "+rj+" é de "+rjImposto+"%\n Você pagará no total: R$"+valorProduto*rjImposto);
        }else if(ms.equals(estadoImposto.toLowerCase())){
            JOptionPane.showMessageDialog(null, "O valor original do produto é: R$"+valorProduto+"\n o imposto do estado de "+ms+" é de "+msImposto+"%\n Você pagará no total: R$"+valorProduto*msImposto);
        }else{
            JOptionPane.showMessageDialog(null, "O estado "+estadoImposto.toUpperCase()+" não está cadastrado na nossa base de dados, reinicie o programa e tente novamente.");
        }
    }
}
/*
public class Exer24EmpresaArray {
    public static void main(String[] args) {
        boolean res = false;
        String[] estados = {"mg","sp","rj","ms"};
        double[] porc = {1.07, 1.12, 1.15, 1.08};

        double valorProduto = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do produto"));
        String estadoImposto = JOptionPane.showInputDialog(null, "Digite o estado \n->MG - Minas Gerais \n->SP - São Paulo \n->RJ - Rio de Janeiro\n->MS - Mato Grosso do Sul");
        
        for (int i = 0; i < estados.length; i++) {
            if (estados[i].equals(estadoImposto.toLowerCase())){
                res = true;
                JOptionPane.showMessageDialog(null, "O valor original do produto é: R$"+valorProduto+"\n o imposto do estado de "+estados[i]+" é de "+porc[i]+"%\n Você pagará no total: R$"+valorProduto*porc[i]);
            }
        }
        if (res == false) {
            JOptionPane.showMessageDialog(null, "O estado "+estadoImposto.toUpperCase()+" não está cadastrado na nossa base de dados, reinicie o programa e tente novamente.");
        }
    }
}
*/