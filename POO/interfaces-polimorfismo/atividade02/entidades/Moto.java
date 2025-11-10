// DANIEL GOMES SILVA

package entidades;

public class Moto extends Veiculo{
    private int cilindradas;
    private static final double TAXA = 1.80;

    public Moto(String marca, String modelo, String palca, double custoKm, String cor, int cilindradas) {
        super(marca, modelo, palca, custoKm, cor);
        this.cilindradas = cilindradas;
    }

    @Override
    public double calcularCusto(double km) {
        return (km * getCustoKm()) + TAXA;
    }

    @Override
    public String exibirDescricao() {
        return String.format(
            "Tipo de transporte: Moto\n"
            + "Marca: %s\n"
            + "Modelo: %s\n"
            + "Placa: %s\n"
            + "Cor: %s\n"
            + "Cilindradas: %d cc\n"
            + "Custo por KM: R$ %.2f\n"
            + "Taxa: R$ %.2f",
            getMarca(), getModelo(), getPlaca(), getCor(), this.cilindradas, getCustoKm(), TAXA

        );
    }
}


