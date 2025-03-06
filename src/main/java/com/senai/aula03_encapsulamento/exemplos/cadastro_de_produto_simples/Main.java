package com.senai.aula03_encapsulamento.exemplos.cadastro_de_produto_simples;

public class Main {
    public static void main(String[] args) {
        Produto produto01 = new Produto("Queijo", 20.9);
        Produto produto02 = new Produto("Iogurte", 5.9);

        System.out.println(produto01);
        System.out.println(produto02);

        int a = 2;
        int b = 1;

        System.out.println(produto01 == produto02);

    }
}
