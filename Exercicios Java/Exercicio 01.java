EXERCICIO 01

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Exercicio 01 - Faça um algoritmo que receba dois números e exiba o resultado da sua soma;

        int numero01, numero02;

        Scanner entrada = new Scanner(System.in); /*entrada de dados*/
        System.out.println("Digite o primeiro numero:"); //solicitando na tela
        numero01 = entrada.nextInt(); //amarzena informação

        Scanner entradaDois = new Scanner(System.in);
        System.out.println("Digite o segundo numero:");
        numero02 = entradaDois.nextInt();

        int soma = numero01 + numero02;

        System.out.println("O resultado da soma é:" + soma);
    }
}
