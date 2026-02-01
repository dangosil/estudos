import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<Produto> itens = new ArrayList<>();

    public void addItens(String nome, double preco) {
        itens.add(new Produto(nome, preco));
    }

    public double calcularTotal() {
        double soma = 0;
        for (Produto p : itens) {
            soma += p.getPreco();
        }
        return soma;
    }

    public double totalFinal(boolean temCadastro) {
        double total = calcularTotal();
        if(temCadastro) {
            return total * 0.9;
        } else {
            return total;
        }
    }
}
