package com.senai.aula04_heranca.exercicios.sistema_bibliotecas;

public class LivroDigital extends Livro{
    private int tamanhoArquivo;

    public LivroDigital(String titulo, String autor, int tamanhoArquivo) {
        super(titulo, autor);
        this.tamanhoArquivo = tamanhoArquivo;
    }
    @Override
    public void exibirDadosLivro() {
        System.out.printf("\n|Dados do Livro:\n|Título:%s\n|Autor:%s\n|Tamanho do Arquivo:%d\n",getTitulo(),getAutor(),tamanhoArquivo);
    }
}
