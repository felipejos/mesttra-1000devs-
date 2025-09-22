
package exercicio13g;

import java.util.Scanner;

public class propriedadeDistributivas {
    /*
     * Ler quatro valores numéricos inteiros e apresentar o resultado das adições e
     * das multiplicações
     * utilizando o mesmo raciocínio aplicado quando do uso de propriedades
     * distributivas para a
     * máxima combinação possível entre as quatro variáveis. Não é para calcular a
     * propriedade distributiva,
     * apenas para usar a sua forma de combinação. Considerando a leitura de valores
     * para as
     * variáveis A, B, C e D, devem ser feitas seis adições e seis multiplicações,
     * ou seja,
     * deve ser combinada a variável A com a variável B, a variável A com a variável
     * C, a variável A com a variável D.
     * Depois é necessário combinar a variável B com a variável C e a variável B com
     * a variável D e,
     * por fim, a variável C será combinada com a variável D.
     */

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a;
        int b;
        int c;
        int d;

        System.out.println("Digite os 4 valores inteiros: ");
        a = entrada.nextInt();
        b = entrada.nextInt();
        c = entrada.nextInt();
        d = entrada.nextInt();

        System.out.println("Os resultados das somas são: ");
        System.out.printf("%d + %d = %d\n", a, b, a + b);
        System.out.printf("%d + %d = %d\n", a, c, a + c);
        System.out.printf("%d + %d = %d\n", a, d, a + d);
        System.out.printf("%d + %d = %d\n", b, c, b + c);
        System.out.printf("%d + %d = %d\n", b, d, b + d);
        System.out.printf("%d + %d = %d\n", c, d, c + d);
        
        System.out.println("Os resultados das multiplicações são: ");
        System.out.printf("%d * %d = %d\n", a, b, a * b);
        System.out.printf("%d * %d = %d\n", a, c, a * c);
        System.out.printf("%d * %d = %d\n", a, d, a * d);
        System.out.printf("%d * %d = %d\n", b, c, b * c);
        System.out.printf("%d * %d = %d\n", b, d, b * d);
        System.out.printf("%d * %d = %d\n", c, d, c * d);

        entrada.close();
    }
}
