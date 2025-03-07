package com.senai.aula03_encapsulamento.exemplos.conta_bancária_com_operações_simples;

public class Main {
    public static void main(String[] args) {
        ContaBancaria contaBancaria01 = new ContaBancaria("Izabella", 100);
        ContaBancaria contaBancaria02 = new ContaBancaria("Ana", 1000000);

        System.out.println(contaBancaria01);
        System.out.println(contaBancaria02);

        System.out.println("______Teste Depositar______");

        contaBancaria01.depositar(100);
        contaBancaria02.depositar(1000000);

        System.out.println("______Teste Sacar______");
        contaBancaria01.sacar(110);
        contaBancaria02.sacar(50);

        System.out.println("______Teste Transferencia______");
        contaBancaria02.tranferir(3000,contaBancaria01);


    }
}
