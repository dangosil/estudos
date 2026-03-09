public class TabuadaMulplicacao implements Tabuada{

    @Override
    public void mostrarTabuada(int n) {
        System.out.println("Tabuada de mulplicação do " + n +": ");

        for (int i = 1; i <= 10; i++) {
            int resultado = n * i;
            System.out.println(n + " x " + i + " = " + resultado);
        }
    }
}
