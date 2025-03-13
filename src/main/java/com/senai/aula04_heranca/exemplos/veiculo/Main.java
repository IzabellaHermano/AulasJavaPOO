package com.senai.aula04_heranca.exemplos.veiculo;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro(
                "Volkswagen",
                2019,
                4
        );
        Moto moto = new Moto(
                "Suzuki",
                2020,
                true
        );
        System.out.println("DETALHES CARRO:");
        carro.exibirDetalhes();
        System.out.println("\nDETALHES MOTO:");
        moto.exibirDetalhes();

    }
}
