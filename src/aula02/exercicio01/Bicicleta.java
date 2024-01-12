package aula02.exercicio01;

public class Bicicleta implements Veiculo {
    @Override
    public void ligar() {
        System.out.println("Bicicleta pronta para uso.");
    }
    @Override
    public void desligar() {
        System.out.println("Bicicleta estacionada.");
    }
    @Override
    public void acelerar(int velocidade) {
        System.out.printf("Bicicleta acelerando a %d km/h com o esforço humano.\n", velocidade);
    }
    @Override
    public void frear() {
        System.out.println("Bicicleta freando.");
    }
}