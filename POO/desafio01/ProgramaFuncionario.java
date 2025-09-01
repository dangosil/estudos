// 2

import java.util.Scanner;
import java.util.Locale;

public class ProgramaFuncionario {
   public static void main(String[] args) {
      Locale.setDefault(Locale.US);
      Scanner sc = new Scanner(System.in);
      
      Funcionario func = new Funcionario();
      
      System.out.print("Nome: ");    
      func.nome = sc.nextLine(); //pesquisei
      
      System.out.print("Salario Bruto: ");
      func.salarioBruto = sc.nextDouble();
      
      System.out.print("Imposto: ");
      func.imposto = sc.nextDouble();
      
      System.out.println("Funcionario: " + func);
      
      System.out.println("Percentual de aumento salario: ");
      double percentual = sc.nextDouble();
      func.aumentoSalario(percentual);
      
      System.out.println("Salario com aumento de " + percentual + "%: " + func);
      
      sc.close();    
   }
}