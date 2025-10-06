package exercicio16k;

import java.util.Scanner;

public class RealEmDolar {

    /*
     * Elaborar um programa que apresente o valor da conversão em real (R$) de um
     * valor lido em dólar
     * (US$). O programa deve solicitar o valor da cotação do dólar e também a
     * quantidade de dólares
     * disponível com o usuário.
     */

    public static void main(String[] args) {

        double dolar;
        double real;
        double cotacao;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual o valor do dolar hoje? ");
        cotacao = entrada.nextDouble();

        System.out.println("Quantos dolares quer converter em Real? ");
        dolar = entrada.nextDouble();

        real = dolar * cotacao;

        System.out.printf("O valor de $ %.2f em reais é: R$ %.2f", dolar, real);


        entrada.close();
    }
}
