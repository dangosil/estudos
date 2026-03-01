package PrimeiraAplicacaoAlura.primeiroprojetoalura.src;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    static void main() {
        Scanner leitura = new Scanner(System.in);
        int gerador = new Random().nextInt(100);
        int tentativas = 0;
        int digitado = 0;

        while (tentativas < 5) {
            System.out.println("Adivinhe o número que foi gerado entre 0 e 100:");
            digitado = leitura.nextInt();
            tentativas++;

            if (digitado == gerador) {
                System.out.println("Você acertou o número!");
                break;
            } else if (digitado < gerador) {
                System.out.println("O número é maior, tente novamente!");
            } else {
                System.out.println("O número é menor, tente novamente!");
            }

        }

        if (tentativas == 5 && digitado != gerador) {
            System.out.println("Você não conseguiu acertar o número em 5 tentativas. O número era: " + gerador);
        }


    }
}
