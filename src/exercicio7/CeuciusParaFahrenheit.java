package exercicio7;

import java.util.Scanner;

public class CeuciusParaFahrenheit {

    /*
     Ler uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. A fórmula
        de conversão é F +-- (9 * C + 160) / 5, sendo F a temperatura em Fahrenheit e C a temperatura
        em Celsius. 
     */

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double celcius;
        double fahrenheit;

        System.out.print("Digite a temperatura em ºC: ");
        celcius = entrada.nextDouble();
        
        fahrenheit = (9 * celcius + 160) / 5;

        System.out.printf("A temperatura em Fahrenheit é: %.1fF", fahrenheit);


        entrada.close();
    }
}
