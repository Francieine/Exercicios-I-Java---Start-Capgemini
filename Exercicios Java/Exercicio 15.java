//EXERCIO 15
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        //Faça um algoritmo que receba um número e diga se este número está no intervalo entre 100 e 200;

        Scanner entrada = new Scanner(System.in);
        int numero1;

        System.out.println("Digite um numero para verificação do intervalo entre 100 e 200: ");
        numero1 = entrada.nextInt();

        if(numero1 >= 100 && numero1 <= 200){
        System.out.println("Ok! O número está entre 100 e 200");
        }else{
            System.out.println("O número não se encontra no intervalo de 100 e 200");
        }
    }
}
