public class CLT extends Funcionario {
    private double salarioFixo;

    public CLT(String nome,String cpf, double salarioFixo) {
        super(nome, cpf);
        this.salarioFixo = salarioFixo;
    }

    @Override
    public double calcularSalario() {
        return this.salarioFixo;
    }
}
