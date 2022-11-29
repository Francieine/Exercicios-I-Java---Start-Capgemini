/*
EXERCICIO - 23 Faça um algoritmo que receba um número e mostre uma mensagem caso este número sege maior que 80,
menor que 25 ou igual a 40;
*/
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        int numero;
        
        System.out.println("Digite um numero: ");
        numero = entrada.nextInt();
        
        if (numero > 80){
            System.out.println("O numero escolhido é maior que 80!");
        } else{
            if(numero < 25 || numero == 40){
                System.out.println("O numero escolhido é menor que 25 ou igual a 40");
            }else{
                System.out.println("Não está no intervalo! ");
            }
        }
        
    }
}
