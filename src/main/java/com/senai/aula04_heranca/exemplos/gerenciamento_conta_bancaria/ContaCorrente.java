package com.senai.aula04_heranca.exemplos.gerenciamento_conta_bancaria;

public class ContaCorrente extends ContaBancaria {
    private double limite;

    public ContaCorrente(String titular, double saldo, double limite) {
        super(titular, saldo);
        this.limite = limite;
    }

    @Override
    public boolean sacar(double valor) {
        if (valor <= (saldo+limite) && valor > 0){
            saldo -= valor;
            System.out.println("Saque realizado com sucesso do titular "+getTitular()+"! \nSaldo Atual R$"+saldo);
            return true;
        }else {
            System.out.println("Saldo insuficiente!");
            return false;
        }
    }
}
