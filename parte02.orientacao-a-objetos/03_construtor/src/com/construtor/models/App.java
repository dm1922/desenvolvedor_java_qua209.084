package com.construtor.models;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();
        Pessoa usuario = new Pessoa(
            null,
            null,
            null,
            null,
            0,
            0  
        );


        System.out.println("Informe o nome: ");
        usuario.nome = sc.nextLine();
        System.out.println("Informe o e-mail: ");
        usuario.email = sc.nextLine();
        System.out.println("Informe o telefone: ");
        usuario.telefone = sc.nextLine();
        System.out.println("Informe o CPF: ");
        usuario.CPF = sc.nextLine();
        System.out.println("Informe a idade: ");
        usuario.idade = sc.nextInt();
        System.out.println("Informe a altura, em metros: ");
        usuario.altura = sc.nextDouble();
        
System.out.println("Nome: "); 
    //TODO terminar programa

    }
}
