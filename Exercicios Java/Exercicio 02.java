EXERCICIO 02 

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Exercicio 02 - Faça um algoritmo que receba dois números e ao final mostre a soma, subtração, multiplicação e a divisão
        dos dois números lidos;*/

        Scanner entrada = new Scanner (System.in);

        float consumo, distancia, volume;

        System.out.println("Qual a distancia a ser percorrida?");
        distancia = entrada.nextFloat();

        System.out.println("Qual o volume gasto em gasolina?");
        volume = entrada.nextFloat();

        consumo = (distancia / volume);

        System.out.println("Seu consumo médio é de:" + "" + consumo);

    }
}
