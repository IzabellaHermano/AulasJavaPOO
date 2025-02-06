package com.senai.aula01_introducao_poo.exemplos.concessionaria;

public class Main {
    public static void main(String[] args) {
        Carro carro01 = new Carro(
                "Jaguar",
                "F-Type",
                "Preto",
                2021,
                0,
                150000

        );
        Carro carro02 = new Carro(
                "Mercedes-Benz",
                "G63 AMG",
                "Branco",
                2023,
                153,
                2247900


        );
        System.out.println(carro01);
        carro01.testeDriver();
        carro01.comprar("Izabella");
        carro01.tabelaFipe(2025);
        System.out.println("\n");

        System.out.println(carro02);
        carro02.testeDriver();
        carro02.comprar("Carolina");
        carro02.tabelaFipe(2025);


    }
}
