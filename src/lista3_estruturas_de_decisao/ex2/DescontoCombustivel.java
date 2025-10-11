package lista3_estruturas_de_decisao.ex2;

import java.util.Scanner;

public class DescontoCombustivel {

    /*
     * Exercício 01: Um posto está vendendo combustíveis com a seguinte tabela de
     * descontos:
     * 
     * Álcool:
     * - até 20 litros, desconto de 3% por litro
     * - acima de 20 litros, desconto de 5% por litro
     * 
     * Gasolina:
     * - até 20 litros, desconto de 4% por litro
     * - acima de 20 litros, desconto de 6% por litro
     * 
     * Escreva um algoritmo que leia o número de litros vendidos, o tipo de
     * combustível como um número inteiro (codificado da seguinte forma: 1 - álcool,
     * 2 - gasolina), calcule e imprima o valor a ser pago pelo cliente sabendo-se
     * que o preço do litro da gasolina é R$ 5,50 e o preço do litro do álcool é R$
     * 3,90.
     */

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double qtdLitros;
        int tipoCombustivel;
        double valorAlcool = 3.90;
        double valorGasolina = 5.50;
        double valorTotal;

        System.out.println("Qual o tipo de Combustivel:\n    1 - Alcool\n    2 - Gasolina");
        tipoCombustivel = entrada.nextInt();

        System.out.println("Digite a quantidade de litros: ");
        qtdLitros = entrada.nextDouble();

        if(tipoCombustivel == 1){
            if(qtdLitros <= 20){
                valorTotal = (qtdLitros * valorAlcool) *0.97;
                System.out.printf("O valor total é %.2f: ", valorTotal);
            }else if(qtdLitros > 20){
                valorTotal = (qtdLitros * valorAlcool) * 0.95;
                System.out.printf("O valor total é %.2f: ", valorTotal);
            }
        } else if(tipoCombustivel == 2){
            if(qtdLitros <= 20){
                valorTotal = (qtdLitros * valorGasolina) *0.96;
                System.out.printf("O valor total é %.2f: ", valorTotal);
            }else if(qtdLitros > 20){
                valorTotal = (qtdLitros * valorGasolina) * 0.94;
                System.out.printf("O valor total é %.2f: ", valorTotal);
            }
        }

        entrada.close();
    }
}