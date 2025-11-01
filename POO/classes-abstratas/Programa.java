public class Programa {
    public static void main(String[] args) {
        Horista horista = new Horista("Daniel Silva", "321.123.123-12", 40);
        Comissionado comissionado = new Comissionado("William", "111.222.333-22", 45000);
        CLT clt = new CLT("Flavio", "999.666.222.122", 3500);

        System.out.println("--- Dados do Funcionario Horista ---");
        horista.exibirDados();
        System.out.println();
        
        System.out.println("--- Dados do Funcionario Comissionado ---");
        comissionado.exibirDados();
        System.out.println();

        System.out.println(("--- Dados do Funcionario CLT fixo ---"));
        clt.exibirDados();

    }
}
