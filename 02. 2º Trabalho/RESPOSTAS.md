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
