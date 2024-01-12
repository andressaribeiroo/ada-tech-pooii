import aula02.exercicio01.Bicicleta;
import aula02.exercicio01.Carro;
import aula02.exercicio01.Moto;
import aula02.exercicio01.Veiculo;
import aula02.exercicio02.Circulo;
import aula02.exercicio02.Retangulo;
import aula02.exercicio02.Shape;
import aula02.exercicio02.Triangulo;

public class Main {
    public static void main(String[] args) {

        Veiculo carro = new Carro();
        Veiculo moto = new Moto();
        Veiculo bicicleta = new Bicicleta();

        System.out.println("Exercício 01 - Veiculos:");

        System.out.println("\nCarro:\n");

        carro.ligar();
        carro.acelerar(100);
        carro.frear();
        carro.desligar();

        System.out.println("\nMoto:\n");

        moto.ligar();
        moto.acelerar(60);
        moto.frear();
        moto.desligar();


        System.out.println("\nBicicleta:\n");

        bicicleta.ligar();
        bicicleta.acelerar(20);
        bicicleta.frear();
        bicicleta.desligar();

        System.out.println("\nExercício 02 - Cálculo de áreas:\n");

        Shape circulo = new Circulo(5.0);
        Shape retangulo = new Retangulo(4.0, 3.0);
        Shape triangulo = new Triangulo(5.0, 8.0);

        System.out.println("Área do círculo: " + circulo.calcularArea());
        System.out.println("Área do retângulo: " + retangulo.calcularArea());
        System.out.println("Área do triângulo: " + triangulo.calcularArea());


    }
}
