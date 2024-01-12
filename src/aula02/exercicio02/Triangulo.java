package aula02.exercicio02;

public class Triangulo implements Shape {
    private double base;
    private double altura;
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }


    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
}