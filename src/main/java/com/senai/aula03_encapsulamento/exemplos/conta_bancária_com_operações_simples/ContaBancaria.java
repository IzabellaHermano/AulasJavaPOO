package com.senai.aula03_encapsulamento.exemplos.conta_bancária_com_operações_simples;

public class ContaBancaria {

    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        if ( saldo>= 0) {
            this.saldo = saldo;
        }else {
            System.out.println("O saldo inicial não pode ser negativo!");
            System.out.println("O saldo da conta iniciará com R$0,00.");
        }
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor){
        if (valor>0){
            saldo += valor;
            System.out.println("Deposito realizado com sucesso do titular "+titular+"! \nSaldo Atual R$"+saldo);

        }else {
            System.out.println("Valor inválido! O valor precisa ser maior que zero");
        }

    }
    public void sacar(double valor){
        if (valor<= saldo){
            saldo -= valor;
            System.out.println("Saque realizado com sucesso do titular "+titular+"! \nSaldo Atual R$"+saldo);
        }else {
            System.out.println("Saldo insuficiente");
        }
    }
    public void tranferir(double valor, ContaBancaria contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor);

    }
    @Override
    public String toString() {
        return "ContaBancaria{" +
                "titular='" + titular + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
