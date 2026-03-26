package com.metodos.models;

public class Professor {
  // atributos
  public String nome;
  public String matéria;

  // métodos
  public String darBoasVindas() {
    return "Olá, meu nome é " + this.nome + " e dou aula de " + this.matéria + ".";
  }

  public double áreaQuadrilátero(double x, double y) {
    return x*y;
  }
}
