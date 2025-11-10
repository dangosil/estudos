// DANIEL GOMES SILVA

package entidades;

import interfaces.Transporte;

public class ContabilizarCorridas {
    private int totalCorridas;
    private double valorTotal;

    // construtor
    public ContabilizarCorridas() {
        this.totalCorridas = 0;
        this.valorTotal = 0;
    }

    // colocando um objeto como parâmetro 
    public void registrarCorrida(Transporte transporte, double km) {
        // vai calcular o custo usando o método do objeto
        double custoCorrida = transporte.calcularCusto(km);
        
        this.valorTotal += custoCorrida;
        this.totalCorridas++;
    }

    // get para que o programa exiba
    public int getTotalCorridas() {
        return totalCorridas;
    }

    public double getValorTotal() {
        return valorTotal;
    }
}
