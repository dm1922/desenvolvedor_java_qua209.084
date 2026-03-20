package com.catraca.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String nome;
        double peso;
        double altura;
        int opção;

        // laço de repetição

        do {
            System.out.println("Deseja registrar nova entrada? ");
            System.out.println("1 - Registrar nova entrada");
            System.out.println("2 - Sair do programa");
            opção = sc.nextInt();

            if (opção == 1) {
                sc.nextLine();
                System.out.println("Informe o nome: ");
                nome = sc.nextLine();
                System.out.println("Informe o peso, em quilogramas: ");
                peso = sc.nextDouble();
                System.out.println("Informe a altura, em metros: ");
                altura = sc.nextDouble();

                if (peso < 120 && altura >= 1.25) {
                    System.out.println("Entrada de " + nome + " autorizada.");
                }
                else {
                    System.out.println("Entrada de " + nome + " não autorizada.");
                }
            } 
            else if (opção == 2) {
                System.out.println("Obrigado pela preferência!");
            } else {
                System.out.println("Opção inválida.");

            }
        } while (opção != 2);

        sc.close();
    }
}
