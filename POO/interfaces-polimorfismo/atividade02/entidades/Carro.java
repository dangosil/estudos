// DANIEL GOMES SILVA

package entidades;


public class Carro extends Veiculo{
    private int numPortas;
    private static final double TAXA = 2.50;

    public Carro(String marca, String modelo, String placa, double custoKm, String cor, int numPortas) {
        super(marca, modelo, placa, custoKm, cor);
        this.numPortas = numPortas;
    }

    @Override
    public double calcularCusto(double km) {
        return (km * getCustoKm()) + TAXA;
    }

    @Override
    public String exibirDescricao() {
        return String.format(
            "Tipo de transporte: Carro\n"
            + "Marca: %s\n"
            + "Modelo: %s\n"
            + "Placa: %s\n"
            + "Cor: %s\n"
            + "Numero de portas: %d\n"
            + "Custo por KM: %.2f\n"
            + "Taxa: R$ %.2f",
            getMarca(), getModelo(), getPlaca(),getCor(), this.numPortas, getCustoKm(), TAXA
        );
    }
    
}
