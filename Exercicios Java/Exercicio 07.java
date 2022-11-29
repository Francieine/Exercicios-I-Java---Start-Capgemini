//EXERCICIO 07//

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        /*Leia uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. Afórmula de
        conversão é:F=(9*C+160) / 5, sendo F a temperatura em Fahrenheit e C a temperatura emCelsius*/

        Scanner entrada = new Scanner(System.in);
        float C, F;

        System.out.println("Quantos graus celsius faz neste momento?");
        C = entrada.nextInt();

        F = (9*C+160)/5.f;

        System.out.println("A temperatura em Fahrenheit é de: " + F);

    }
}
