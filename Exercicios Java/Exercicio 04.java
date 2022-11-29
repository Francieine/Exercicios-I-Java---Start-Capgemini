EXERCICIO 04

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Exercicio 04 - Escreva um algoritmo para determinar o consumo médio de um automóvel sendo fornecida a distância
      total percorrida pelo automóvel e o total de combustível gasto;*/

        Scanner entrada = new Scanner (System.in);

        float salarioFixo, salarioFimMes, vendas;
        String nomeVendedor;


        System.out.println("Nome do vendedor:");
        nomeVendedor = entrada.next();

        System.out.println("Digite o valor do salário fixo:");
        salarioFixo = entrada.nextFloat();

        System.out.println("Quantidade de vendas no mês:");
        vendas = entrada.nextFloat();


        float comissao = 1.5f;
        salarioFimMes = vendas * comissao + salarioFixo;

        System.out.println("Seu nome é:" + "" + nomeVendedor);
        System.out.println("Sua renada fixa é:" + "" + salarioFixo);
        System.out.println("Suas vendas foram:" + "" + vendas);
        System.out.println("Seu Salario Final é de :" + "" + salarioFimMes);

    }
}
