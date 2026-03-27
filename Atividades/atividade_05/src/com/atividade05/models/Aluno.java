package com.atividade05.models;

public class Aluno {

  // atributos
  public String nome;
  public int idade;
  public String email;

  // metodo
  public String apresentar() {
    return "Me chamo " + this.nome + ", tenho " + this.idade + " anos e meu email é " + this.email;
  }
}