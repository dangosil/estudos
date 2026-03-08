public class VerificadorPrimo extends NumeroPrimo{
    public void verificadorSeEhPrimo(int numero) {
        if(verificarPrimo(numero)) {
            System.out.println(numero + " é primo.");
        } else {
            System.out.println(numero + " não é primo.");
        }
    }
}
