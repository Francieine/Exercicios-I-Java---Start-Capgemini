//EXERCICIO 33

/*A escola “APRENDER” faz o pagamento de seus professores por hora/aula. Faça um algoritmo que
calcule e exiba o salário de um professor. Sabe-se que o valor da hora/aula segue a tabela abaixo:
a. Professor Nível 1 R$12,00 por hora/aula;
b. Professor Nível 2 R$17,00 por hora/aula;
c. Professor Nível 3 R$25,00 por hora/aula.*/

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
       
       Scanner entrada = new Scanner(System.in);
       
        int salarioProfessor, horaAula, salarioNivel1, salarioNivel2,salarioNivel3;
        int diasTrabalho;
        
        
        System.out.println("Digite a hora/aulas trabalhadas do professor: ");
        horaAula = entrada.nextInt();
        
        System.out.println("Digite quantidade de dias trabalhados do professor: ");
        diasTrabalho = entrada.nextInt();
        
        salarioNivel1 = horaAula * diasTrabalho * horaAula;
        salarioNivel2 = horaAula * diasTrabalho * horaAula;
        salarioNivel3 = horaAula * diasTrabalho * horaAula;
        
        if(horaAula == 12){
            System.out.println("Este é um Professor Nível 1 e seu salário é de: " + salarioNivel1);
        }else{
            if(horaAula == 17){
             System.out.println("Este é um Professor Nível 2 e seu salário é de: " + salarioNivel2);
         }else{
             if(horaAula == 25){
            System.out.println("Este é um Professor Nível 3 e seu salário é de: " + salarioNivel3);
          }else{
                    System.out.println("Opção inválida!");
          }
    }
