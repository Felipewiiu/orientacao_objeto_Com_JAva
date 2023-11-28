# Orientacao a objetos com Java

## Encapsulamento o que é?

Encapsulamento é um dos quatro pilares da programação orientada a objetos, sendo os outros três herança, polimorfismo
e abstração. É um conceito fundamental que se refere à ideia de reunir os dados (variáveis) e os métodos (funções) que
operam nesses dados em uma única unidade, chamada classe. Essa unidade é a base da programação orientada a objetos.

O encapsulamento busca proteger o estado interno de um objeto, permitindo o acesso controlado a seus atributos e
métodos. Isso significa que certos aspectos do objeto são ocultados do mundo exterior, e apenas os métodos definidos
para esse objeto podem interagir com esses dados internos. Isso é feito através do uso de 

### Modificadores de acesso, como:
- público
- privado
- protegido

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
