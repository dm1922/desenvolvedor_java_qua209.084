package com.atividade04.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Carro carro = new Carro();

        // entrada de dados
        System.out.println("Informe o (a) fabricante do veículo: ");
        carro.fabricante = sc.nextLine();
        System.out.println("Informe o modelo: ");
        carro.modelo = sc.nextLine();
        System.out.println("Informe a placa: ");
        carro.placa = sc.nextLine();
        System.out.println("Informe o ano: ");
        carro.ano = sc.nextLine();
        System.out.println("Informe a cor do veículo: ");
        carro.cor = sc.nextLine();

        //sáida de dados
        System.out.println("Fabricante: " + carro.fabricante);
        System.out.println("Modelo: " + carro.modelo);
        System.out.println("Placa: " + carro.placa);
        System.out.println("Ano: " + carro.ano);
        System.out.println("Cor: " +carro.cor);

        sc.close();
    }
}
