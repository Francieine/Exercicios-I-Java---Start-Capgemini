//EXERCIO 13
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        //Faça um algoritmo que receba um número e mostre uma mensagem caso este número seja maior que 10

       Scanner entrada = new Scanner(System.in);
       int numero;

       System.out.println("Digite um número para verificar se é maior que 10: ");
       numero = entrada.nextInt();

       if(numero > 10) {
           System.out.println("Ok! O número é maior que 10.");
       }else{
           System.out.println("Ah,não! o número é menor que 10");
       }
    }
}
