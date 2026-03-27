package com.atividade05.app;

import java.util.Scanner;

import com.atividade05.models.Aluno;
import com.atividade05.models.Professor;

public class App {
    public static void main(String[] args) throws Exception {
        // instancia a classe Scanner
        Scanner sc = new Scanner(System.in);
        Professor prof = new Professor();
        Aluno aluno = new Aluno();

        double b;
        double h;
        double r;

        System.out.println("Informe o nome do aluno: ");
        aluno.nome = sc.nextLine();
        System.out.println("Informe a idade do aluno: ");
        aluno.idade = sc.nextInt();

        // limpeza de buffer
        sc.nextLine();
        System.out.println("Informe o email do aluno: ");
        aluno.email = sc.nextLine();

        System.out.println(aluno.apresentar());

        prof.nome = "Lucas Ribeiro";
        prof.matricula = "MAT12345";

        System.out.println(prof.cumprimentarAluno());

        System.out.println("Informe o valor da base do triângulo: ");
        b = sc.nextDouble();
        System.out.println("Informe o valor da altura do triângulo: ");
        h = sc.nextDouble();

        System.out.println("A área do triângulo é " + prof.areaTriangulo(b, h));

        System.out.println("Informe o valor do raio do círculo: ");
        r = sc.nextDouble();

        System.out.println("A área do círculo é " + prof.areaCirculo(r));

        // TODO atividade05
        // pede para um professor
        // (dados: nome e matrícula) calcular para ele a equação do 1º grau, e exibe o resultado na tela.
        // como inserir informações acerca de equação do 1º grau?

        sc.close();
    }
}
