 //EXERCIO 11//
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
        /*Faça um algoritmo que receba o preço de custo de um produto e mostre o valor de venda. Sabe-se que o
preço de custo receberá um acréscimo de acordo com um percentual informado pelo usuário;;*/

        Scanner entrada = new Scanner (System.in);
        float custoProdutoInicial, custoProdutoFinal,acrescimo;

        System.out.println("Digite o preço de custo do produto: ");
        custoProdutoInicial = entrada.nextFloat();

        System.out.println("Digite o acrescimo em %: ");
        acrescimo = entrada.nextFloat();

        custoProdutoFinal = custoProdutoInicial * acrescimo;

        System.out.println("O valor da venda é de: " + custoProdutoFinal);

    }
}
