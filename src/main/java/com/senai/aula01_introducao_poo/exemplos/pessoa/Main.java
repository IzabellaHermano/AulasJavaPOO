package com.senai.aula01_introducao_poo.exemplos.pessoa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

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

        System.out.println("_________________________________________________________________");


        String [] etiqueta = {"Nome: ", "Idade: ", "Altura: ", "Endereço: \n\tRua:","\tBairro: ","\tCidade: ", "\tEstado: ","\tCEP:","\tNumero: "};
        String [] dadosPessoa = new  String[etiqueta.length];

        System.out.println("Preencha os dados a seguir:");
        for (int i = 0; i < etiqueta.length; i++) {
            System.out.print(etiqueta[i]);
            dadosPessoa[i] = scanner.nextLine();

        }
        Pessoa pessoa03 = new Pessoa(
                dadosPessoa[0],
                Integer.parseInt(dadosPessoa[1]),
                Float.parseFloat(dadosPessoa[2]),
                new Endereco(
                        dadosPessoa[3],
                        dadosPessoa[4],
                        dadosPessoa[5],
                        dadosPessoa[6],
                        Integer.parseInt(dadosPessoa[7]),
                        Integer.parseInt(dadosPessoa[8])


                )
        );
        System.out.print(pessoa03);

    }
}
