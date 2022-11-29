import java.util.Scanner;
/*
EXERCICIO 22 - Faça um algoritmo que receba o preço de custo e o preço de venda de 40 produtos. Mostre como resultado
se houve lucro, prejuízo ou empate para cada produto. Informe o valor de custo de cada produto, o valor
de venda de cada produto, amédia de preço de custo e do preço de venda
*/

public class Main
{
    public static void main(String[] args) {
        
       Scanner entrada = new Scanner(System.in);
        
        int precoCusto =  0;
        int precoVenda = 0;
        int lucro;
        int mediaPrecoCusto = 0;
        int mediaPrecoVenda = 0;
        int i = 0;
        
        for(; i < 5; i++){
        
        System.out.println("Digite o preço de custo do produto: ");
        precoCusto = entrada.nextInt();
        
        System.out.println("Digite o preço de venda do produto: ");
        precoVenda = entrada.nextInt();
        
        lucro = precoCusto - precoVenda;
        
        mediaPrecoCusto = precoCusto/2;
        mediaPrecoVenda = precoVenda/2;
        
        if(precoVenda >= 250){
            
            System.out.println("Você obteve um lucro de :" + lucro);
        }else{
            if(precoVenda == 100){
                System.out.println("Houve empate de preço!");
            }else{
                System.out.println("Houve prejuizo!");
            }
        }
        
        }
        
        System.out.println("O valor do custo do produto é de: " + precoCusto);
        System.out.println("O valor de venda de cada produto é de: " + precoVenda);
        System.out.println("O valor do preço medio de venda de cada produto é de: " + mediaPrecoVenda);
        System.out.println("O valor do preço medio de custo de cada produto é de: " + mediaPrecoCusto);
        
    }
}
