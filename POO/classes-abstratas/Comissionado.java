public class Comissionado extends Funcionario {
    private double vendaTotal;
    private final double comissao = 0.06;

    public Comissionado(String nome, String cpf, double vendaTotal) {
        super(nome,cpf);
        this.vendaTotal = vendaTotal;
    }

    @Override
    public double calcularSalario() {
        return this.vendaTotal * this.comissao;
    }
}
