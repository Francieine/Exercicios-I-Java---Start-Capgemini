//EXERCICIO 26 

import java.util.Scanner;
/*
Faça um algoritmo que leia um número de 1 a 5 e escreva por extenso. Caso o usuário digite um número 
que não esteja neste intervalo, exibir a seguinte mensagem: número inválido;
*/

public class Main
{
    public static void main(String[] args) {
       
       Scanner entrada = new Scanner(System.in);
       
       int numero;
       
     System.out.println("Digite um numero");
     numero = entrada.nextInt();
     
     switch(numero){
         
         case 1:
             System.out.println("O numero digitado foi 1");
             break;
        case 2:
             System.out.println("O numero digitado foi 2");
             break;
             
        case 3:
             System.out.println("O numero digitado foi 3");
             break;
        case 4:
             System.out.println("O numero digitado foi 4");
             break;
             
        case 5:
             System.out.println("O numero digitado foi 5");
             break;
             
        default:
            System.out.println("Numero invalido!");
            break;
           }
    }
}
