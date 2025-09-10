package exercicio1;

import java.util.Scanner;

public class CalculadoraImobiliaria {

	public static void main(String[] args) {
		
		/*Exercício 01: Uma imobiliária vende apenas terrenos retangulares. 
		 * Faça um algoritmo para imprimir a área do terreno e o valor de venda do mesmo. 
		 * Para isto será necessário o usuário informar as dimensões em metros (frente e lateral) 
		 * do terreno além do valor cobrado pelo metro quadrado.*/
		
		Scanner entrada = new Scanner(System.in);
		
		//variaveis
		double areaFrente;
		double areaLateral;
		double valorMetrosQuadrados;
		double areaTotal;
		double valorTotal;
		
		System.out.print("Quantos metros o terreno possui de frente: ");
		areaFrente = entrada.nextDouble();
		entrada.nextLine();
		
		System.out.print("Quantos metros o terreno possui de lateral: ");
		areaLateral = entrada.nextDouble();
		entrada.nextLine();
		
		System.out.print("Informe o valor do metro quadrado: ");
		valorMetrosQuadrados = entrada.nextDouble();
		entrada.nextLine();
		
		areaTotal = areaFrente * areaLateral;
		
		valorTotal = areaTotal * valorMetrosQuadrados;
		
		System.out.printf("Area total do terreno de %.2f mts de frente com %.2f mts de lateral é %.2f mts \nO valor deste terreno é : R$ %.2f", areaFrente, areaLateral, areaTotal, valorTotal);
		
		entrada.close();
	}
}
