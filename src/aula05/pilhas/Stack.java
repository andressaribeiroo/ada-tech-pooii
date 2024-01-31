package aula05.pilhas;

import java.util.List;

public  interface  Stack<E> {
    void push(E elemento);
    E pop();
    E peek();
    boolean isEmpty();

    void transferirObjetos(List<? super E> lista);
}