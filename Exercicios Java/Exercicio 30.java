//EXERCICIO 30 

import java.util.Scanner;
/*
Escreva um algoritmo que leia três valores inteiros distintos e os escreva em ordem crescente;
*/

public class Main
{
    public static void main(String[] args) {
     
     Scanner entrada = new Scanner(System.in);
     
     int numero1, numero2, numero3;
     int i = 0;
     
        System.out.print("Digite um numero: ");
        numero1 = entrada.nextInt();
        
        System.out.print("Digite um numero: ");
        numero2 = entrada.nextInt();
        
        System.out.print("Digite um numero: ");
        numero3 = entrada.nextInt();
        
    for(; i < 10; i++){
        System.out.println("A ordem é: " + i);
         }
    }
}
