void main() {
    double temperaturaCelsius = 33.5;
    double temperaturaFahrenheit = (temperaturaCelsius * 1.8) + 32;

    String mensagem = String.format("A temperatura de %.1f Celsius é equivalente a %.1f Fahrenheit.", temperaturaCelsius, temperaturaFahrenheit);

    System.out.println(mensagem);

    int temperaturaFarenheitInt = (int) temperaturaFahrenheit;
    System.out.println("A temperatura inteira em Fahrenheit = " + temperaturaFarenheitInt);
}
