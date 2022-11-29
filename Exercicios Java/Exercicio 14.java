  //EXERCIO 14
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      
        //Escreva um algoritmo que leia dois valores inteiro distintos e informe qual é o maior;

        Scanner entrada = new Scanner(System.in);
        int numero1, numero2;

        System.out.println("Digite o primeiro numero: ");
        numero1 = entrada.nextInt();

        System.out.println("Digite o segundo numero: ");
        numero2 = entrada.nextInt();

        if (numero1 > numero2) {
            System.out.println("O primeiro numero digitado é maior");
        }else{
            System.out.println("O segundo numero digitado é maior");
        }
    }
}
