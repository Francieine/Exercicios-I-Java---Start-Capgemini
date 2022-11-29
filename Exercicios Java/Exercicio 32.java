//EXERCICIO 32 

/*Escreva um algoritmo que leia três valores inteiros e verifique se eles podem ser os lados de um triângulo.
Se forem, informar qual o tipo de triângulo que eles formam: equilátero, isóscele ou escaleno.
Propriedade: o comprimento de cada lado de um triângulo é menor do que a soma dos comprimentos dos
outros dois lados.
a. Triângulo Equilátero: aquele que tem os comprimentos dos três lados iguais;
b. Triângulo Isóscele: aquele que tem os comprimentos de dois lados iguais.
c. Triângulo equilátero é também isóscele;
d. Triângulo Escaleno: aquele que tem os comprimentos de seus três lados diferentes;*/

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
       
       Scanner entrada = new Scanner(System.in);
       
       int lado1, lado2, lado3, numero1, numero2, numero3;
       
       System.out.println("Valor para o L1: ");
       lado1 = entrada.nextInt();
       
       System.out.println("Valor para o L2: ");
       lado2 = entrada.nextInt();
       
       System.out.println("Valor para o L3: ");
       lado3 = entrada.nextInt();
       
       if(lado1 == lado2 && lado2 == lado3){
           System.out.println("Lados iguais - Triangulo Equilatero!");
       }else{
           if(lado1 == lado2 || lado2 == lado3){
             System.out.println("Somente dois lados iguais - Triangulo Isósceles!");   
        }else{
             System.out.println("Lados diferentes - Triangulo Escaleno!");
       }
    }
  }
}
