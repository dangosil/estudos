package LogicaProgramacaoAlura.DesafioEntrega;

public class CalculandoValorEntrega {
    public double calcularTaxa(double distancia, boolean estaChovendo) {
        double taxa = 0.0;

        if(distancia <= 5.0) {
            taxa = 5.0;
        } else if (distancia >= 5.0 && distancia <= 10.0) {
            taxa = 8.0;
        } else {
            taxa = 10.0;
        }
        
        if(estaChovendo) {
            taxa += 2.0;
        }

        return taxa;
    }
}