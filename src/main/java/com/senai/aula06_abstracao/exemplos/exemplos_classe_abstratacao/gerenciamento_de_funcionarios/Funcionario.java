package com.senai.aula06_abstracao.exemplos.exemplos_classe_abstratacao.gerenciamento_de_funcionarios;

public abstract class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
    public void aumentarSalario(int porcentagem){
        salario+=salario*porcentagem/100;
    }
    public abstract double calcularBonus();

    public void exibirDados(){
        System.out.printf("\n%s recebe R$%.2f\n",nome,salario);
    }
}
