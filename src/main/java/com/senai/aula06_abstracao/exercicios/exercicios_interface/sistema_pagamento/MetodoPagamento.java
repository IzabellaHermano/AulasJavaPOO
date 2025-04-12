package com.senai.aula06_abstracao.exercicios.exercicios_interface.sistema_pagamento;

public interface MetodoPagamento {
    void autenticarUsuario();

    void validarAntifraude();

    void registrarLog();

    void executarPagamento();
}
