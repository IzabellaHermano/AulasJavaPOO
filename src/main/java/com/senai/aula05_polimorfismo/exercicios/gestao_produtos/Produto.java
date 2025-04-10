package com.senai.aula05_polimorfismo.exercicios.gestao_produtos;

public class Produto {
    protected String nome;
    protected double preco;
    protected double imposto;

    public Produto(String nome, double preco, double imposto) {
        this.nome = nome;
        this.preco = preco;
        this.imposto = imposto;
    }

    public double precoFinal(){
        return 0;
    }
}
