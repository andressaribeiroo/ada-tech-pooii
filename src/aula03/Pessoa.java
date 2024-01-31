package aula03;

public record Pessoa(long id, String nome) implements ObjetoComId<Long> {
    @Override
    public Long getId() {
        return id;
    }
}