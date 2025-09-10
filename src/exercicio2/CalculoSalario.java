package exercicio2;

import java.util.Scanner;

public class CalculoSalario {

	public static void main(String[] args) {
		
		/*Exercício 02: Faça um algoritmo que receba o valor do salário mínimo 
		 * e o valor do salário de um funcionário, calcule e mostre a quantidade 
		 * de salários mínimos que ganha esse funcionário.*/
		
		Scanner entrada = new Scanner(System.in);
		
		//variaveis
		double salarioMinimo;
		double salarioFuncionario;
		double qtdSalariosMinimos;
		
		System.out.print("Informe o valor do salrio minimo: ");
		salarioMinimo = entrada.nextDouble();
		entrada.nextLine();
		
		System.out.print("Informe o valor do salrio funcionario: ");
		salarioFuncionario = entrada.nextDouble();
		entrada.nextLine();
		
		qtdSalariosMinimos = salarioFuncionario / salarioMinimo;
		
		System.out.printf("O funcionario recebe %.1f salarios minimos!", qtdSalariosMinimos);
		
		entrada.close();
	}
}
