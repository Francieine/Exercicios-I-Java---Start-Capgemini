//EXERCICIO 31

import java.util.Scanner;
/*
Dados três valores A, B e C, em que A e B são números reais e C é um caractere, pede-se para imprimir o
resultado da operação de A por B se C for um símbolo de operador aritmético; caso contrário deve ser
impressa uma mensagem de operador não definido. Tratar erro de divisão por zero;
*/

public class Main
{
    public static void main(String[] args) {
     
     Scanner entrada = new Scanner(System.in);
     
     float operacao,A, B;
     char C;
     
    System.out.println("Opção1: ");
    A = entrada.nextFloat();
    
    System.out.println("Opção2: ");
    B = entrada.nextFloat();
    
    System.out.println("Escolha o operador: ");
    C = entrada.nextFloat();
    
    operacao = A + B;
    
    switch(C){
        case '+':
            System.out.println("O resultado da operação é: " + operação);
        break;
       }
    }
}

//OBS.: CONVERTER O STRING PARA FLOAT
