//EXERCICIO 09//
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
        /*Faça um algoritmo que receba um valor que foi depositado e exiba o valor com rendimento após um
mês.Considere fixo o juro da poupança em 0,07% a. m;*/

        Scanner entrada = new Scanner (System.in);
        float valorDeposito , rendimentoMes;

        System.out.println("Digite o valor a ser depositado: ");
        valorDeposito = entrada.nextFloat();

        rendimentoMes = valorDeposito + valorDeposito*0.007f;

        System.out.println("O valor do Deposito incial foi de: " + valorDeposito);
        System.out.println("O total de rendimento após um mês: " + rendimentoMes);


    }
}
