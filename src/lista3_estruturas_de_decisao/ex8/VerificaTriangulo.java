package lista3_estruturas_de_decisao.ex8;

import java.util.Scanner;

public class VerificaTriangulo {
    /*
     * Exercício 08: Faça um Programa que peça os 3 lados de um triângulo. O
     * programa deverá informar se os valores podem ser um triângulo. Caso seja um
     * triângulo indique o tipo do triângulo: equilátero, isósceles ou escaleno.
     * Dicas:
     * 
     * - Para saber se é um triângulo: Cada lado individual deve ser menor que a
     * soma dos outros dois lados que restaram. Você deve validar se cada
     * ladosatisfaça este creitério.
     * 
     * - Triângulo Equilátero: três lados iguais;
     * - Triângulo Isósceles: quaisquer dois lados iguais;
     * - Triângulo Escaleno: três lados diferentes;
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double lado1 = 0;
        double lado2 = 0;
        double lado3 = 0;

        while (true) {
            try {
                System.out.print("Digite o 1º lado: ");
                lado1 = entrada.nextDouble();

                System.out.print("Digite o 2º lado: ");
                lado2 = entrada.nextDouble();

                System.out.print("Digite o 3º lado: ");
                lado3 = entrada.nextDouble();

                if (lado1 < (lado2 + lado3) && lado2 < (lado1 + lado3) && lado3 < (lado1 + lado2)) {
                    if (lado1 == lado2 && lado2 == lado3) {
                        System.out.println("Triangulo Equilátero");
                        break;
                    } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
                        System.out.println("Triangulo Isósceles");
                        break;
                    } else if (lado1 != lado2 || lado2 != lado3 || lado1 == lado3) {
                        System.out.println("Triangulo Escaleno");
                        break;
                    }
                }
            } catch (Exception InputMismatchException) {
                System.out.println("O valor digitado não é um numero!!!");
            } 
        }

        entrada.close();
    }
}
