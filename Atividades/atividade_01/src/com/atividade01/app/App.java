package com.atividade01.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        String nome;
        String result;
        double altura;
        double peso;
        double imc;

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        nome = sc.nextLine();
        System.out.println("Informe sua altura, em metros (exemplo: 1,80): ");
        altura = sc.nextDouble();
        System.out.println("Informe seu peso, em quilogramas (exemplo: 81,5 kg): ");
        peso = sc.nextDouble();

        imc = peso / (altura * altura);

        // mostrar o IMC para o usuário
        System.out.println(nome + " seu IMC é " + String.format("%.2f", imc) + ".");

        // saída de dados (correção)
        result = (imc < 18.5) ? " está abaixo do peso."
                : (imc < 25) ? " está no peso ideal."
                        : (imc < 30) ? " está acima do peso."
                                : (imc < 35) ? " está obeso."
                                        : (imc < 40) ? " está com obesidade nível II." : " está com obesidade mórbida.";
System.out.println(result);
        
sc.close();
    }

}