//EXERCICIO 35

import java.util.Scanner;
/*
35. Faça um algoritmo que calcule o valor da conta de luz de uma pessoa. Sabe-se que o cálculo da conta de
luz segue a tabela abaixo:
Tipo de Cliente Valor do KW/h
a. (Residência) 0,60;
b. (Comércio) 0,48;Curso de Lógica para Programação III
Instrutor: Marcio Michelluzzi
c. (Indústria) 1,29.
*/

public class Main
{
    public static void main(String[] args) {
      
     Scanner entrada = new Scanner(System.in);
     
     float kw, hora, consumo;
     
        System.out.println("Digite o kw da residencia: ");
        kw = entrada.nextFloat();
     
        System.out.println("Digite as horas de consumo: ");
        hora = entrada.nextFloat();
     
         System.out.println("Digite o kw do comercio: ");
        kw = entrada.nextFloat();
     
        System.out.println("Digite as horas de consumo no comercio: ");
        hora = entrada.nextFloat();
        
         System.out.println("Digite o kw da industria: ");
        kw = entrada.nextFloat();
     
        System.out.println("Digite as horas de consumo na industria: ");
        hora = entrada.nextFloat();
        
        consumo = kw * hora;
        
         System.out.println("O consumo em kw/h da residencia é : " + consumo);
        
         System.out.println("O consumo em kw/h do comercio é : " + consumo);
        
         System.out.println("O consumo em kw/h da industria é : " + consumo);
   
    }
}
  
