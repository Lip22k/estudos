import java.util.Scanner;

public class Exer39Salario {
/*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salario, bonus;
        int tempoServico;

        do {
            System.out.print("Qual o valor do Salario: ");
            salario=sc.nextDouble();
            System.out.print("Quantos anos está trabalhando na empresa: ");
            tempoServico=sc.nextInt();
        } while (tempoServico < 0 || salario < 0);

        if (salario<=500) {
            salario=salario*1.25;
            System.out.print("Você terá um reajuste de: 25%\n"); 
        }else if(salario<=1000){
            salario=salario*1.2;
            System.out.print("Você terá um reajuste de: 20%\n");
        }else if(salario<=1500){
            salario=salario*1.15;
            System.out.print("Você terá um reajuste de: 15%\n");
        }else if(salario<=2000){
            salario=salario*1.1;
            System.out.print("Você terá um reajuste de: 10%\n");
        }else{
            System.out.print("Seu salario não terá reajuste\n");
        }

        if (tempoServico<=1) {
            bonus=0;
            System.out.print("Você não possui idade suficiente para receber um bônus");
        }else if(tempoServico<=3){
            bonus=100.00;
            System.out.print("Você terá um bônus de: "+bonus);
        }else if(tempoServico<=6){
            bonus=200.00;
            System.out.print("Você terá um bônus de: "+bonus);
        }else if(tempoServico<=10){
            bonus=300.00;
            System.out.print("Você terá um bônus de: "+bonus);
        }else{
            bonus=500.00;
            System.out.print("Você terá um bônus de: "+bonus);
        }

        if (bonus==0) {
            System.out.print("\nSeu salario será: "+salario);
        }else{
            System.out.print("\nSeu salario será: "+(salario+bonus));
        }
        sc.close();
    }*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] salariosMinimos={2000, 1500, 1000, 500}, bonus = {100,200, 300, 500};
        int[] tempoServico = {10,6,3,1}, reajuste = {25, 20, 15, 10};

        double salario;
        int tempoServicoTrabalhado;

        String textoReajuste="", textoBonus="";
        do {
            System.out.print("Qual o valor do Salario: ");
            salario=sc.nextDouble();
            System.out.print("Quantos anos está trabalhando na empresa: ");
            tempoServicoTrabalhado=sc.nextInt();
        } while (tempoServicoTrabalhado < 0 || salario < 0);

        for (int i = 0; i < salariosMinimos.length; i++) {
            if (salario<=salariosMinimos[i]) {
                textoReajuste="Você terá um reajuste de: "+reajuste[i]+"%";
            }else{
                textoReajuste = "Seu salario não terá reajuste";
            }
        }
        for (int i = 0; i < tempoServico.length; i++) {
            if (tempoServicoTrabalhado<=tempoServico[i]) {
                textoBonus="Você terá um BÔNUS de: "+bonus[i];
            }else{
                textoBonus = "Você não possui idade suficiente para receber um bônus";
            }
        }
        System.out.println("Seu salario atual é de: R$"+String.format("%.2f", salario)+"\n"+textoReajuste+"\n"+textoBonus);
    }
} 