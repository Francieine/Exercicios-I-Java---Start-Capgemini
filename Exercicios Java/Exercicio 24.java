/*
EXERCICIO 24 - Faça um algoritmo que receba “N” números e mostre positivo, negativo ou zero para cada número
*/
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int numeros; 
        
        int i = 0;
        for(; < 10; i++){
            
        System.out.println("Digite um numero: ");
        numeros = entrada.nextInt();
     
            if (numeros >= 1)
            
            System.out.println("Numero positivo!");
          }else{
              if(numeros =< 0){
                  System.out.println("Numero negativo!");
              }else{
                  System.out.println("Não está no intervalo!");
              }
          }
        
    }
}
