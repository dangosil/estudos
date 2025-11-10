// DANIEL GOMES SILVA
//  Rodei no terminal (bash): javac aplicacao/*.java entidades/*.java interfaces/*.java,
//  e depois: java aplicacao.Programa
// Ou pelo Run java
package aplicacao;

import entidades.Carro;
import entidades.Moto;
import entidades.Veiculo;
import entidades.ContabilizarCorridas;

public class Programa {
    public static void main(String[] args) {
        System.out.println("=============================================");
        System.out.println("Sistema para calcular corridas");
        System.out.println("=============================================\n");

        ContabilizarCorridas contador = new ContabilizarCorridas();

        Veiculo carro1 = new Carro("Toyota", "Corolla", "ABC-1234", 1.50, "Prata",  4);
        Veiculo carro2 = new Carro("Toyota", "Yaris", "BAS-7645", 1.20, "Prata",  4);
        Veiculo moto1 =  new Moto("Yamaha", "Factor", "DEF-567", 0.95, "Preta", 125);
        Veiculo moto2 =  new Moto("Yamaha", "Fazer", "GHI-890", 1, "Preta", 250);

        double distancia1 = 20.0;
        double distancia2 = 10.0;

        System.out.println("Dados do Veículo");
        System.out.println(carro1.exibirDescricao());
        double custoCarro1 = carro1.calcularCusto(distancia2);
        System.out.printf("Distancia: %.2f KM\n", distancia2);
        System.out.printf("Custo da Corrida: R$ %.2f\n", custoCarro1);
        contador.registrarCorrida(carro1, custoCarro1);
        System.out.println("----------------------------------------------------------");
        
        
        System.out.println("Dados do Veículo");
        System.out.println(carro2.exibirDescricao());
        double custoCarro2 = carro2.calcularCusto(distancia1);
        System.out.printf("Distancia: %.2f KM\n", distancia1);
        System.out.printf("Custo da Corrida: R$ %.2f\n", custoCarro2);
        contador.registrarCorrida(carro2, custoCarro2);
        System.out.println("----------------------------------------------------------");
        
        
        System.out.println("Dados do Veículo");
        System.out.println(moto1.exibirDescricao());
        double custoMoto1 = moto1.calcularCusto(distancia2);
        System.out.printf("Distancia: %.2f KM\n", distancia2);
        System.out.printf("Custo da Corrida: R$ %.2f\n", custoMoto1);
        contador.registrarCorrida(moto1, custoMoto1);
        System.out.println("----------------------------------------------------------");
        
        
        System.out.println("Dados do Veículo");
        System.out.println(moto2.exibirDescricao());
        double custoMoto2 = moto2.calcularCusto(distancia1);
        System.out.printf("Distancia: %.2f KM\n", distancia1);
        System.out.printf("Custo da Corrida: R$ %.2f\n", custoMoto2);
        contador.registrarCorrida(moto2, custoMoto2);
        System.out.println("----------------------------------------------------------");

        System.out.println("\nRESUMO");
        System.out.printf("Total de Corridas: %d\n", contador.getTotalCorridas());
        System.out.printf("Valor acumulado: R$ %.2f\n", contador.getValorTotal());
        System.out.println("=============================================");

    }
    
}
