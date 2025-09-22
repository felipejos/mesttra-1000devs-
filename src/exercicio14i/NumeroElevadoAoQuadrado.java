package exercicio14i;

import java.util.Scanner;

public class NumeroElevadoAoQuadrado {
    /*
     * Efetuar a leitura de um valor numérico inteiro e apresentar o resultado do
     * valor lido elevado ao quadrado
     */

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int a;

        a = entrada.nextInt();

        System.out.println(Math.pow(a, 2));

        entrada.close();
    }
}
