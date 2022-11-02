## Exercício 2 – API REST para Agenda de Contatos

Criar uma API REST usando Spring Boot para uma agenda de contatos, onde os dados
estão armazenados em uma tabela chamada tb_contato, cuja estrutura é mostrada abaixo:

- ID
- EMAIL
- NOME
- TELEFONE

A API REST deve possuir os métodos definidos pela interface
ControllerInterface.java.


## Exercício 3 - Abstract Entity e Heroku

Modificar a aplicação da Agenda de Contatos de tal forma que a classe Contato seja derivada
da classe AbstractEntity e depois publicar a aplicação no Heroku.

## Exercício 5 - Query

Acrescentar as queries que se pedem a seguir, fornecendo também os serviços e controladores
para executá-las através da API REST:
- Obter o número de contatos da agenda;
- Obter todos os contatos que tem uma string como parte de seu nome, ordenados por
nome;
- Obter todos os contatos que tem uma string como parte de seu e-mail, ordenados por e-
mail.

Os controladores REST devem permitir que as consultas que devolvem uma lista de
valores sejam devolvidas paginadas
