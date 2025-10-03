// Daniel Gomes
public class ProdutoPerecivel extends Produto {
   private String dataValidade;
   private String temperaturaArmazenamento;
   
   public ProdutoPerecivel() {
      super();
   }
   
   public ProdutoPerecivel(int codigo, String nome, double preco, String dataValidade, String temperaturaArmazenamento) {
      super(codigo, nome, preco);
      this.dataValidade = dataValidade;
      this.temperaturaArmazenamento = temperaturaArmazenamento;
   }
   
   public String getDataValidade() {
      return dataValidade;
   }
   
   public void setDataValidade(String dataValidade) {
      this.dataValidade = dataValidade;
   }
   
   public String getTemperaturaArmazenamento() {
      return temperaturaArmazenamento;
   }
   
   public void setTemperaturaArmazenamento(String temperaturaArmazenamento) {
      this.temperaturaArmazenamento = temperaturaArmazenamento;
   }
   
   @Override
   public double calcularDesconto() {
      return getPreco() * 0.20;
   }
   
   @Override
   public String obterDetalhes() {
      return super.obterDetalhes() + "\nValidade: " + dataValidade + "\nArmazenamento: " + temperaturaArmazenamento;
   }
}