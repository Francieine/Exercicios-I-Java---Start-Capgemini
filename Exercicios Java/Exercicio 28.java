import java.util.Scanner;
/*
EXERCICIO 28
Escreva um algoritmo para uma empresa que decide dar um reajuste a seus 584 funcionários de acordo
com os seguintes critérios:
a. 50% para aqueles que ganham menos do que três salários mínimos;
b. 20% para aqueles que ganham entre três até dez salários mínimos;
c. 15% para aqueles que ganham acima de dez até vinte salários mínimos;
d. 10% para os demais funcionários.
Leia o nome do funcionário, seu salário e o valor do salário mínimo. Calcule o seu novo salário
reajustado. Escrever o nome do funcionário, o reajuste e seu novo salário. Calcule quanto à empresa
vai aumentar sua folha de pagamento;
*/

public class Main
{
    public static void main(String[] args) {
       
       Scanner entrada = new Scanner(System.in);
       
       float salarioFuncionario,reajuste1, reajuste2, reajuste3, reajuste4;
       String nomeFuncionario;
       
       int i = 0;
       
       for (; i<584 ; i++){
           
           System.out.println("Nome do funcionario: ");
           nomeFuncionario = entrada.next();
           
           System.out.println("Digite o salario: ");
            salarioFuncionario = entrada.nextFloat();
            
        reajuste1 = salarioMinimo * 0.50f;
        reajuste2 = salarioMinimo * 0.20f;
        reajuste3 = salarioMinimo * 0.15f;
        reajuste4 = salarioMinimo * 0.10f;
        
        if(salarioFuncionario < 3600){
            System.out.println(nomeFuncionario + "terá reajuste de 50% o valor do novo salario é: " + reajuste1);
        }else{
            if(salarioFuncionario <= 12000){
                System.out.println(nomeFuncionario + "Este funcionário terá reajuste de 20% o valor do novo salario é: " + reajuste2);
            }else{
                if(salarioFuncionario => 24000){
                    System.out.println(nomeFuncionario + "Este funcionário terá reajuste de 15% o valor do novo salario é: " + reajuste3);
                }else{
                    System.out.println(nomeFuncionario + "Este funcionário terá reajuste de 15% o valor do novo salario é: " + reajuste4);
                }
             }
          }
       }
    }
}
