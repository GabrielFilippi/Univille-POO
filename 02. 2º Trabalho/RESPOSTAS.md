# Introdução à Programação Orientada a Objetos
#### Lista de Exercícios
#### Programação Orientada à Objetos - UNIVILLE
#### Utilize os seus conhecimentos de orientação à objetos para resolver os problemas solicitados.

#### Aluno: Gabriel Filippi.

## PROBLEMA 01
***O que é um objeto?***

R:  Objeto significa tudo aquilo que possui caráter material e inanimado.

## PROBLEMA 02
***Identifique 3 caracteristicas e 3 comportamentos de um carro.***

R:
##### Caracteristicas:
* Cor
* Tipo(Sedan/Pickup/hat)
* Nacionalidade
##### Comportamentos:
* Movimento(sim/nao)
* Sentido
* Ligado/desligado

## PROBLEMA 03
***No contexto de Orientação a Objetos, as caracteristicas e comportamentos sao
chamados respectivamente de?***

R: Cada objeto tem seu próprio conjunto de atributos, onde são definidos dentro de classes. O que define o Estado são os valores atribuídos aos atributos de um objeto. Diferentemente do Comportamento que são os métodos da classe, que como o próprio nome diz, é o comportamento do objeto.

## PROBLEMA 04
***Qual é o objetivo da programação orientada a objetos?***

R: A programação orientada a objetos tem como principais objetivos reduzir a complexidade no desenvolvimento de software e aumentar sua produtividade.

## PROBLEMA 05
***O que é abstração? Cite um exemplo***

R: Conseguir abstrair um item do mundo real e transforma-lo em uma classe focando nos principais atributos necessários.

## PROBLEMA 06
***O que é classe?***

R: Uma classe é uma estrutura que abstrai um conjunto de objetos com características similares. Uma classe define o comportamento de seus objetos - através de métodos - e os estados possíveis destes objetos - através de atributos.

## PROBLEMA 07
***Qual é o padrão utilizado para nomear as classes? Cite um exemplo.***

