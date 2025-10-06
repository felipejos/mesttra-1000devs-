package exercicio17_trycatch;

import java.util.InputMismatchException;

//Escreva um algoritmo que leia as dimensões de um terreno (frente e lateral). 
//Leia também o valor do metro quadrado.
//Após as leituras, calcule a area total do terreno e o valor do terreno com base no valor do metro quadrado.
//Caso o terreno seja um quadrado perfeito, aumente o valor do terreno em 10% pois este terreno é mais valioso.
//Caso o terreno não seja um quadrado perfeito, de um desconto no valor total de 2%.

import java.util.Scanner;

public class exercicioteste {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
  
        int frenteMts, lateralMts;
        float valorMetroQuadrado, valorTerreno;

            try {
                System.out.print("Digite a metragem da frente do terreno: ");
                frenteMts = teclado.nextInt();

                System.out.print("Digite a metragem da lateral do terreno: ");
                lateralMts = teclado.nextInt();

                System.out.print("Digite o valor do metro quadrado: ");
                valorMetroQuadrado = teclado.nextFloat();

                //calculando o valor do terreno
                valorTerreno = frenteMts * lateralMts * valorMetroQuadrado;

                // estrutura de decisão composta
                if (frenteMts == lateralMts) { //condicao para ver se é um quadrado
                    //este bloco é executado se a condição (frenteMts == lateralMts) for verdadeira 
                    //que o valor do terreno seja acrescido em 10%
                    //valorTerreno = (valorTerreno * 0.1f) + valorTerreno;
                    valorTerreno = (valorTerreno * 1.1f);
                } else {//se nao for quadrado da um desconto
                    //este bloco é executado se a condição (frenteMts == lateralMts) for falsa 
                    //valorTerreno = (valorTerreno * 0.02f) - valorTerreno;
                    valorTerreno = (valorTerreno * 0.98f);
                } 

                System.out.printf("O valor do terreno é: R$ %.2f reais", valorTerreno);
                
            }catch (InputMismatchException e) {
                System.out.println("Valor digitado não é um numero");
            }catch (Exception e) {
                System.out.println("Erro desconhecido...");
                e.printStackTrace();
            }
            
            teclado.close();
    }
}