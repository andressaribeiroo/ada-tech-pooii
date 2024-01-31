package aula03;

    import java.util.ArrayList;
    import java.util.List;

    public class MinhaLista<T extends ObjetoComId<U>, U> {
        private final List<T> elementos = new ArrayList<>();

        public void adicionar(T elemento) {
            this.elementos.add(elemento);
        }
        public T obter(int indice) {
            if (indice >= 0 && indice < elementos.size()) {
                T objetoEncontrado = this.elementos.get(indice);
                return objetoEncontrado;
            }
            throw new IndexOutOfBoundsException("Posicao invalida");
        }
        public int indice(U id) {
            for (int i = 0; i < this.elementos.size(); i++) {

                T elementoDaPosicao = this.elementos.get(i);
                boolean isIgual = elementoDaPosicao.getId().equals(id);

                if (isIgual) {
                    return i;
                }
            }
            return -1;
        }
        public boolean contem(T elemento) {

            // return this.elementos.contains(elemento);
            for (int i = 0; i < this.elementos.size(); i++) {
                T elementoDaPosicao = this.elementos.get(i);
                if (elemento.equals(elementoDaPosicao)) {
                    return true;
                }
            }
            return false;
        }
    }

