package exercicio5;

import java.util.Scanner;

public class ControleDeFrango {

	public static void main(String[] args) {
		
		/*Exercício 05: A granja Frangotech possui um controle automatizado de cada frango da sua produção. 
		 * No pé direito do frango há um anel com um chip de identificação; 
		 * no pé esquerdo são dois anéis para indicar o tipo de alimento que ele deve consumir. 
		 * Sabendo que o anel com chip custa R$4,00 e o anel de alimento custa R$3,50, 
		 * faça um algoritmo para calcular o gasto total da granja para marcar 
		 * todos os seus frangos que deverá ser informado pelo usuário. */
		
		Scanner entrada = new Scanner(System.in);
		
		double anelChip = 4.00;
		double anelAlimento = 7.00;
		double totalValorAneis;
		double qtdFrango;
		double valorTotal;
		
		System.out.print("Digite a QTDE de frangos: ");
		qtdFrango = entrada.nextDouble();
		entrada.hasNextLine();
		
		totalValorAneis = anelChip + anelAlimento;
		
		valorTotal = totalValorAneis * qtdFrango;
		
		System.out.printf("O valor total para identificar os frangos é: R$ %.2f", valorTotal);
		
		entrada.close();
	}
}
