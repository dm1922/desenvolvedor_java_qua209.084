package com.atividade04.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // Desenvolva um programa que crie um objeto da classe Veículo
        // (pode ser qualquer veículo) com os atributos:
        // - Fabricante
        // - Modelo
        // - Placa
        // - Ano
        // - Cor
        // O programa deverá mostrar os dados do veículo (obs.: veículo não mostra
        // dados, portanto não pode ser via método)
        // Usuário deverá informar os dados do veículo

// instancia a classe carro
        Carro carro = new Carro();
        Scanner sc = new Scanner(System.in);

        // entrada de dados
        System.out.println("Informe o (a) fabricante do veículo: ");
        carro.fabricante = sc.nextLine();
        System.out.println("Informe o modelo: ");
        carro.modelo = sc.nextLine();
        System.out.println("Informe a placa: ");
        carro.placa = sc.nextLine();
        System.out.println("Informe o ano: ");
        carro.ano = sc.nextInt();

        // limpeza de buffer
        sc.nextLine();

        System.out.println("Informe a cor do veículo: ");
        carro.cor = sc.nextLine();

        carro.cumprimentar();
        carro.apresentar();

        sc.close();
    }
}
