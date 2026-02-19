package PrimeiraAplicacaoAlura.primeiroprojetoalura.src;

import java.util.Scanner;

public class Loop {
    static void main() {
        Scanner leitura = new Scanner(System.in);
        double nota = 0;
        double mediaDeAvaliacao = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Diga sua avaliação para o filme: ");
            nota = leitura.nextDouble();
            mediaDeAvaliacao += nota;
        }

        System.out.println("Média de avaliações: " + (mediaDeAvaliacao/3));
    }
}
