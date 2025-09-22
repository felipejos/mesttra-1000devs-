package exercicio12f;

import java.util.Scanner;

public class TrocaDeValores {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a;
        int b;
        int x;

        System.out.println("Digite o valor um para fazer a troca: ");
        a = entrada.nextInt();

        System.out.println("Digite o segundo valor: ");
        b = entrada.nextInt();

        x = a;
        a = b;
        b = x;

        System.out.printf("a = %d,\nb = %d", a, b);

        entrada.close();
    }
}
