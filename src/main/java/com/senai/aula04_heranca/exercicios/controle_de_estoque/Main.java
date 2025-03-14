package com.senai.aula04_heranca.exercicios.controle_de_estoque;

public class Main {
    public static void main(String[] args) {
      Alimento alimento01 = new Alimento(
              "Milho",
              3.3,
              90,
              "12/04/2025"
      );
        Alimento alimento02 = new Alimento(
                "Cenoura",
                2.2,
                45,
                "30/03/2025"
        );
        Eletronico eletronico01 = new Eletronico(
                "Computador",
                1000,
                89,
                110
        );
        Eletronico eletronico02 = new Eletronico(
                "PS5",
                5000,
                20,
                220
        );
        System.out.println("Produtos Disponiveis:");
        alimento01.exibirDadosProdutos();
        alimento02.exibirDadosProdutos();
        eletronico01.exibirDadosProdutos();
        eletronico02.exibirDadosProdutos();
    }
}
