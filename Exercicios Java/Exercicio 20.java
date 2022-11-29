//EXERCICIO 20
/*A concessionária de veículos “CARANGO VELHO” está vendendo os seus veículos com desconto. Faça
um algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente de vários carros. O
desconto deverá ser calculado de acordo com o ano do veículo. Até 2000 - 12% e acima de 2000 - 7%. O
sistema deverá perguntar se deseja continuar calculando desconto até que a resposta seja: “(N) Não”.
Informar total de carros com ano até 2000 e total geral;*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
         
        float valorPago, anoVeiculo, valorDesconto1, valorDesconto2; 
        char Continuar = 'S';
        
          while(Continuar == 'S' || Continuar == 's'){
          
            
            System.out.println("Digite o valor pago no veiculo: ");
            valorPago = entrada.nextFloat();
            
            System.out.println("Digite o ano do veiculo: ");
            anoVeiculo = entrada.nextFloat();
            
            valorDesconto1 = valorPago * 0.12f;
            valorDesconto2 = valorPago * 0.07f;
            
            if (anoVeiculo <= 2000){
                System.out.println("Seu desconto foi de 12%, no valor de: ");
            }else{
                if(anoVeiculo > 2000){
                    System.out.println("Seu desconto foi de 7%, no valor de: ");
                }else{
                    System.out.println("Não há desconto!");
                }
            }
            System.out.println("Deseja continuar? (S) Sim e (N) Não");
            Continuar = entrada.next().charAt(0);
        }
        
    }
