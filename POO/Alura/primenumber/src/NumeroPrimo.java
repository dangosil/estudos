public class NumeroPrimo {
    public static boolean verificarPrimo(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void listarPrimo(int limite) {
        System.out.println("Primos até o número " + limite);

        for (int i = 2; i <= limite; i++) {
            if (verificarPrimo(i)) {
                System.out.println(i + " ");
            }
        }
        System.out.println();
    }
}
