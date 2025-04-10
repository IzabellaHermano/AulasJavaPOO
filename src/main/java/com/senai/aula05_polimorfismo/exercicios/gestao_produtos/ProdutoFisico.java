package com.senai.aula05_polimorfismo.exercicios.gestao_produtos;

public class ProdutoFisico extends Produto {

    public ProdutoFisico(String nome, double preco, double imposto) {
        super(nome, preco, imposto);
    }
    @Override
    public double precoFinal() {
        return preco += preco *(imposto/100);
    }
}
