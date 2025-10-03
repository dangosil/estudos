// Daniel Gomes Silva
public class Programa {
   public static void main(String[] args) {
      Produto p1 = new Produto(1, "Chinelo", 30.00);
      Produto p2 = new Produto(2, "Tenis", 900.00);
      
      ProdutoPerecivel pp1 = new ProdutoPerecivel(3, "Duzia de Ovos", 12.00, "15/10/2025", "20 C");
      
      System.out.println(" --- DESCONTOS --- \n");
      
      System.out.println(p1.obterDetalhes()); 
      System.out.printf("Desconto: R$ ", p1.calcularDesconto());
      System.out.println("");
      
      System.out.println(p2.obterDetalhes()); 
      System.out.printf("Desconto: R$ ", p2.calcularDesconto());
      System.out.println("");
      
      System.out.println(pp1.obterDetalhes());
      System.out.printf("Desconto: R$ %.2f", pp1.calcularDesconto());
   }
}