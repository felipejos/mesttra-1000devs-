package exercicio11;

import java.util.Scanner;

public class prestacaoAtraso {

    public static void main(String[] args) {
        
        /*Efetuar o cálculo e apresentar o valor de uma prestação de um bem em atraso, utilizando a
            fórmula PRESTAÇÃO+-- VALOR+ (VALOR* (TAXA/100) * TEMPO).  */

        Scanner entrada = new Scanner(System.in);

        double valor;
        double taxa;
        double tempoAtraso;
        double prestacao;

        System.out.print("Informe o valor da prestação: ");
        valor = entrada.nextDouble();
        
        System.out.print("Informe o taxa da prestação: ");
        taxa = entrada.nextDouble();
        
        System.out.print("Informe o tempo de atraso da prestação: ");
        tempoAtraso = entrada.nextDouble();

        prestacao = valor + (valor * (taxa / 100) * tempoAtraso);

        System.out.printf("O valor atualizado da prestação é: R$ %.2f", prestacao);

        
        entrada.close();
    }
}
