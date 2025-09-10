package exercicio4;

import java.util.Scanner;

public class calculoSalarioComDesconto {

	public static void main(String[] args) {
		
		/*Exercício 04: Faça um algoritmo para ler o salário de um funcionário e aumentá-lo em 15%. 
		 * Após o aumento, desconte 11% de INSS e 8% de FGTS. Imprima o salário inicial, 
		 * o salário com o aumento, o salário final, o desconto do INSS, 
		 * o desconto do FGTS e o Total de Descontos (INSS+FGTS).*/
		
		Scanner entrada = new Scanner(System.in);
		
		double salarioInicial;
		double salarioReajustado;
		double descontoInss;
		double descontoFgts;
		double totalDescontos;
		double salarioFinal;
		
		System.out.print("Informe o salario: ");
		salarioInicial = entrada.nextDouble();
		entrada.nextLine();
		
		salarioReajustado = salarioInicial + (salarioInicial * 0.15);
		descontoInss = salarioReajustado * 0.11;
		descontoFgts = salarioReajustado * 0.08;
		totalDescontos = descontoInss + descontoFgts;
		salarioFinal = salarioReajustado - totalDescontos;
		
		System.out.printf("Salario Inicial: %.2f\n", salarioInicial);
		System.out.printf("Salario Reajustado: %.2f\n", salarioReajustado);
		System.out.printf("Desconto 11%% INSS: %.2f\n",descontoInss);
		System.out.printf("Desconto 8%% FGTS: %.2f\n", descontoFgts);
		System.out.printf("Total de descontos INSS+FGTS: %.2f\n", totalDescontos);
		System.out.printf("Salario Final: %.2f", salarioFinal);
		
		
		
		entrada.close();
	}
}
