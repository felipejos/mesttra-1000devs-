package lista3_estruturas_de_decisao.ex5;

import java.util.Scanner;

public class CalculoFolhaPagamento {
    /*
     * Exercício 05: Faça um programa para o cálculo de uma folha de pagamento,
     * sabendo que os descontos são do Imposto de Renda, que depende dosalário bruto
     * (conforme tabela abaixo) e 3% para o Sindicato e que o FGTS corresponde a 11%
     * do Salário Bruto, mas não é descontado (é a empresa que deposita). O Salário
     * Líquidocorresponde ao Salário Bruto menos os descontos. O programa deverá
     * pedir ao usuário o valor da sua hora e a quantidade de horas trabalhadas no
     * mês.
     * 
     * Desconto do IR:
     * Salário Bruto até 900 (inclusive) - isento
     * Salário Bruto até 1500 (inclusive) - desconto de 5%
     * Salário Bruto até 2500 (inclusive) - desconto de 10%
     * Salário Bruto acima de 2500 - desconto de 20%
     * 
     * Imprima na tela as informações, dispostas conforme o exemplo abaixo.
     * 
     * Exemplo:
     * 
     * QTDE de Horas Trabalhadas: 5
     * Valor da hora trabalhada R$: 220.00
     * Salário Bruto: (5 * 220) : R$ 1100,00
     * (-) IR (5%) : R$ 55,00
     * (-) INSS ( 10%) : R$ 110,00
     * FGTS (11%) : R$ 121,00
     * Total de descontos : R$ 165,00
     * Salário Liquido : R$ 935,00
     */

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double impostoDeRenda;
        double sindicato = 0.03;
        double fgts = 0.11;
        double salarioBruto = 0;
        double salarioLiquido;
        double valorHora;
        double horasTrabalhadasMes;
        double descontoSindicato;
        double inss = 0;
        double totalDescontos;
        double resultadoIR = 0;

        System.out.print("Digite o valor da hora de trabalho");
        valorHora = entrada.nextDouble();

        System.out.print("Digite a quantidade de horas trabalhadas");
        horasTrabalhadasMes = entrada.nextDouble();

        salarioBruto = valorHora * horasTrabalhadasMes;
        descontoSindicato = salarioBruto * sindicato;
        inss = salarioBruto * 0.10;

        if (salarioBruto <= 900) {
            impostoDeRenda = 0;
            totalDescontos = descontoSindicato + inss; 
            salarioLiquido = salarioBruto - totalDescontos;
        } else if (salarioBruto <= 1500 && salarioBruto > 900) {
            impostoDeRenda = 5;
            resultadoIR = salarioBruto * (impostoDeRenda / 100);
            totalDescontos = resultadoIR + descontoSindicato + inss;
            salarioLiquido = salarioBruto - totalDescontos;
            fgts = salarioBruto * 0.11;
        } else if (salarioBruto <= 2500 && salarioBruto > 1500) {
            impostoDeRenda = 10;
            resultadoIR = salarioBruto * (impostoDeRenda / 100);
            totalDescontos = resultadoIR + descontoSindicato + inss;
            salarioLiquido = salarioBruto - totalDescontos;
            fgts = salarioBruto * 0.11;
        } else {
            impostoDeRenda = 20;
            resultadoIR = salarioBruto * (impostoDeRenda / 100);
            totalDescontos = resultadoIR + descontoSindicato + inss;
            salarioLiquido = salarioBruto - totalDescontos;
            fgts = salarioBruto * 0.11;
        }

        

        System.out.printf("QTDE de Horas Trabalhadas: %.0f", horasTrabalhadasMes);
        System.out.printf("\nValor da hora trabalhada R$: %.2f", valorHora);
        System.out.printf("\nSalário Bruto: (%.0f * %.0f) : R$ %.2f", horasTrabalhadasMes, valorHora, salarioBruto);
        System.out.printf("\n(-) IR (%.0f%%) : R$%.2f", impostoDeRenda, (salarioBruto * (impostoDeRenda / 100)));
        System.out.printf("\n(-) INSS (10%%): R$ %.2f", inss);
        System.out.printf("\nFGTS (11%%): R$ %.2f", fgts);
        System.out.printf("\nTotal de descontos: R$ %.2f", totalDescontos);
        System.out.printf("\nSalário Liquido: R$ %.2f", salarioLiquido);

        entrada.close();
    }

}
