public class Programa {
    static void main(String[] args) {
        ContaBancaria cb = new ContaBancaria();

        cb.setNumeroConta(321);
        cb.setSaldo(500);
        cb.titular = "Daniel";

        System.out.println("Número da conta: " + cb.getNumeroConta());
        System.out.println("Saldo: " + cb.getSaldo());
        System.out.println("Titular: " + cb.getTitular());

        cb.setSaldo(4000);
        System.out.println("Saldo: " + cb.getSaldo());
    }
}
