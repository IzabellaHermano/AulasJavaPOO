package com.senai.aula05_polimorfismo.exercicios.gestao_produtos;

public class ProdutoServico extends Produto {
    public ProdutoServico(String nome, double preco, double imposto) {
        super(nome, preco, imposto);
    }
    @Override
    public double precoFinal() {
        return preco += preco *(imposto/100);
    }
}
