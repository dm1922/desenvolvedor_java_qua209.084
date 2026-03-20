package com.atividade02.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

// Crie um programa que receba do usuário o nome e a idade (1x) - OK
// e depois exiba uma lista de salas de cinema seus respectivos filmes
// sala 01 - A roda quadrada - livre
// sala 02 - A volta dos que não foram - 12 anos
// sala 03 - poeira em alto mar - 14 anos
// sala 04 - as tranças do rei careca - 16 anos
// sala 05 - a vingança do peixe frito - 18 anos
// o usuário deverá escolher o filme desejado
// se tiver a idade mínima para ver o filme, o programa imprime o ingresso e encerra.
// se o usuário não tiver a idade mínima, o programa bloqueia a entrada e reexibe a lista de filmes para o usuário escolher outro filme

String nome;
int idade;

Scanner sc = new Scanner(System.in);
// entrada de dados


System.out.println("Informe o seu nome: ");
nome = sc.nextLine();
System.out.println("Informe a sua idade: ");
idade = sc.nextInt();

System.out.println("Escolha um filme digitando o número da sala: ");
System.out.println("Sala 01 - A Roda Quadrada (Classificação: Livre)");
System.out.println("Sala 02 - A Volta dos que não foram (Classificação: 12 anos)");
System.out.println("Sala 03 - Poeira em Alto Mar (Classificação: 14 anos)");
System.out.println("Sala 04 - As Tranças do Rei Careca (Classificação: 16 anos)");
System.out.println("Sala 05 - A Vingança do Peixe Frito (Classificação: 18 anos)");

int opção;
int idadeMínima = 0;

do {
    System.out.print("Digite o número da sala: ");
    opção = sc.nextInt();

    switch (opção) {
        case 1:
            idadeMínima = 0;
            break;
        case 2:
            idadeMínima = 12;
            break;
        case 3:
            idadeMínima = 14;
            break;
        case 4:
            idadeMínima = 16;
            break;
        case 5:
            idadeMínima = 18;
            break;
        default:
            System.out.println("Opção inválida!");
            continue;
    }

    if (idade >= idadeMínima) {
        System.out.println("Ingresso liberado, " + nome + "! Aproveite!" );
        break;
    } else {
        System.out.println("Acesso negado. " + nome + ", por favor, escolha outro filme.");
    }

} while (true);

sc.close();

    }
}