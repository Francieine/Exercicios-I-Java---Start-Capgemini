
 //EXERCIO 19
        /*Escreva um algoritmo que leia o nome e o c de 56 pessoas e informe o nome e se ela é homem ou
mulher. No final informe total de homens e de mulheres;*/

    /*for (contador da repetição/loop; condição, controla quantas vezes o loop será executado; iterador++)
        {
           bloco de código
        } */


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
            Scanner entrada = new Scanner(System.in);
            String nome, sexo;
            int i = 0;

            for(; i < 4; i++) {

            System.out.println("Digite o nome da pessoa: ");
            nome = entrada.next();

            System.out.println("Digite F ou M:");
            sexo = entrada.next();


                    switch (sexo) {
                case "F":
                    System.out.println("Seu nome é: " + "\n" + nome + "\n" + "sexo Feminino!");
                    break;

                case "M":
                    System.out.println("Seu nome é:" + "\n" + nome + "\n" + "sexo Masculino!");
                    break;
            }
        }
    }
}
