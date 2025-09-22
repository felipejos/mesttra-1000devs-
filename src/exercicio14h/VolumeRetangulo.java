package exercicio14h;

import java.util.Scanner;

public class VolumeRetangulo {

    /*
     * Elaborar um programa que calcule e apresente o valor do volume de uma caixa
     * retangular, utilizando a fórmula VOLUME = COMPRIMENTO* LARGURA* ALTURA.
     */

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double comprimento;
        double largura;
        double altura;
        double volume;

        System.out.print("Digite o comprimento: ");
        comprimento = entrada.nextDouble();

        System.out.print("Digite o largura: ");
        largura = entrada.nextDouble();
        
        System.out.print("Digite o altura: ");
        altura = entrada.nextDouble();
        
        volume = comprimento * largura * altura;
        
        System.out.printf("Volume do retangulo é: %.2f", volume);
        
        
        entrada.close();
    }
}
