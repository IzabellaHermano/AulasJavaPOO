package com.senai.aula06_abstracao.exercicios.exercicios_interface.sistema_pagamento;

public class CarteiraDigital implements MetodoPagamento {
    protected int idTransacao;
    protected double valor;
    protected int senhaCartao;

    public CarteiraDigital(int idTransacao, double valor, int senhaCartao) {
        this.idTransacao = idTransacao;
        this.valor = valor;
        this.senhaCartao = senhaCartao;
    }

    @Override
    public void autenticarUsuario() {
        System.out.println("Autenticando usuário de carteira digital...");
    }

    @Override
    public void validarAntifraude() {
        System.out.println("Executando validação antifraude para carteira digital...");
    }

    @Override
    public void registrarLog() {
        System.out.println("Registrando transação de carteira digital...");
    }

    @Override
    public void executarPagamento() {
        System.out.println("Processando pagamento com carteira digital...");
    }
}

