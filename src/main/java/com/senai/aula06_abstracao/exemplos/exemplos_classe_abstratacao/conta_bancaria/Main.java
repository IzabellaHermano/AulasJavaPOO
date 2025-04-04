package com.senai.aula06_abstracao.exemplos.exemplos_classe_abstratacao.conta_bancaria;

public class Main {
    public static void main(String[] args) {
        testeConta(new ContaCorrente("Izabella Hermano", 3000));
        testeConta(new ContaPoupanca("Ana Luiza",3000));

    }
    private static void testeConta(ContaBancaria contaBancaria){
        System.out.printf("_____________________Conta do Cliente: %s _____________________",contaBancaria.titular);
        contaBancaria.exibirSaldo();
        contaBancaria.aplicarTaxa();
        contaBancaria.exibirSaldo();


    }
}
