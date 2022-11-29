//EXERCICIO 25 

import java.util.Scanner;
/*
Online Java - IDE, Code Editor, Compiler

Online Java is a quick and easy tool that helps you to build, compile, test your programs online.
*/

public class Main
{
    public static void main(String[] args) {
       
       Scanner entrada = new Scanner(System.in);
       
       int numero1, numero2;
       
       System.out.println("Digite o primeiro numero: ");
       numero1 = entrada.nextInt();
       
       System.out.println("Digite o segundo numero: ");
       numero2 = entrada.nextInt();
       
       if(numero1 != numero2){
           System.out.println("Os numeros são diferentes!");
       }else{
           System.out.println("Os numeros são iguais!");
       }
       
    }
}
