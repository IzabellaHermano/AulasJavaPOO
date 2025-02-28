package com.senai.aula03_encapsulamento.exercicios.exercicio01;

public class Produtos {
    private String nome;
    private double preco;

    public Produtos(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    public String getNome() {
        System.out.println(nome);
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        System.out.println(preco);
        return preco;
    }
    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            System.out.println("O preço não pode ser negativo.");
        }
    }
}
