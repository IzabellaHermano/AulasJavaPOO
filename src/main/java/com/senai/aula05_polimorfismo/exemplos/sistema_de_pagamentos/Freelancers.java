package com.senai.aula05_polimorfismo.exemplos.sistema_de_pagamentos;

public class Freelancers extends Pagamentos{
    private double valorProjeto;

    public Freelancers(String nome, double valorProjeto) {
        super(nome);
        this.valorProjeto = valorProjeto;
    }

    @Override
    public double calcularPagamento() {
        return valorProjeto;
    }
}
