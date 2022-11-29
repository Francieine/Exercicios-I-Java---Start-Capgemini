//EXERCICIO 10//
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        /*A Loja Mamão com Açúcar está vendendo seus produtos em5(cinco)prestações sem juros. Faça um
algoritmo que receba um valor de uma compra e mostre o valor das prestações;*/

        Scanner entrada = new Scanner(System.in);
        int valorCompra, prestacao;


        System.out.println("Digite o valor da compra: ");
        valorCompra = entrada.nextInt();

        prestacao = valorCompra/5;
        System.out.println("O valor de sua compra foi de: " + valorCompra);
        System.out.print("O valor será dividido em: " + prestacao + "X" + "sem juros");
    }
}

