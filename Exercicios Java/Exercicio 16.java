   //EXERCIO 16
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     
        /*Escreva um algoritmo que leia o nome e as três notas obtidas por um aluno durante o semestre. Calcular a
        sua média (aritmética), informar o nome e sua menção aprovado (media >= 7), Reprovado (media <= 5) e
        Recuperação (media entre 5.1 a 6.9);*/

        Scanner entrada = new Scanner(System.in);
        float nota1, nota2, nota3, media;
        String nomeAluno;

        System.out.println("Nome do aluno: ");
        nomeAluno = entrada.next();

        System.out.println("Nota 01: ");
        nota1 = entrada.nextFloat();

        System.out.println("Nota 02: ");
        nota2 = entrada.nextFloat();

        System.out.println("Nota 03: ");
        nota3 = entrada.nextFloat();

        media = (nota1 + nota2 + nota3)/3.0f;

        if (media >= 7.0f) {
            System.out.println("O aluno" + nomeAluno + "Está aprovado!" + "sua média foi de: " + media);
        } else {
            if (media <= 5.0f) {
                System.out.println("O aluno" + nomeAluno + "Está reprovado!" + "sua média foi de: " + media);
            } else {
                System.out.println("O aluno" + nomeAluno + "Ficou de recuperação!" + "sua média foi de: " + media);
            }
        }
    }
}
