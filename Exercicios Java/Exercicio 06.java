EXERCICIO 06

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*EXERCIO 06
        Leia dois valores para as variáveis A e B, e efetuar as trocas dos valores de forma que a variável A passe a
possuir o valor da variável B e a variável B passe a possuir o valor da variável A. Apresentar os valores trocados;*/

        Scanner entrada = new Scanner (System.in);
        int a, b;

        System.out.println("O valor de A: ");
        a = entrada.nextInt();

        System.out.println("O valor de B: ");
        b = entrada.nextInt();

        a = b;
        b = a;

        System.out.println("A é: " + a + "e" + "B é: " + b);

    }
}
