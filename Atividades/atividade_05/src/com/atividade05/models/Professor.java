package com.atividade05.models;

public class Professor {
  // atributos
  public String nome;
  public String matricula;

  // métodos
  public String cumprimentarAluno() {
    return "Olá, meu nome é " + this.nome + " e minha matricula é: " + this.matricula + ".";

  }
  public double areaTriangulo(double b, double h) {
    return (b * h) / 2;
  }
  public double areaCirculo(double r) {
    return Math.PI * (r * r);
  }
  }
  
  // TODO buscar como inserir informação de equação de 1º grau e como o usuário
  // pode calcular. (ax+b=0)?

