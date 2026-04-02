package com.encapsulamento.app;

import java.util.Scanner;

import com.encapsulamento.models.PessoaFisica;
import com.encapsulamento.models.PessoaJuridica;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        PessoaFisica usuario = new PessoaFisica(null, null, null, null);
        PessoaJuridica empresa = new PessoaJuridica(null, null, null, null);

        // dados da empresa
        empresa.setNomeFantasia("Funerária Você é o Próximo");
        empresa.setCnpj("00.000.000/0000-00");
        empresa.setEmail("funeraria@contato.com.br");
        empresa.setTelefone("(61) 98765-4321");

        System.out.println("Informe o nome: ");
        usuario.setNome(sc.nextLine());
        System.out.println("Informe o CPF: ");
        usuario.setCpf(sc.nextLine());
        System.out.println("Informe o e-mail: ");
        usuario.setEmail(sc.nextLine());
        System.out.println("Informe o telefone: ");
        usuario.setTelefone(sc.nextLine());

        // saida de dados
        System.out.println("\nDADOS DO USUARIO\n");
        System.out.println("Nome do usuário: " + usuario.getNome());
        System.out.println("CPF do usuário: " + usuario.getCpf());
        System.out.println("Email do usuário: " + usuario.getEmail());
        System.out.println("Telefone do usuário: " + usuario.getTelefone());
        System.out.println("\nDADOS DA EMPRESA\n");
        System.out.println("Nome da empresa: " + empresa.getNomeFantasia());
        System.out.println("CNPJ da empresa: " + empresa.getCnpj());
        System.out.println("E-mail da empresa: " + empresa.getEmail());
        System.out.println("Telefone da empresa: " + empresa.getTelefone());

        sc.close();
    }
}
