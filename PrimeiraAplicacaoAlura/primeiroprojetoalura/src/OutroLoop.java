package PrimeiraAplicacaoAlura.primeiroprojetoalura.src;

import java.util.Scanner;

public class OutroLoop {
    static void main() {
        Scanner leitura = new Scanner(System.in);
        double nota = 0;
        double mediaDeAvaliacao = 0;
        int totalDeNotas = 0;

        while (nota != -1) {
            System.out.println("Diga sua avaliação para o filme ou -1 para encerrar: ");
            nota = leitura.nextDouble();

            if (nota != -1) {
                mediaDeAvaliacao += nota;
                totalDeNotas++;
            }
            if (totalDeNotas == 0) {
                return;
            }
        }

        System.out.println("Média de avaliações: " + (mediaDeAvaliacao/totalDeNotas));
    }
}
