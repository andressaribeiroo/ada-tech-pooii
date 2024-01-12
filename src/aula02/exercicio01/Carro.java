package aula02.exercicio01;

public class Carro implements Veiculo {
    @Override
    public void ligar() {
        System.out.println("Carro ligado.");
    }
    @Override
    public void desligar() {
        System.out.println("Carro desligado.");
    }
    @Override
    public void acelerar(int velocidade) {
        System.out.printf("Carro acelerando a %d km/h.\n", velocidade);
    }
    @Override
    public void frear() {
        System.out.println("Carro freando.");
    }
}