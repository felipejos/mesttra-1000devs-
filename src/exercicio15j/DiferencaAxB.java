package exercicio15j;

import java.util.Scanner;

public class DiferencaAxB {
    /*
     * Ler dois valores numéricos inteiros (representados pelas variáveis A e B) e
     * apresentar o resultado
     * do quadrado da diferença do primeiro valor (variável A) em relação ao segundo
     * valor (variável B) .
     */

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int a;
        int b;
        int dif;

        System.out.println("Digite o valor de A e de B: ");
        a = entrada.nextInt();
        b = entrada.nextInt();

        dif = a - b;

        System.out.println(Math.pow(dif, 2));
        entrada.close();
    }
}
