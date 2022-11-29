EXERCICIO 03 

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Exercicio 03 - Escreva um algoritmo para determinar o consumo médio de um automóvel sendo fornecida a distância
        total percorrida pelo automóvel e o total de combustível gasto;*/

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

