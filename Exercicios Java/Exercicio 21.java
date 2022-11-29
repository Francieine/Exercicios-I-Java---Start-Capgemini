/*EXERCICIO 21 Escreva um algoritmo que leia os dados de “N” pessoas (nome, sexo, idade e saúde) e informe se está apta
ou não para cumprir o serviço militar obrigatório. Informe os totais;*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        String nome,sexo;
        int idade;
        int qtdePessoa = 0;
        int i = 0;
    
        System.out.println("Digite o nome: ");
        nome = entrada.next();
        
        System.out.println("Digite o sexo: ");
        sexo = entrada.next();
        
        System.out.println("Digite a idade: ");
        idade = entrada.nextInt();
        
        while(idade < 18){
             
        if(idade >= 18 && sexo == "homem"){
            System.out.println("Ok, pode alistar!");
        }else{
            System.out.println("É menor de idade ou do sexo feminino");
            qtdePessoa++;
         }
            qtdePessoa = qtdePessoa+1;
        }
        System.out.println("O total de pessoas alistadas foi de: " + qtdePessoa);
    }
}
