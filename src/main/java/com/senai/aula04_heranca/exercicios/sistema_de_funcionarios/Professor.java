package com.senai.aula04_heranca.exercicios.sistema_de_funcionarios;

public class Professor extends Funcionarios{
    private String disciplina;

    public Professor(String nome, double salario, String disciplina) {
        super(nome, salario);
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }

    @Override
    public void exibirDadosFuncionario() {
        System.out.printf("\nNome:%s\nSalário:R$%.2f\nDisciplina:%s\n",getNome(),getSalario(),disciplina);
    }
}
