// 3

public class Aluno {
   public String nome;
   public double n1;
   public double n2;
   public double n3;
   
   public double notaFinal() {
      return n1 + n2 + n3;
   }
   
   public void resultado() {
      double notaF = notaFinal();
      System.out.printf("Nota final: %.2f%n", notaF);
      
      if(notaF >= 60.0) {
         System.out.println("Aprovado");
      } else {
         System.out.println("Reprovado");
         double faltou = 60.0 - notaF;
         System.out.printf("Faltou %.2f para ser aprovado.%n" , faltou);
      }
   }
}