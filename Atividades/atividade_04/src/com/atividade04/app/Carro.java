package com.atividade04.app;

public class Carro {
    //atributos
    public String fabricante;
    public String modelo;
    public String placa;
    public String ano;
    public String cor;

    //metodo
    public void cumprimentar() {
        System.out.println("Olá, boa noite!");
    }

    public void apresentar (){
        System.out.println("O veículo é fabricado pelo (a) " + this.fabricante + ", cujo modelo é um (uma) " + this.modelo + ", com a placa " + this.placa + ", ano " + this.ano + " e cor " + this.cor + ".");
    }
}