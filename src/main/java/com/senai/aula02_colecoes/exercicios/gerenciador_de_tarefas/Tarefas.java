package com.senai.aula02_colecoes.exercicios.gerenciador_de_tarefas;

public class Tarefas {

    String nomeTarefa;
    boolean statusConclusao;

    public Tarefas(String nomeTarefa) {
        this.nomeTarefa = nomeTarefa;
        this.statusConclusao = statusConclusao;
    }

    public void tarefaConcluida (){
        this.statusConclusao = true;
    }

    @Override
    public String toString() {
        return nomeTarefa +" - [ "+ (statusConclusao ? "Concluida "+ "]": "Pendente"+"]");
    }

    }
