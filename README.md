# contatos_java_aula_2

Exercício – API REST para Agenda de Contatos

Criar uma API REST usando Spring Boot para uma agenda de contatos, onde os dados
estão armazenados em uma tabela chamada tb_contato, cuja estrutura é mostrada abaixo:

ID | bigint(20) | NO | PRI | NULL | auto_increment |
EMAIL | varchar(60) | YES | | NULL | |
NOME | varchar(80) | NO | | NULL | |
TELEFONE | varchar(20) | YES | | NULL

A API REST deve possuir os métodos definidos pela interface
ControllerInterface.java.
