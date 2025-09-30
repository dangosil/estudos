public class ListasSimples {
   public void inverterLista() {
      No anterior = null;
      No atual = inicio;
      No proximo = null;
      
      while(atual != null) {
         proximo = atual.proximo; //Apontar de A para B
         atual.proximo = anterior; // Apontar de A para nulo
         anterior = atual; //o anterior nulo vira A (atual)
         atual = proximo; //atual vira B
      }
      inicio = anterior // inicio vira C (anterior) quando acaba de rodar o loop
   }
   
   public void contarNos {
      int i = 0;  //  começa contando do 0
      No atual = inicio; 
      
      while(atual != null) {
         i++;   
         atual = atual.proximo;  // 1, 2, 3 atual aponta para 2 e contador vira 1, depois
      }
      return i;
   }
   
   public void encontrarMeio {
      if(inicio == null) {
         return null;
      }
      
      No lento = inicio;
      No rapido = inicio;
      
      while(rapido != null && rapido.proximo != null) {
         lento = lento.proximo;
         rapido = rapido.proximo.proximo;
      }     
      inicio = lento;
   }
   
}