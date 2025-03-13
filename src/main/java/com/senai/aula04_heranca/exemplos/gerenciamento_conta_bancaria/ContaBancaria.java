package com.senai.aula04_heranca.exemplos.gerenciamento_conta_bancaria;

public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
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

    public boolean depositar(double valor){
        if (valor>0){
            saldo += valor;
            System.out.println("Deposito realizado com sucesso do titular "+titular+"! \nSaldo Atual R$"+saldo);
            return true;

        }else {
            System.out.println("Valor inválido! O valor precisa ser maior que zero");
            return false;
        }
    }
    public boolean sacar(double valor){
        if (valor <= saldo && valor > 0){
            saldo -= valor;
            System.out.println("Saque realizado com sucesso do titular "+titular+"! \nSaldo Atual R$"+saldo);
            return true;
        }else {
            System.out.println("Saldo insuficiente!");
            return false;
        }
    }
    public void exibirSaldo(){
        System.out.printf("\nNome: %s\nSaldo: R$%,.2f\n",titular,saldo);
    }

}
