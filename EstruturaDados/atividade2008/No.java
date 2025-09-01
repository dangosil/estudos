public class No {
   int dado;
   No proximo; // A "seta" que aponta para o próximo nó.
   // Construtor para criar um novo nó.
   public No(int dado) {
   this.dado = dado;
   this.proximo = null; // Quando um nó é criado, ele ainda não aponta para ninguém.
   }
}