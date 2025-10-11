package lista3_estruturas_de_decisao.ex1;

import java.util.Scanner;

public class NotaAluno {

    /*
     * Exercício 01: Faça um programa para a leitura de duas notas parciais de um
     * aluno. O programa deve calcular a média alcançada por aluno e apresentar:
     * 
     * A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
     * A mensagem "Reprovado", se a média for menor do que sete;
     * A mensagem "Aprovado com Distinção", se a média for igual a dez.
     */

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota1;
        double nota2;
        double media;

        System.out.print("Digite a primeira nota do aluno: ");
        nota1 = entrada.nextDouble();

        System.out.print("Digite a segunda nota do aluno: ");
        nota2 = entrada.nextDouble();

        media = (nota1 + nota2) / 2;

        if(media >= 7){
            System.out.print("Aprovado");
        }else{
            System.out.print("Reprovado");
        }

        if(media == 10){
            System.out.println(" com Distinção");
        }

        entrada.close();
    }
}
