// 2

public class Funcionario{

   public String nome;
   public double salarioBruto;
   public double imposto;
   
   public double salarioLiq() {
      return salarioBruto - imposto;
   }
   
   public void aumentoSalario(double x) {
      salarioBruto += (salarioBruto * x / 100.0);
   }
   
   //tive que pesquisar
   @Override
   public String toString() {
      return nome + ", R$ " + String.format("%.2f", salarioLiq());
   }
   
}