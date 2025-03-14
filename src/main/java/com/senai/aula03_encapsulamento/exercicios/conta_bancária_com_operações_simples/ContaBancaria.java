package com.senai.aula03_encapsulamento.exercicios.conta_bancária_com_operações_simples;

public class ContaBancaria {

    private String titular;
    private double saldo;
    //Modificador de Acesso, protege os atributos


    public ContaBancaria(String titular, double saldoinicial) {
        this.titular = titular;
        if (saldoinicial >= 0) {
            this.saldo = saldoinicial;
        } else {
            System.out.println("O saldo não pode ser negativo.");
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

    public boolean depositar(double valor){
        if (valor>0){
            saldo += valor;
            System.out.println("Titular:"+titular+"\nDeposito realizado com sucesso!\nSaldo Atual R$"+saldo);
            return true;

        }else {
            System.out.println("Valor inválido! O deposito deve ser superior a R$0,00");
            return false;
        }
    }
    public boolean sacar(double valor){
        if (valor <= saldo && valor > 0){
            saldo -= valor;
            System.out.println("Titular: "+titular+"\nSaque realizado com sucesso!\nSaldo Atual R$"+saldo);
            return true;
        }else {
            System.out.println("Saldo insuficiente!");
            return false;
        }
    }
    public void tranferir(double valor,ContaBancaria contaDestino){
        if (this.sacar(valor)) {
            contaDestino.depositar(valor);
            System.out.println("Transferencia Realizada com Sucesso!\nSaldo Atual:R$"+contaDestino);
        }else {
            System.out.println("Não é Possivel Relizar a Transferencia.");
        }
    }

    @Override
    public String toString() {
        return "Conta Bancaria: \nTitular: "+titular+"\nSaldo Disponivel: R$"+saldo+"\n";
    }
}
