package com.senai.aula06_abstracao.exemplos.exemplos_classe_abstrata.conta_bancaria;

public class ContaPoupanca extends ContaBancaria{
    public ContaPoupanca(String titular, double saldo) {
        super(titular, saldo);
    }

    @Override
    void aplicarTaxa() {

    }
}
