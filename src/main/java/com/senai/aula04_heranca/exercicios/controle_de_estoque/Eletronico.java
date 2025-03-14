package com.senai.aula04_heranca.exercicios.controle_de_estoque;

public class Eletronico extends Produto {
    int voltagem;

    public Eletronico(String nome, double preco, int quantidade, int voltagem) {
        super(nome, preco, quantidade);
        this.voltagem = voltagem;
    }

    public int getVoltagem() {
        return voltagem;
    }

    @Override
    public void exibirDadosProdutos() {
        System.out.printf("\nProduto:%s\nPreço: R$%,.2f\nQuantidade:%d\nVoltagem:%d\n",getNome(),getPreco(),getQuantidade(),voltagem);
    }
}
