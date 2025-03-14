package com.senai.aula04_heranca.exercicios.controle_de_estoque;

public class Alimento extends Produto{
    private String dataValidade;

    public Alimento(String nome, double preco, int quantidade, String dataValidade) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    @Override
    public void exibirDadosProdutos() {
        System.out.printf("\nProduto:%s\nPreço: R$%,.2f\nQuantidade:%d\nData de Validade:%s\n",getNome(),getPreco(),getQuantidade(),dataValidade);
    }
}
