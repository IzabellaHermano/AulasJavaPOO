package com.senai.aula01_introducao_poo.exercicios.exercicio01;

public class Produtos {

    String nomeProduto;
    double precoProduto;
    int qntProdutoEstoque;

    public Produtos(String nomeProdutos, double precoProduto, int qntProdutoEstoque) {
        this.nomeProduto = nomeProdutos;
        this.precoProduto = precoProduto;
        this.qntProdutoEstoque = qntProdutoEstoque;
    }

    public void exibirDetalhes(){
        System.out.println("Tem em estoque "+qntProdutoEstoque+ " de "+ nomeProduto +" e esta custando "+precoProduto);
    }
    public void atualizarEsoque(double valorNovoEstoque){
        qntProdutoEstoque += valorNovoEstoque;
        if (qntProdutoEstoque < 0 ){
            qntProdutoEstoque =0;
        }
        System.out.println("Estoque atualizado com sucesso!");
    }
    public void calcularValorEstoque(){
        double valorEstoque = 0;
        valorEstoque =precoProduto*qntProdutoEstoque;
        System.out.println("O valor total do estoque é R$"+valorEstoque);
    }

    @Override
    public String toString() {
        return "O produto "+this.nomeProduto + " está custando R$"+precoProduto+" e tem "+qntProdutoEstoque+" em estoque";
    }
}
