# Orientacao a objetos com Java

## Encapsulamento o que é?

Encapsulamento é um dos quatro pilares da programação orientada a objetos, sendo os outros três herança, polimorfismo
e abstração. É um conceito fundamental que se refere à ideia de reunir os dados (variáveis) e os métodos (funções) que
operam nesses dados em uma única unidade, chamada classe. Essa unidade é a base da programação orientada a objetos.

O encapsulamento busca proteger o estado interno de um objeto, permitindo o acesso controlado a seus atributos e
métodos. Isso significa que certos aspectos do objeto são ocultados do mundo exterior, e apenas os métodos definidos
para esse objeto podem interagir com esses dados internos. Isso é feito através do uso de 

### Modificadores de acesso, como:
- público == public
- privado == private
- protegido == protected

## Método acessor o que é?


## O que são pacotes em java?

## Como sobrescrever um mátodo em Java?

Exemplo:

````
@Override
public int getDuracaoEmMinuto() {
return super.getDuracaoEmMinuto();
}
````

O `@Override` é a notação de subrecrita de método de forma especializada.

--> As classes filhas são chamadas de especialização.

## Herança

No Java, a herança é realizada através da palavra-chave extends. A classe 
que herda é chamada de `subclasse`, e a classe  que é herdada é chamada de
``superclasse``. A subclasse pode acessar todos os atributos e métodos públicos 
e protegidos da superclasse, além de poder  sobrescrever os métodos da superclasse
para criar comportamentos específicos.

## Anotações (@)

As anotações, também conhecidas como annotations, são uma forma de adicionar configurações ao código Java de uma 
maneira bem simples. Elas são usadas para fornecer informações adicionais sobre o código, como o significado de uma
classe, um método ou um atributo.

## Sobrecarga de método o que é?

## Interface

Em Java, uma interface é uma coleção de métodos abstratos (sem implementação) e constantes (variáveis finais) que podem
ser implementados por classes. Ela define um contrato que as classes devem seguir quando implementam essa interface. As
interfaces são usadas para alcançar a abstração e a flexibilidade no design de software.

Interfaces são uma forma de definir um contrato que as classes devem seguir, sendo que ele define quais métodos
devem ser implementados pelas classes que o implementarem. Interfaces permitem que diferentes classes possam ser 
tratadas de maneira padronizada, via polimorfismo, tornando assim o código fácil de estender com novos comportamentos.

## Utilização de interfaces

Interfaces podem ser utilizadas para definir comportamentos que podem ser aplicados a várias classes diferentes,
tornando assim o código mais modular e fácil de manter.

## Implements

Como se fosse um contrato que a classe assina.

## Construtor

Em Java, um construtor é um método especial usado para criar e inicializar um objeto recém-criado. Quando uma classe é
,definida, ela pode ter um ou mais construtores, sendo que se nenhum construtor for definido explicitamente, o Java 
criará um construtor default (padrão) automaticamente. Um construtor default é um construtor que não possui parâmetros
e não executa nenhuma instrução.

+ Uma dica sobre construtores é que a classe filha deve possuir tudo que a classe mãe possui.
+ Os construtores são usados para popular e trazer informações vitais de um objeto. 

## Ordenação de arrayList

-- Comparable == interface
-- Collection == pacote java.util

## CompareTo x Comparator

São formas de fazer comparações em array






