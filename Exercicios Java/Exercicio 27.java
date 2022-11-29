//EXERCICIO 27

import java.util.Scanner;

/*
A concessionária de veículos “CARANGO” está vendendo os seus veículos com desconto. Faça um
algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente. O desconto deverá ser
calculado sobre o valor do veículo de acordo com o combustível (álcool – 25%, gasolina – 21% ou diesel
–14%). Com valor do veículo zero encerra entrada de dados. Informe total de desconto e total pago pelos
clientes;
*/

public class Main
{
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        float opcao,valorPago, desconto1, desconto2, desconto3;
        
        System.out.println("Digite o valor pago no veiculo: ");
        valorPago = entrada.nextFloat();
        
        System.out.println("Escolha uma opção: 1 - Alcool, 2  Gasolina, 3 - Diesel");
        opcao = entrada.nextFloat();
        
        desconto1 = valorPago * 0.25f;
        desconto2 = valorPago * 0.21f;
        desconto3 = valorPago * 0.14f;
        
        if (opcao == 1){
            System.out.println("(1) Alcool: Seu desconto foi de " + desconto1);
        }else{
            if(opcao == 2){
                System.out.println("(2) Gasolina: Seu desconto foi de " + desconto2);
                
            }else{
                if(opcao == 3){
                    System.out.println("(3) Diesel: Seu desconto foi de " + desconto3);
                }else{
                    System.out.println("Sem desconto! Veiculo zero km!");
                }
            }
        }
        
    }
}

