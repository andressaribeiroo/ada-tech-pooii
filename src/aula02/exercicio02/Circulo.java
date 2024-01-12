package aula02.exercicio02;

public class Circulo implements Shape {
    private double raio;
    public Circulo(double raio) {
        this.raio = raio;
    }
    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}