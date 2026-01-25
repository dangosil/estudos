package LogicaProgramacaoAlura.DesafioEntrega;

import java.util.Scanner;

public class Delivery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CalculandoValorEntrega calculo = new CalculandoValorEntrega();

        System.out.print("Digite a distancia da entrega em km: ");
        double distancia = sc.nextDouble();

        System.out.print("Esta chovendo? (1 - sim, 0 - não): ");
        int chuva = sc.nextInt();
        boolean estaChovendo = (chuva == 1);

        double taxaEntrega = calculo.calcularTaxa(distancia, estaChovendo);

        System.out.println("");
        System.out.printf("Distancia: %.1f km%n", distancia);
        System.out.printf("Chovendo: %s%n", estaChovendo ? "Sim" : "Não");
        System.out.printf("Valor total: R$ %.2f%n", taxaEntrega);

        sc.close();
    }
} 

