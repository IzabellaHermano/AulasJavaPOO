package com.senai.aula05_polimorfismo.exemplos.sistema_de_pagamentos;

public class PJ extends Pagamentos {
    private int horasTrabalhadas;
    private int valorPorHora;

    public PJ(String nome, int horasTrabalhadas, int valorPorHora) {
        super(nome);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorPorHora = valorPorHora;
    }

    @Override
    public double calcularPagamento() {
        return horasTrabalhadas*valorPorHora;
    }
}
