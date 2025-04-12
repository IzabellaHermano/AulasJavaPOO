package com.senai.aula06_abstracao.exercicios.exercicios_interface.sistema_pagamento;

public class CartaoCredito implements MetodoPagamento {
    protected int idTransacao;
    protected double valor;
    protected int numeroCartao;

    public CartaoCredito(int idTransacao, double valor, int numeroCartao) {
        this.idTransacao = idTransacao;
        this.valor = valor;
        this.numeroCartao = numeroCartao;
    }

    @Override
    public void autenticarUsuario() {
        System.out.println("Autenticando usuário do cartão de crédito...");
    }

    @Override
    public void validarAntifraude() {
        System.out.println("Executando validação antifraude para cartão de crédito...");
    }

    @Override
    public void registrarLog() {
        System.out.println("Registrando transação de cartão de crédito...");
    }

    @Override
    public void executarPagamento() {
        System.out.println("Processando pagamento com cartão de crédito...");
    }
}


