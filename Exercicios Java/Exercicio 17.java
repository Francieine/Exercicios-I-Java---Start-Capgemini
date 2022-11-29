//EXERCIO 17
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        /*Leia 10 números e ao final informar quantos número(s) est(á)ão no intervalo entre 10 (inclusive) e 150
(inclusive);*/


        int i = 0;
        Scanner entrada = new Scanner(System.in);
        for (; i < 10; ) {
            i++;
            System.out.println("Digite um número: ");
            i = entrada.nextInt();
            {
                if (i >= 3 && i <= 5) {
                    System.out.println("Está no intervalo");
                } else {
                    System.out.println("Não está no intervalo");
                }
            }
        }
    }
}
