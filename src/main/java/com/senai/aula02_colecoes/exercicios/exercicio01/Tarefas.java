package com.senai.aula02_colecoes.exercicios.exercicio01;

public class Tarefas {

    String nomeTarefa;
    boolean statusConclusao;

    public Tarefas(String nomeTarefa) {
        this.nomeTarefa = nomeTarefa;
        this.statusConclusao = statusConclusao;
    }
    public String getNomeTarefa (){
        return nomeTarefa;
    }
    public boolean isStatusConclusao(){
        return isStatusConclusao();
    }
    public void tarefaConcluida (){
        this.statusConclusao = true;
    }

    @Override
    public String toString() {
        return nomeTarefa +" - [ "+ (statusConclusao ? "Concluida "+ "]": "Pendente"+"]");
    }

    }
