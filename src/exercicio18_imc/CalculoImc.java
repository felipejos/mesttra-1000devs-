package exercicio18_imc;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculoImc {

    /*
     * Desenvolver um algoritmo que obtenha o peso (em quilogramas) e a altura (em
     * metros) de uma pessoa, calcule o Índice de Massa Corporal (IMC) e informe a
     * classificação de obesidade com base no valor do IMC, conforme a tabela de
     * referência da Organização Mundial da Saúde (OMS). Submeta o arquivo java com
     * o código desenvolvido. Utilize os recursos aprendidos até agora, como
     * comentário, try catch e if else.
     */

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double peso;
        double altura;
        double imc;

        try {

            System.out.print("Digite seu peso em Kg: ");
            peso = entrada.nextDouble();

            System.out.print("Digite sua altura em metros: ");
            altura = entrada.nextDouble();

            imc = peso / Math.pow(altura, 2);

            if (imc < 18.5) {
                System.out.printf("Seu IMC é: %.2f. Você está abaixo do peso! (Baixo. Eutrófico.)", imc);
            } else if (imc >= 18.5 && imc < 25) {
                System.out.printf("\nSeu IMC é: %.2f. Você está no peso ideal!!! (PARABÉNS)", imc);
            } else if (imc >= 25 && imc < 30) {
                System.out.printf("\nSeu IMC é: %.2f. Cuidado está ficando com sobrepeso!!! (Pouco Elevado. Sobrepeso)", imc);
            } else if (imc >= 30 && imc < 35) {
                System.out.printf("\nSeu IMC é: %.2f. Cuidado está seu peso está elevado!!! (Pouco Elevado. Obesidade grau I.)", imc);
            } else if (imc >= 35 && imc < 40) {
                System.out.printf("\nSeu IMC é: %.2f. Cuidado está muito elevado!!! (Pouco Elevado. Obesidade grau II.)", imc);
            } else {
                System.out.printf("\nSeu IMC é: %.2f. ATENÇÃO, alto risco de saude, peso acima do limite!!! (Obesidade mórbida)", imc);
            }
        } catch (InputMismatchException e) {
            System.out.println("Valor digitado não é um numero");
        } catch (Exception e) {
            System.out.println("Erro desconhecido...");
            e.printStackTrace();
        }

        entrada.close();
    }
}
