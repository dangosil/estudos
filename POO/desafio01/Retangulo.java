// 1

public class Retangulo {
   public double largura;
   public double altura;
   
   public double area() {
      return largura * altura;
   }
   
   public double perimetro() {
      return 2.0 * (largura + altura);
   }
   
   public double diagonal() {
      //tive que pesquisar que Math.sqrt retorna a raiz quadrada da soma
      return Math.sqrt((largura * largura) + (altura * altura));
   }
   
}