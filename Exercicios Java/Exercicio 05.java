import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*EXERCIO 05
        Escreva um algoritmo que leia o nome de um aluno e as notas das três provas que ele obteve no semestre.
        No final informar o nome do aluno e a sua média (aritmética)*/

        Scanner entrada = new Scanner(System.in);

        float nota01, nota02, nota03;
        float media;
        String nomeAluno;

        System.out.println("Nome do aluno: ");
        nomeAluno = entrada.next();

        System.out.println("Nota da primeira prova: ");
        nota01 = entrada.nextFloat();

        System.out.println("Nota da segunda prova: ");
        nota02 = entrada.nextFloat();

        System.out.println("Nota da terceira prova: ");
        nota03 = entrada.nextFloat();

        media = nota01 + nota02 + nota03 / 3;

        System.out.println("O nome do Aluno é: " + nomeAluno);
        System.out.println("O resultado da média das tres provas é: " + media);

    }
}
