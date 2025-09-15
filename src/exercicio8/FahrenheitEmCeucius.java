package exercicio8;

import java.util.Scanner;

public class FahrenheitEmCeucius {

    public static void main(String[] args) {

        /*
         Ler uma temperatura em graus Fahrenheit e apresentá-la convertida em graus Celsius. A fórmula
            de conversão é C +-- ((F - 32) * 5) / 9, sendo F a temperatura em Fahrenheit e C a temperatura
            em Celsius. 
         */
        
        Scanner entrada = new Scanner(System.in);

        double fahrenheit;
        double celcius;

        System.out.print("Digite a temperatura em Fahrenheit: ");
        fahrenheit = entrada.nextDouble();

        celcius = ((fahrenheit - 32) * 5) / 9;

        System.out.printf("A temperatura convertida é %.1fºC", celcius);


        entrada.close();
    }
}
