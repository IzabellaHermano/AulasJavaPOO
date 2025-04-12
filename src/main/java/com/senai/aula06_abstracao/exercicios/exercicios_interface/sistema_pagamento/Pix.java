package com.senai.aula06_abstracao.exercicios.exercicios_interface.sistema_pagamento;

public class Pix implements MetodoPagamento {
    protected int idTransacao;
    protected double valor;
    protected int chavePix;

    public Pix(int idTransacao, double valor, int chavePix) {
        this.idTransacao = idTransacao;
        this.valor = valor;
        this.chavePix = chavePix;
    }

    @Override
    public void autenticarUsuario() {
        System.out.println("Autenticando usuário via PIX...");
    }

    @Override
    public void validarAntifraude() {
        System.out.println("Executando validação antifraude para PIX...");
    }

    @Override
    public void registrarLog() {
        System.out.println("Registrando transação via PIX...");
    }

    @Override
    public void executarPagamento() {
        System.out.println("Processando pagamento via PIX...");
    }
}
