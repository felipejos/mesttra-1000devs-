package exercicio9c;

import java.util.Scanner;

public class volumeLataOleo {

    public static void main(String[] args) {
        /*
         Calcular e apresentar o valor do volume de uma lata de óleo, utilizando a fórmula 
         VOLUME <-- 3.14159 *R ^ 2 * ALTURA. 
         */
        
        Scanner entrada = new Scanner(System.in);

        double raio;
        double altura;

        System.out.print("Digite o raio da lata de oleo: ");
        raio = entrada.nextDouble();
        
        System.out.print("Digite o altura da lata de oleo: ");
        altura = entrada.nextDouble();

        double volume = 3.14159 * Math.pow(raio, 2) * altura;

        System.out.printf("O volume da lata de oleo é %.2f", volume);

        entrada.close();
    }
}
