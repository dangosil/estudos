// Daniel Gomes Silva 
public class Produto {
   private int codigo;
   private String nome;
   private double preco;
   
   public Produto() {
   }
   
   public Produto(int codigo, String nome, double preco) {
      this.codigo = codigo;
      this.nome = nome;
      this.preco = preco;
   }
   
   public int getCodigo() {
      return codigo;
   }
   
   public void setCodigo(int codigo) {
      this.codigo = codigo;
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
   
   public double calcularDesconto() {
      return this.preco * 0.10;
   }
   
   public String obterDetalhes() {
      return "Codigo: " + codigo + "\nNome: " + nome + "\nPreco: R$ " + String.format("%.2f", preco);
   }
   
}