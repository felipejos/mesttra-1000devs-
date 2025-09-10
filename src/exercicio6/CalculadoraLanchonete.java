package exercicio6;

import java.util.Scanner;

public class CalculadoraLanchonete {

	public static void main(String[] args) {
		
		/*Exercício 06: A lanchonete Gostosura vende apenas um tipo de sanduíche, 
		 * cujo recheio inclui duas fatias de queijo, uma fatia de presunto e uma 
		 * rodela de hambúrguer. Sabendo que cada fatia de queijo ou presunto pesa 50 gramas, 
		 * e que a rodela de hambúrguer pesa 120 gramas, faça um algoritmo em que o dono forneça 
		 * a quantidade de sanduíches a fazer, e a máquina informe as quantidades (em quilos)
		 *  de queijo, presunto e carne necessários para compra.*/
		
		Scanner entrada = new Scanner(System.in);
		
		int qtdSanduiche;
		double pesoQueijo = 50;
		double totQueijo;
		double pesoPresunto = 50;
		double totPresunto;
		double pesoCarne = 120;
		double totCarne;
		
		System.out.print("Digite a quntidade de sanduiches: ");
		qtdSanduiche = entrada.nextInt();
		entrada.nextLine();
		
		totQueijo = (pesoQueijo * qtdSanduiche) * 2 / 1000;
		totPresunto = (pesoPresunto * qtdSanduiche) / 1000;
		totCarne = (pesoCarne * qtdSanduiche) / 1000;
		
		System.out.printf("Para produzir %d sanduiches serão necessários:\n", qtdSanduiche);
		System.out.printf("%.2f kgs de mussarela\n" ,totQueijo);
		System.out.printf("%.2f kgs de presunto\n",totPresunto);
		System.out.printf("%.2f kgs de hamburger\n",totCarne);
		
		entrada.close();
	}
}
