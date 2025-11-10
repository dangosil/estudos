// DANIEL GOMES SILVA

package entidades;

import interfaces.Transporte;

public abstract class Veiculo implements Transporte {
    private String marca;
    private String modelo;
    private String placa;
    private double custoKm;
    private String cor;

    public Veiculo() {

    }

    public Veiculo(String marca, String modelo, String placa, double custoKm, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.custoKm = custoKm;
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public double getCustoKm() {
        return custoKm;
    }

    public String getCor() {
        return cor;
    }
    
}
