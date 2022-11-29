//EXERCICIO 08//

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
           /*Elabore um algoritmo que efetue a apresentação do valor da conversão em real (R$) de um valor lido em
dólar (US$). O algoritmo deverá solicitar o valor da cotação do dólar e também a quantidade de dólares
disponíveis com ousuário;*/
        Scanner entrada = new Scanner(System.in);
       float ValorDolar, valorReal, conversao, qtDeDolares;

        System.out.println("Valor em real (R$):");
        valorReal = entrada.nextFloat();

        System.out.println("Valor em dolar (U$$):");
        ValorDolar = entrada.nextFloat();

        System.out.println("Qual a quantidade de Dolares (U$$)?:");
        qtDeDolares = entrada.nextFloat();

        conversao = valorReal/ValorDolar;

        System.out.println("Você tem U$$: "+ conversao);

    }
}
