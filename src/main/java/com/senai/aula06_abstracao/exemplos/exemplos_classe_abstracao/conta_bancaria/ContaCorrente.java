package com.senai.aula06_abstracao.exemplos.exemplos_classe_abstracao.conta_bancaria;

public class ContaCorrente extends ContaBancaria{
    public ContaCorrente(String titular, double saldo) {
        super(titular, saldo);
    }

    @Override
    void aplicarTaxa() {
        saldo-=20;
    }
}
