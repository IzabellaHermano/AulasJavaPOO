package com.senai.aula04_heranca.exercicios.sistema_bibliotecas;

public class Livro {
    private String titulo, autor;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void exibirDadosLivro(){
        System.out.printf("|Dados do Livro:\n|Título:%s\n|Autor:%s",titulo,autor);
    }
}
