//DESAFIO 02
// 1

public class Produto {

    private String nome;
    private double preco;
    private int quantidade;
    
     public Produto() {
    }
    
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public double getPreco() {
        return preco;
    }
    
    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public int getQuantidade() {
        return quantidade;
    }
    
    public double valorEstoque() {
        return preco * quantidade;
    }
    
    public void addProduto(int quantAddProd) {
        this.quantidade += quantAddProd;
    }
    
    public void removerProd(int quantRemover) {
        this.quantidade -= quantRemover;
    }
    
    public String toString() {
        return "Nome: " + nome
             + "\nPreço: R$ " + String.format("%.2f", preco)
             + "\nQuantidade em estoque: " + quantidade
             + "\nValor total em estoque: R$ " + String.format("%.2f", valorEstoque());
    }
}