R: Por convenção, toda classe deve começar com uma letra maiúscula e, de preferência, não pode conter letras não ASCII (caracteres de língua de origem latina, como caracteres acentuados). Portanto, não é possível declarar uma classe com qualquer caracter especial (@, #, $, %, &, *, _, etc...) ou número.

Caso o nome de uma classe seja composto por mais de uma palavra, a primeira letra de cada palavra deve ser em maiúscula.

O nome da classe deve ser exatamente o mesmo nome de seu arquivo fonte ( .java ).

O nome da classe deve fazer referência total ao seu objeto (atributos e métodos contidos dentro da classe). Por exemplo: se tivermos uma classe com os atributos canal, volume e sintonia; e os métodos mudarCanal (), aumentarVolume () e diminuirVolume (); então, possivelmente chamaríamos esta classe de TV ou Televisao. 

## PROBLEMA 08
***Qual opção apresenta corretamente o nome da classe carro eletrico?***
1. carroeletrico
2. carroEletrico
3. Carroeletrico
4. CarroEletrico
5. carro eletrico

R: Opção 4.

## PROBLEMA 09
***Qual é o padrão utilizado para nomear os atributos? Cite um exemplo.***

R: Os atributos (variáveis) podem começar com qualquer letra e os caracteres $ ou _, porém não podem começar com números.

Caso o nome de um atributo (variável) seja composto por mais de uma palavra, a primeira letra de cada palavra deve ser em maiúscula.

Exemplos de nomes de atributos ou variáveis: x, y, resultado, valorDeX, valorDeY, ligado,

## PROBLEMA 10
***Qual opção apresenta corretamente o nome do atributo cor de fundo?***
1. CordeFundo
2. CorDeFundo
3. corDeFundo
4. cor de fundo
5. corDeFundo
6. mCorDeFundo

R: Opção 3.

## PROBLEMA 11
***Qual é o padrão utilizado para nomear os métodos? Cite um exemplo***

R: Caso palavra não composta deve-se escrever tudo em minusculo. Caso seja composto por mais de uma palavra, a primeira letra de cada palavra deve ser em maiúscula.

## PROBLEMA 12
***Qual opção apresenta corretamente o nome do método esta vazio?***
1. estaVazio
2. _estaVazio
3. estavazio
4. EstaVazio
5. Estavazio
6. Esta vazio

R: Opção 1.

## PROBLEMA 13
***No contexto de orientação à objetos, o que é um objeto? Em que momento existe um objeto? Quando ele deixa de existir?***

R: Um objeto é um elemento computacional que representa, no domínio da solução, alguma entidade (abstrata ou concreta) do domínio de interesse do problema sob análise. Objetos similares são agrupados em classes.

No paradigma de orientação a objetos, tudo pode ser potencialmente representado como um objeto. Sob o ponto de vista da programação, um objeto não é muito diferente de uma variável no paradigma de programação convencional. Por exemplo, quando define-se uma variável do tipo int em C ou em Java, essa variável tem:

* Um espaço em memória para registrar o seu estado atual (um valor);
* Um conjunto de operações associadas que podem ser aplicadas a ela, através dos operadores definidos na linguagem que podem ser aplicados a valores inteiros (soma, subtração, inversão de sinal, multiplicação, divisão inteira, resto da divisão inteira, incremento, decremento).

## PROBLEMA 14
***Qual é o objetivo do operador new?***

R: O operador new cria uma instancia de um tipo de objeto definido pelo usuário ou de um dos tipos nativos (built-in) que possuem uma função construtora.

## PROBLEMA 15
***O que é o construtor? Qual é o seu objetivo? Qual deve ser o seu nome? Cite um exemplo***

R: O (pseudo-)método construtor determina que ações devem ser executadas quando da criação de um objeto. Em Java, o construtor é definido como um método cujo nome deve ser o mesmo nome da classe e sem indicação do tipo de retorno -- nem mesmo void. O construtor é unicamente invocado no momento da criação do objeto através do operador new.

## PROBLEMA 16
***Caso o construtor da classe Aluno não for declarado, qual será o seu construtor?***

R: Será o construtor padrão, pois ao criar uma classe, por padrão sempre teremos um construtor padrão.

## PROBLEMA 17
***Crie um exemplo de instanciação da classe Aluno. Utilize o construtor padrão***

R: 
```
class Pessoa {
   String tipo = "";
   public Pessoa(String tipo){
      this.tipo = tipo; //Aqui, o this.tipo representa a variavel que esta fora do escopo, ou seja, o que recebemos como argumento
                             //é passado para a variavel de instancia.
   }
   public String getTipo(){
      return tipo;
   }
}
class Executa {
   public static void main(String args[]){
      Pessoa p = new Pessoa("Pessoa Juridica");
      System.out.println("O tipo de pessoa é: "+p.getTipo());
   }
}
```

## PROBLEMA 18
***O que é encapsulamento?***

R: Encapsulamento é a técnica que faz com que detalhes internos do funcionamento dos métodos de uma classe permaneçam ocultos para os objetos. Por conta dessa técnica, o conhecimento a respeito da implementação interna da classe é desnecessário do ponto de vista do objeto, uma vez que isso passa a ser responsabilidade dos métodos internos da classe.

## PROBLEMA 19
***Qual é o objetivo do modificador de acessso public?***

R: É a palavra-chave que define um atributo, método ou classe como público, privado ou protegido.

## PROBLEMA 20
***Qual é o objetivo do modificador de acessso private?***

R:  Privado ou private, tem como objetivo de apenas os métodos da própria classe poderem manipular o atributo.

## PROBLEMA 21
***Como é aplicado o encapsulamento em uma classe? Considere a classe Aluno com o atributo matrícula***

R: O propósito do encapsulamento é o de organizar os dados que sejam relacionados, agrupando-os (encapsulando-os) em objetos (classes), reduzindo as colisões de nomes de variáveis (dado que variáveis com o mesmo nome estarão em namespaces distintos) e, da mesma forma, reunindo métodos relacionados às suas propriedades (ou variáveis de classe). Este padrão ajuda a manter um programa com centenas ou milhares de linhas de código mais legível e fácil de trabalhar e manter.

A classe encapsula os dados relacionados do objeto. Para saber a matricula do aluno, podemmos perguntar ao Aluno.matricula. Se tivermos também o Objeto Professor com atributo matricula, chamamos esse por Professor.matricula. Os dois atributos têm o mesmo nome, mas cada um tem o seu próprio domínio. O mesmo pode ser dito sobre as operações de cada uma das classes. Isto é encapsulamento!

## PROBLEMA 22
***Qual o objetivo dos métodos getters? Crie um exemplo***

R: O método getter é utilizado para recuperar alguma informação, geralmente utilizado para trazer informação de algum atributo, sem ter que utilizar o atributo explicitamente. Então chamamos atraves de métodos.

## PROBLEMA 23
***Qual o objetivo dos métodos setters? Crie um exemplo***

R: Método setter é utilizado para setar um valor dentro de um objeto, de uma variavel. *Exemplo após resposta do problema 24*

## PROBLEMA 24
***Qual o objetivo dos métodos setters? Crie um exemplo***

R: Método setter é utilizado para setar um valor dentro de um objeto, de uma variavel. *Exemplo abaixo.*

### Exemplo de Get e Set questão 23 e 24
```
public class Ponto {
    private double x;
    private double y;
 
    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double getX() { return x; }
    public double getY() { return y; }
    public void setX(double x) { this.x = x; }
    public void setY(double y) { this.y = y; }
}
```

## PROBLEMA 25
***O diagrama de classe UML é composto por 3 partes. O que vai em cada parte?***

R: 
