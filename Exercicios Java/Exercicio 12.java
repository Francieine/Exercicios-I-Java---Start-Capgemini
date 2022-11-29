 //EXERCIO 12
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
        /*O custo de um carro novo ao consumidor é a soma do custo de fábrica mais o percentual do distribuidor e
dos impostos aplicados (primeiro os impostos são aplicados sobre o custo de fábrica, e depois o percentual
do distribuidor sobre o resultado). Supondo que o percentual do distribuidor seja de 28% e os impostos
45%, escreva um algoritmo que leia o custo de fábrica de um carro e informe o custo ao consumidor do
mesmo;*/

            Scanner entrada = new Scanner(System.in);
            float custoFabrica, custoFinal, percentualDistribuidor;


            System.out.println("Qual o custo de Fabrica do veiculo? ");
            custoFabrica = entrada.nextFloat();

            percentualDistribuidor = 0.28f + 0.45f;

            custoFinal = custoFabrica + percentualDistribuidor;

            System.out.println("O valor real do veículo é de: " + custoFinal);

    }
}
