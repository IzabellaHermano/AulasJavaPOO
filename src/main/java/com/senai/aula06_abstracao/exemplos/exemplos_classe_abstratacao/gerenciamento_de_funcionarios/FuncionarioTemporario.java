package com.senai.aula06_abstracao.exemplos.exemplos_classe_abstratacao.gerenciamento_de_funcionarios;

public class FuncionarioTemporario extends Funcionario {
    private int horasExtras;
    private double valorHoraExtra;

    public FuncionarioTemporario(String nome, double salario, int horasExtras, double valorHoraExtra) {
        super(nome, salario);
        this.horasExtras = horasExtras;
        this.valorHoraExtra = valorHoraExtra;
    }

    @Override
    public double calcularBonus() {
        return salario+=horasExtras*valorHoraExtra;
    }
}
