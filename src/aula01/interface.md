
# Interface em Java


Uma interface é um tipo de referência que pode conter apenas constantes, assinaturas de métodos, métodos default, métodos estáticos e tipos aninhados. Elas são fundamentais para alcançar abstração total e herança múltipla.
Uma interface é definida usando a palavra-chave `interface`. 

uma interface funciona de maneira muito similar a um contrato. No contexto de linguagens de programação como Java, a interface define um conjunto de métodos que as classes que a implementam devem fornecer. Ao implementar uma interface, uma classe está efetivamente "assinando" esse contrato, comprometendo-se a fornecer implementações concretas para todos os métodos abstratos declarados na interface.

Exemplo:

```java
public interface Animal {
    void comer();
    void dormir();
    void emitirSom();
}
```

## Implementando Interfaces
Uma classe implementa uma interface usando a palavra-chave `implements`. A classe deve fornecer implementação para todos os métodos abstratos da interface.

```java
public class Cachorro implements Animal {

    @Override
    public void comer() {
        System.out.println("O cachorro está comendo.");
    }

    @Override
    public void dormir() {
        System.out.println("O cachorro está dormindo.");
    }

    @Override
    public void emitirSom() {
        System.out.println("O cachorro faz 'au au'.");
    }
}
```

## Métodos Default e Estáticos
- **Métodos Default**: Adicionam novas funcionalidades às interfaces sem afetar as classes que as implementam.
- **Métodos Estáticos**: Pertencem à interface, não à instância da classe que a implementa.

## Herança Múltipla
Uma classe pode implementar várias interfaces, permitindo herança múltipla de tipo.
Em Java, uma interface pode herdar de outra interface, mas não pode implementar outra interface. Ao invés disso, as interfaces são estendidas por outras interfaces, usando a palavra-chave extends. Diferentemente das classes, uma interface pode estender múltiplas interfaces, permitindo herança múltipla em termos de tipos de interface.

````java
// Interface base
public interface Animal {
    void comer();
}

// Interface estendida
public interface Mamifero extends Animal {
    void amamentar();
}

````
`Mamifero` é uma interface que estende a interface `Animal`. Isso significa que qualquer classe que implemente Mamifero também deve implementar os métodos definidos em Animal, além dos métodos em Mamifero.
Neste caso, a classe `Cachorro` deve implementar tanto comer (definido em Animal) quanto amamentar (definido em Mamifero). Isso exemplifica como a herança de interface permite uma estrutura de herança rica e flexível em Java.
````java
public class Cachorro implements Mamifero {

    @Override
    public void comer() {
        System.out.println("O cachorro está comendo.");
    }

    @Override
    public void amamentar() {
        System.out.println("O cachorro amamenta seus filhotes.");
    }
}
````


## Uso de Interfaces
- **Contratos de Serviço**: Definem um conjunto de métodos que a classe de implementação deve fornecer.
- **Desacoplamento e Flexibilidade**: Facilitam a manutenção e escalabilidade do código.
- **Polimorfismo**: Uma variável de interface pode referenciar qualquer objeto que implemente a interface.

