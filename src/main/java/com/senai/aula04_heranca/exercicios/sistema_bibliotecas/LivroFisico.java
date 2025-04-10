package com.senai.aula04_heranca.exercicios.sistema_bibliotecas;

public class LivroFisico extends Livro{
    private int numPaginas;

    public LivroFisico(String titulo, String autor, int numPaginas) {
        super(titulo, autor);
        this.numPaginas = numPaginas;
    }

    @Override
    public void exibirDadosLivro() {
        System.out.printf("\n|Dados do Livro:\n|Título:%s\n|Autor:%s\n|Número de Páginas:%d\n",getTitulo(),getAutor(),numPaginas);
    }
}
