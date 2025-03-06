package com.senai.aula03_encapsulamento.exercicios.conta_bancária_com_operações_simples;

public class ContaBancaria {

    private String titular;
    private double saldo;
    //Modificador de Acesso, protege os atributos


    public ContaBancaria(String titular, double saldoinicial) {
        this.titular = titular;
        if (saldoinicial >= 0) {
            this.saldo = saldoinicial;
        } else {
            System.out.println("O saldo não pode ser negativo.");
        }
    }

}
