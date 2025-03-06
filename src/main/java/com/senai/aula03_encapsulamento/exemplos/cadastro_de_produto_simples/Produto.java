package com.senai.aula03_encapsulamento.exemplos.cadastro_de_produto_simples;

import java.util.Objects;

public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        if ( preco>=0) {
            this.preco = preco;
        }else {
            System.out.println("VALOR INVÁLIDO!\nO preço do produto não pode ser negativo.");
            System.out.println("O preço do produto será atribuido como R$0,00");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.nome = nome;
        if ( preco>=0) {
            this.preco = preco;
        }else {
            System.out.println("VALOR INVÁLIDO!\nO preço do produto não pode ser negativo.");
        }
    }
    //construção do equals e hashCode possibilitando comparação
    @Override //Override: substitui metodo da classe "pai", sobrescreve
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false; //testa se é nulo ou se esta na mesma classe
        Produto produto = (Produto) o;//realizando cashting
        return Double.compare(preco, produto.preco) == 0 && Objects.equals(nome, produto.nome);//comparando atributos da classe criada(um por um)
        //se não gerar equals, a comparação sera entre os "caminhos" e não dos conteudos dos atributos
    }

    @Override
    //hashCode: Agrupa codigos
    //Determina qual grupo(bucket) cada objeto ira pertencer
    public int hashCode() {
        return Objects.hash(nome, preco);
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }
}
