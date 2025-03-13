package com.senai.aula04_heranca.exemplos.gerenciamento_conta_bancaria;

public class ContaPoupanca extends ContaBancaria{
    private double taxaRendimento;

    public ContaPoupanca(String titular, double saldo, double taxaRendimento) {
        super(titular, saldo);
        this.taxaRendimento = taxaRendimento;
    }
    public void  aplicarRendimento(){
        saldo+=(saldo*taxaRendimento)/100;
    }
}
