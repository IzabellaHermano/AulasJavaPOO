package com.senai.aula03_encapsulamento.exemplos.cadastro_de_produto_simples;

public class Main {
    public static void main(String[] args) {
        Produto produto01 = new Produto("Queijo", -20.9);
        Produto produto02 = new Produto("Iogurte", 5.9);

        System.out.println(produto01);
        System.out.println(produto02);

        System.out.println("______________________________");
        produto01.setPreco(21.9);
        produto02.setPreco(-4.9);

        System.out.println(produto01);
        System.out.println(produto02);

        //System.out.println(produto01.equals(produto02));
        //equals é o == (comparação) da orientação a objeto
        //equals: compara referencias
        //implementar: fazer o codigo


    }
}
