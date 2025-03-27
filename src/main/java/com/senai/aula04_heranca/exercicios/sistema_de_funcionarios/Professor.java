package com.senai.aula04_heranca.exercicios.sistema_de_funcionarios;

public class Professor extends Funcionarios{
    private String disciplina;

    public Professor(String nome, double salario, String disciplina) {
        super(nome, salario);
        this.disciplina = disciplina;
    }

    @Override
    public void exibirDadosFuncionario() {
        System.out.printf("\n-->PROFESSOR:\nNome:%s\nSalário:R$%.2f\nDisciplina:%s",getNome(),getSalario(),disciplina);
    }
}
