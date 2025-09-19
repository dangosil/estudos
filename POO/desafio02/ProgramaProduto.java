// DESAFIO 02
// 01

import java.util.Scanner;
import java.util.Locale;

public class ProgramaProduto {
   public static void main(String[] args) {
      Locale.setDefault(Locale.US);
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Dados do produto: ");
      System.out.print("Produto: ");
      String nome = sc.nextLine();
      
      System.out.print("Preco: ");
      double preco = sc.nextDouble();
      
      System.out.print("Quantidade em estoque: ");
      int quantidade = sc.nextInt();
      
      Produto produto = new Produto(nome, preco, quantidade);
      
      System.out.println();
      System.out.println("Dados do produto: \n" + produto);
      
      System.out.println();
      System.out.print("Quantidade para adicionar: ");
      int quantAddProd = sc.nextInt();
      produto.addProduto(quantAddProd);
      
      System.out.println();
      System.out.println("Dados atualizados: \n" + produto);
      
      System.out.println();
      System.out.print("Digite a quantidade que deseja remover: ");
      int quantRemover = sc.nextInt();
      produto.removerProd(quantRemover);
      
      System.out.println();
      System.out.println("Dados atualizados: \n" + produto);
      
      sc.close();
   }
}