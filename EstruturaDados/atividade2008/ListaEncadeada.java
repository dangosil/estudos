// DANIEL GOMES, CAIO BRAGA
// A classe que gerencia todos os nós e a lógica da lista.
public class ListaEncadeada {
   No inicio; // O ponto de partida da nossa lista. Equivalente ao "head".
   // Método já ensinado
   public void adicionarNoInicio(int dado) {
      No novoNo = new No(dado);
      novoNo.proximo = inicio;
      inicio = novoNo;
   }
   // Método já ensinado
   public void imprimirLista() {
      System.out.print("Lista: [ ");
      No atual = inicio; // Começamos a percorrer pelo início.No
      while (atual != null) {
         System.out.print(atual.dado + " → ");
         atual = atual.proximo; // Pulamos para o próximo nó.
      }
      System.out.println("NULL ");
   }
   // ------ ATIVIDADE PRÁTICA COMEÇA AQUI  //
   /*
   * OBJETIVO 1 Somar todos os elementos
   * Implemente um método que percorra a lista e retorne
   * a soma de todos os valores armazenados.
   */
   public int somarTudo() {
      int soma = 0;
      No atual = inicio;
      while (atual != null) {
         soma += atual.dado;
         atual = atual.proximo;
             
      }
      
   // Seu código vem aqui
   // Dica: você vai precisar de uma variável acumuladora (ex: soma  0.
   // A cada nó percorrido, some o dado do nó na variável.
   // Ao final, retorne a soma.
      return soma; // Apague esta linha e substitua pelo seu código.
   }
   /*
   * OBJETIVO 2 Verificar existência
   * Implemente um método que verifique se um número
   * existe na lista. Retorne true se encontrar, false se não.
   */
   public boolean verificarExistencia(int valor) {
      No atual = inicio;
       while (atual != null) {  
         if(valor == atual.dado) {
            return true;
         }
         atual = atual.proximo;
       }
   // Seu código vem aqui
   // Dica: percorra a lista com while.
   // Compare o dado de cada nó com o valor procurado.
   // Se encontrar, retorne true na hora.
   // Se terminar o laço sem encontrar, retorne false.
      return false; // Apague esta linha e substitua pelo seu código.
   }
}