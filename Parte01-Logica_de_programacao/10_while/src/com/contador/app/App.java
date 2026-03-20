package com.contador.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);

int número;

System.out.println("Informe um número inteiro positivo: ");
número = sc.nextInt();

//laço de repetição while
while (número >= 0) {
    System.out.println(número);
    número--;
}

       sc.close();
    }
}
