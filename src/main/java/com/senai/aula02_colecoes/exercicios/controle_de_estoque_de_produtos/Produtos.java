package com.senai.aula02_colecoes.exercicios.controle_de_estoque_de_produtos;

public class Produtos {

    String nomeProduto;
    int qntProduto;

    public Produtos(String nomeProduto, int qntProduto) {
        this.nomeProduto = nomeProduto;
        this.qntProduto = qntProduto;
    }

    public Produtos(int qntProduto) {
        this.qntProduto = qntProduto;
    }

    @Override
    public String toString() {
        return ". Nome:" +nomeProduto+" | Quantidade: "+qntProduto +"\n" ;
    }
}
