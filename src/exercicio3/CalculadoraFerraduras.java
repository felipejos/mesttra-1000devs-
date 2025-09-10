package exercicio3;

import java.util.Scanner;

public class CalculadoraFerraduras {

	public static void main(String[] args) {
		
		/*Exercício 03: Faça um algoritmo para calcular quantas ferraduras são 
		 * necessárias para equipar todos os cavalos comprados para um haras. 
		 * O usuário devera informar a quantidade de cavalos adquiridos.*/
		
		Scanner entrada = new Scanner(System.in);
		
		int qtdCavalos;
		double valorUndFerraduras;
		int qtdFerraduras;
		double valorTotFerraduras;
		
		System.out.print("Informe quantidade de cavalos: ");
		qtdCavalos = entrada.nextInt();
		entrada.hasNextLine();
		
		System.out.print("Informe o valor de cada ferradura R$: ");
		valorUndFerraduras = entrada.nextDouble();
		entrada.hasNextLine();
		
		qtdFerraduras = qtdCavalos * 4;
		valorTotFerraduras = qtdFerraduras * valorUndFerraduras;
		
		System.out.printf("A quantidade de ferraduras necessarias: %d\n", qtdFerraduras);
		System.out.printf("Valor total para a compra das ferraduras: R$ %.2f", valorTotFerraduras);
		
		entrada.close();
	}
}
