package lista3_estruturas_de_decisao.ex4;

import java.util.Scanner;

public class Salario {
    /*
     * Exercício 04: Um empresa resolveu dar um aumento de salário aos seus
     * colaboradores e lhe contraram para desenvolver o programa que calcularáos
     * reajustes. Faça um programa que recebe o salário de um colaborador e faça o
     * reajuste segundo o seguinte critério, baseado no salário atual:
     * 
     * - salários até R$ 280,00 (incluindo) : aumento de 20%
     * - salários entre R$ 280,00 e R$ 700,00: aumento de 15%
     * - salários entre R$ 700,00 e R$ 1500,00: aumento de 10%
     * - salários de R$ 1500,00 em diante: aumento de 5%
     * 
     * Após o aumento ser realizado, informe na tela:
     * - o salário antes do reajuste;
     * - o percentual de aumento aplicado;
     * - o valor do aumento;
     * - o novo salário, após o aumento.
     */

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double salario = 0;
        double salarioFinal = 0;
        double aumento1 = 1.20;
        double aumento2 = 1.15;
        double aumento3 = 1.10;
        double aumento4 = 1.05;
        double valorAlmentado = 0;

        System.out.print("Digite o salario: ");
        salario = entrada.nextDouble();

        if (salario <= 280) {
            salarioFinal = salario * aumento1;
            aumento1 = 20;
            valorAlmentado = salarioFinal - salario;
            System.out.printf("O Salario de R$ %.2f, com o aumento de %.0f%%, teve R$ %.2f de aumento, e ficou em R$ %.2f", salario, aumento1, valorAlmentado, salarioFinal);
        } else if (salario > 280 && salario < 700) {
            salarioFinal = salario * aumento2;
            aumento2 = 15;
            valorAlmentado = salarioFinal - salario;
            System.out.printf("O Salario de R$ %.2f, com o aumento de %.0f%%, teve R$ %.2f de aumento, e ficou em R$ %.2f", salario, aumento2, valorAlmentado, salarioFinal);
        } else if (salario >= 700 && salario < 1500) {
            salarioFinal = salario * aumento3;
            aumento3 = 10;
            valorAlmentado = salarioFinal - salario;
            System.out.printf("O Salario de R$ %.2f, com o aumento de %.0f%%, teve R$ %.2f de aumento, e ficou em R$ %.2f", salario, aumento3, valorAlmentado, salarioFinal);
        } else {
            salarioFinal = salario * aumento4;
            aumento4 = 5;
            valorAlmentado = salarioFinal - salario;
            System.out.printf("O Salario de R$ %.2f, com o aumento de %.0f%%, teve R$ %.2f de aumento, e ficou em R$ %.2f", salario, aumento4, valorAlmentado, salarioFinal);
        }

        entrada.close();
    }
}
