package com.senai.aula04_heranca.exemplos.gerenciamento_conta_bancaria;

public class Main {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente("Izabella", 1000,3000);
        ContaPoupanca contaPoupanca = new ContaPoupanca("Ana", 2000, 26);

        contaCorrente.exibirSaldo();
        contaPoupanca.exibirSaldo();

        System.out.println("_____________TESTE CONTA CORRENTE_____________");
        contaCorrente.sacar(3100);
        contaCorrente.sacar(200);
        contaCorrente.sacar(1000);

        System.out.println("_____________TESTE CONTA POUPANÇA_____________");
        contaPoupanca.aplicarRendimento();
        System.out.println("_______________________________________________");

        contaCorrente.exibirSaldo();
        contaPoupanca.exibirSaldo();


    }

}
