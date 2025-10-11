package lista3_estruturas_de_decisao.ex9;

import java.util.Scanner;

public class PerguntasSobreCrime {
    /*
     * Exercício 09: Faça um programa que faça 5 perguntas para uma pessoa sobre um
     * crime. As perguntas são:
     * 
     * "Telefonou para a vítima?"
     * "Esteve no local do crime?"
     * "Mora perto da vítima?"
     * "Devia para a vítima?"
     * "Já trabalhou com a vítima?"
     * 
     * O usuário deve responder em cada pergunta: 1 para sim ou 0 para não. O
     * programa deve no final emitir uma classificação sobre a participação da
     * pessoa no crime. Se a pessoa responder sim em 2 questões ela deve ser
     * classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como
     * "Assassino". Caso contrário, ele será classificado como "Inocente".
     */

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String perg1;
        String perg2;
        String perg3;
        String perg4;
        String perg5;
        int cont = 0;

        System.out.print("Telefonou para a vítima? Sim ou Nao ");
        perg1 = entrada.nextLine();
        if (perg1.equalsIgnoreCase("sim")) {
            cont += 1;
        }
        System.out.print("Esteve no local do crime? Sim ou Nao ");
        perg2 = entrada.nextLine();
        if (perg2.equalsIgnoreCase("sim")) {
            cont += 1;
        }
        System.out.print("Mora perto da vítima? Sim ou Nao ");
        perg3 = entrada.nextLine();
        if (perg3.equalsIgnoreCase("sim")) {
            cont += 1;
        }
        System.out.print("Devia para a vítima? Sim ou Nao ");
        perg4 = entrada.nextLine();
        if (perg4.equalsIgnoreCase("sim")) {
            cont += 1;
        }
        System.out.print("Já trabalhou com a vítima? Sim ou Nao ");
        perg5 = entrada.nextLine();
        if (perg5.equalsIgnoreCase("sim")) {
            cont += 1;
        }

        if (cont == 2) {
            System.out.println("Pessoa Suspeita!!!");
        } else if (cont >= 3 && cont <= 4) {
            System.out.println("É um cumplice!!!");
        } else if (cont == 5) {
            System.out.println("É Assassino!!!");
        } else {
            System.out.println("É inocente");
        }

        entrada.close();
    }
}