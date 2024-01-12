package aula02.exercicio01;

public class Moto implements Veiculo {
    @Override
    public void ligar() {
        System.out.println("Moto ligada.");
    }
    @Override
    public void desligar() {
        System.out.println("Moto desligada.");
    }
    @Override
    public void acelerar(int velocidade) {
        System.out.printf("Moto acelerando a %d km/h.\n", velocidade);
    }
    @Override
    public void frear() {
        System.out.println("Moto freando.");
    }
}
