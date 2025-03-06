package com.senai.aula01_introducao_poo.exercicios.gerenciamento_de_alunos;

public class Aluno {

    String nomeAluno;
    int idadeAluno;
    float notaAluno;

    public Aluno(String nomeAluno, int idadeAluno, float notaAluno) {
        this.nomeAluno = nomeAluno;
        this.idadeAluno = idadeAluno;
        this.notaAluno = notaAluno;
    }

    public void exibirInformacoes(){
        System.out.printf("\nInformações do Estudante: \nAluno: %s \nIdade: %d \nNota Final: %f", nomeAluno,idadeAluno,notaAluno );
        System.out.println("\n---------------------------------------------------------------");
    }
    public void azualizaNota ( float novaNota){
        notaAluno = novaNota;
        if (notaAluno < 0 ){
            notaAluno =0;
        }
        System.out.println("Nota Atualizada com Sucesso!");
    }
    public boolean verificarAprovacao(){
        if (notaAluno>= 6.0){
            return true;
        }else if (notaAluno < 6.0 ){
            return false;
        }
     return false;
    }
}
