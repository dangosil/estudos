import java.util.Scanner;

public class ProgramaTabuada {
    static void main(String[] args) {
        TabuadaMulplicacao tabuadaMult = new TabuadaMulplicacao();
        Scanner input = new Scanner(System.in);

        System.out.println("Digite qual tabuada de multiplicação você quer ver: ");
        int n = input.nextInt();
        tabuadaMult.mostrarTabuada(n);
    }
}
