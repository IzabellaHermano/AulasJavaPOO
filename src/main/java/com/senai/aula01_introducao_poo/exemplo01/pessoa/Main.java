package com.senai.aula01_introducao_poo.exemplo01.pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa01 = new Pessoa(
                "Hermano",
                18,
                1.70f,
                new Endereco(
                        "Marfim",
                        "Cidade Ademar",
                        "São Paulo",
                        "SP",
                        87635144,
                        98

                )

        );
        Pessoa pessoa02 = new Pessoa(
                "Izabella",
                17,
                1.60f,
                new Endereco(
                        "Marfim",
                        "Cidade Ademar",
                        "São Paulo",
                        "SP",
                        87635144,
                        98

                )

        );

        System.out.println(pessoa01);
        pessoa01.falar("OLÁ!");
        pessoa01.comer("Abacaxi");

        System.out.println("_________________________________________________________________");

        System.out.println(pessoa02);
        pessoa02.falar("Tudo bem?");
        pessoa02.comer("Kiwi");

        Pessoa pessoa03 = new Pessoa(
                "Bella",
                14);
    }
}
