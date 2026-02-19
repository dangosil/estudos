package PrimeiraAplicacaoAlura.primeiroprojetoalura.src;

import java.util.Scanner;

public class Leitura {
    static void main() {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito");
        String filmeFavorito = leitura.nextLine();
        System.out.println("Qual o ano de lançamento? ");
        int anoDeLancamento = leitura.nextInt();
        System.out.println("Sua nota para o filme (0 a 5): ");
        double avaliacao = leitura.nextDouble();

        System.out.println(filmeFavorito);
        System.out.println(anoDeLancamento);
        System.out.println(avaliacao);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        System.out.print("Digite o valor que pretende investir esse mês: ");
        double valor = scanner.nextDouble();

        System.out.println(nome + " que tem " + idade + " anos, irá investir R$ " + valor + " esse mês.");

        scanner.close();
    }
}
