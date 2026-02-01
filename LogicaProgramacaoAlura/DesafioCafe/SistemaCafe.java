import java.util.Scanner;

public class SistemaCafe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pedido pedido = new Pedido();

        System.out.println("------------------------------------");
        System.out.println("Bem-vindo ao Café");

        System.out.print("Quantos itens o cliente vai pedir? ");
        int qntItens = scanner.nextInt();

        scanner.nextLine();

        for(int i = 0; i < qntItens; i++) {
            System.out.println("Item #" + (i + 1));
        
            System.out.print("Nome do produto: ");
            String nome = scanner.nextLine();

            System.out.print("Preco: ");
            double preco = scanner.nextDouble();
            scanner.nextLine();

            pedido.addItens(nome, preco);
        }

        System.out.println("O cliente possui cadatro? 1 - Sim / 2 - Nao");
        int respostaCadastro = scanner.nextInt();
        boolean temCadastro = (respostaCadastro == 1);

        double total = pedido.totalFinal(temCadastro);

        System.out.println(" ");
        System.out.printf("Subtotal: R$ %.2f%n", pedido.calcularTotal());
        if(temCadastro) {
            System.out.println("Desconto aplicado: 10%");
        }
        System.out.printf("TOTAL A PAGAR: R$ %.2f%n", total);

        scanner.close();
    }
}
