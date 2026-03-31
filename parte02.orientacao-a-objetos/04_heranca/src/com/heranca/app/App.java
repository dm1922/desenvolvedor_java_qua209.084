package com.heranca.app;

import  java.util.Scanner;

import com.heranca.models.PessoaFisica;
import com.heranca.models.PessoaJuridica;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        PessoaFisica usuario = new PessoaFisica();
        PessoaJuridica empresa = new PessoaJuridica();

//dados da empresa
empresa.razaoSocial = "Empresa Empresa";
empresa.nomeFantasia = "Kids Graça Eventos Infantis";
empresa.cnpj = "00.000.000/0001-96";
empresa.email = "kidsgraca@contato.com";
empresa.cnpj = "(61) 96666-6666";
empresa.endereco = "Campo da Esperança";
empresa.website = "website.com";

//dados do usuario
System.out.println("DADOS DO USUARIO:");
System.out.println("Informe o nome do usuário: ");
usuario.nome = sc.nextLine();
System.out.println("Informe o CPF do usuário: ");
usuario.cpf = sc.nextLine();
System.out.println("Informe o email do usuário: ");
usuario.email = sc.nextLine();
System.out.println("Informe o telefone: ");
usuario.telefone = sc.nextLine();
System.out.println("Informe o endereço do usuário: ");
usuario.endereco = sc.nextLine();
System.out.println("Informe a idade do usuário: ");
usuario.idade = sc.nextInt();

//saida de dados
System.out.println(usuario.apresentar());
System.out.println(empresa.recepcionar(usuario.nome));


sc.close();

    }
}
