package exercicio10;

import java.util.Scanner;

public class qtdLitrosViagem {

    public static void main(String[] args) {

        /*
         Efetuar o cálculo da quantidade de litros de combustível gasta em uma viagem, utilizando um
        automóvel que faz 12 quilômetros por litro. Para obter o cálculo, o usuário deve fornecer o tempo
        gasto (variável TEMPO) e a velocidade média (variável VELOCIDADE) durante a viagem. Desta
        forma, será possível obter a distância percorrida com a fórmula 
        DISTÂNCIA <-- TEMPO * VELOCIDADE. 
        A partir do valor da distância, basta calcular a quantidade de litros de combustível
        utilizada na viagem com a fórmula LITROS_USADOS +-- DISTÂNCIA/ 12. O programa deve
        apresentar os valores da velocidade média, tempo gasto na viagem, a distância percorrida e a
        quantidade de litros utilizada na viagem. 
         */
        
        Scanner entrada = new Scanner(System.in);

        double tempoHoras;
        double velocidadeKmH;
        double distancia;
        double litrosUsados;

        System.out.print("Digite o tempo de viagem em minutos: ");
        tempoHoras = entrada.nextDouble();
        
        System.out.print("Digite a velocidade media em Km/h: ");
        velocidadeKmH = entrada.nextDouble();

        distancia = tempoHoras * velocidadeKmH;
        litrosUsados = distancia / 12;

        System.out.printf("Velocidade média %.2f, tempo gasto na viagem %.2f, a distância percorrida %.2f e a\r\n" + //
                        "        quantidade de litros utilizada na viagem%.2f.", velocidadeKmH, tempoHoras, distancia, litrosUsados);

        entrada.close();
    }
}
