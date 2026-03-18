package com.atividade01.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        String nome;
        double altura;
        double peso;

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        nome = sc.nextLine();
        System.out.println("Informe sua altura, em metros (exemplo: 1,80): ");
        altura = sc.nextDouble();
        System.out.println("Informe seu peso, em quilogramas (exemplo: 81,5 kg): ");
        peso = sc.nextDouble();

        double imc = peso / (altura * altura);

        if (imc < 18.5) {
            System.out.println(nome + " está com baixo peso.");
        } else if (imc >= 25 && imc <= 29.9) {
            System.out.println(nome + " está sobrepeso.");
        } else if (imc >= 30 && imc <= 34.9) {
            System.out.println(nome + " está com obesidade nível 1.");
        } else if (imc >= 35 && imc <= 39.9) {
            System.out.println(nome + " está com obesidade nível 2.");
        } else if (imc > 40) {
            System.out.println(nome + " está com obesidade nível 3.");
        }
        else if (imc >= 18.6 && imc <= 24.9) {
            System.out.println(nome + " está com o peso normal.");

        }
        sc.close();
    }
}
