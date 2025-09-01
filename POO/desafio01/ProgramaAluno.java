// 3 

import java.util.Scanner;
import java.util.Locale;

public class ProgramaAluno {
   public static void main(String[] args) {
      Locale.setDefault(Locale.US);
      Scanner sc = new Scanner(System.in);
      
      Aluno estud = new Aluno();
      
      System.out.print("Nome do aluno: ");
      estud.nome = sc.nextLine();
      
      System.out.print("Notas: ");
      estud.n1 = sc.nextDouble();
      estud.n2 = sc.nextDouble();
      estud.n3 = sc.nextDouble();
      
      estud.resultado();
      
      sc.close();
   }
}