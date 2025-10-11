package lista3_estruturas_de_decisao.ex7;
import java.util.Scanner;

public class ConceitoAluno {
    /*
     * Exercício 07: Faça um programa que lê as duas notas parciais obtidas por um
     * aluno numa disciplina ao longo de um semestre, e calcule a suamédia
     * apresentando na tela qual o conceito obtido. A atribuição de conceitos
     * obedece à tabela abaixo:
     * 
     * Média de Aproveitamento
     * Intervalo dos Valores Conceito
     * Entre 9 e 10----A
     * Entre 7.5 e 9---B
     * Entre 6 e 7.5---C
     * Entre 4 e 6-----D
     * Entre 0 e 4-----E
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota1;
        double nota2;
        double media;
        String conceito = " ";

        try {
            System.out.print("Digite a primeira nota: ");
            nota1 = entrada.nextDouble();

            System.out.print("Digite a segunda nota: ");
            nota2 = entrada.nextDouble();

            media = (nota1 + nota2) / 2;

            if (media > 9 && media <= 10) {
                conceito = "A";
            } else if (media > 7.5 && media <= 9) {
                conceito = "B";
            } else if (media > 6 && media <= 7.5) {
                conceito = "C";
            } else if (media > 4 && media <= 6) {
                conceito = "D";
            } else if (media > 0 && media <= 4) {
                conceito = "E";
            } else {
                System.out.println("Notas Invalidas");
            }

            System.out.println("Seu conceito é:" + conceito);

        } catch (Exception InputMismatchException) {
            System.out.println("Erro... O que você digitou não é uma nota!!!");
        }

        entrada.close();
    }
}