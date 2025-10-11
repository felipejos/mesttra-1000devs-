package lista3_estruturas_de_decisao.ex6;

import java.util.Scanner;

public class NumerandoDiasDaSemana {
    /*
     * Exercício 06: Faça um Programa que leia um número e exiba o dia
     * correspondente da semana, conforme esta regra: (1 - Domingo, 2 - Segunda, 3 -
     * Terça, 4 - Quarta, 5 - Quinta, 6 -Sexta e 7 - Sábado). Se o usuário digitar
     * outro valor deve aparecer valor inválido.
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero = 0;

        try {
            while (numero == 0) {
            System.out.print("Digite um numero de 1 a 7 para ver qual é o dia da semana: ");
            numero = entrada.nextInt();

            switch (numero) {
                case 1:
                    System.out.println("1 - Domingo");
                    break;
                case 2:
                    System.out.println("2 - Segunda");
                    break;
                case 3:
                    System.out.println("3 - Terça");
                    break;
                case 4:
                    System.out.println("4 - Quarta");
                    break;
                case 5:
                    System.out.println("5 - Quinta");
                    break;
                case 6:
                    System.out.println("6 - Sexta");
                    break;
                case 7:
                    System.out.println("7 - Sabado");
                    break;
                default:
                    numero = 0;
                    System.err.println("Numero Invalido, tente novamente:");
            }
        }
        } catch (Exception InputMismatchException) {
            System.out.println("Erro... Você não digitou um numero valido!!!");
        }
        

        entrada.close();
    }
}
