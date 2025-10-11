package lista3_estruturas_de_decisao.ex3;

import java.util.Scanner;

public class VendaFrutas {
    /*
     * Exercício 03: Uma loja de venda de frutas está vendendo frutas com a seguinte
     * tabela de preços:
     * 
     * - Até 5 Kg: Morango R$ 2,50 por Kg e Maçã R$ 1,80 por Kg
     * - Acima de 5 Kg: Morango R$ 2,20 por Kg e Maçã R$ 1,50 por Kg
     * 
     * Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra
     * ultrapassar R$ 25,00, receberá ainda um desconto de 10% sobre este total.
     * Escreva um algoritmo para ler a quantidade (em Kg) de morangos e a quantidade
     * (em Kg) de maças adquiridas e escreva o valor a ser pago pelo cliente.
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double qtdMorangoKg = 0;
        double valorTotalMorango = 0;
        double qtdMacaKg;
        double valorTotalMaca = 0;

        double qtdTotalFrutas = 0;
        double valorTotalFrutas = 0;
        double valorFinal = 0;


        System.out.print("Digite a quantidade em kg de morangos comprados:");
        qtdMorangoKg = entrada.nextDouble();

        System.out.print("Digite a quantidade em kg de maçãs compradas:");
        qtdMacaKg = entrada.nextDouble();

        qtdTotalFrutas = qtdMacaKg + qtdMorangoKg;

        if(qtdMacaKg <= 5.0){
            valorTotalMaca = qtdMacaKg * 1.80;
        }else if(qtdMacaKg > 5){
            valorTotalMaca = qtdMacaKg * 1.50;
        }

        if(qtdMorangoKg <= 5.0){
            valorTotalMorango = qtdMorangoKg * 2.50;
        }else if(qtdMorangoKg > 5){
            valorTotalMorango = qtdMorangoKg * 2.20;
        }

        valorTotalFrutas = valorTotalMaca + valorTotalMorango;
        
        if(qtdTotalFrutas > 8 || valorTotalFrutas > 25){
            valorFinal = valorTotalFrutas * 0.90;
        }

        System.out.printf("O Valor total é R$ %.2f", valorFinal);
        

        entrada.close();
    }
}
