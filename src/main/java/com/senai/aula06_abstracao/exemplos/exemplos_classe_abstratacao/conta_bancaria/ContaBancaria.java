package com.senai.aula06_abstracao.exemplos.exemplos_classe_abstratacao.conta_bancaria;

public abstract class ContaBancaria {
    protected String titular;
    protected double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        if ( saldo>= 0) {
            this.saldo = saldo;
        }else {
            System.out.println("O saldo inicial não pode ser negativo!");
            System.out.println("O saldo da conta iniciará com R$0,00.");
        }
    }
    abstract void aplicarTaxa();

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
