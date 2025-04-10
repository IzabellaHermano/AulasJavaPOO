package com.senai.aula04_heranca.exercicios.sistema_atendimento_medico;

public class PacienteConvenio extends Paciente{
    private double desconto;

    public PacienteConvenio(String nome, int idade, double desconto) {
        super(nome, idade);
        this.desconto = desconto;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    @Override
    public String toString() {
        return super.toString()+"\n|Desconto: R$"+desconto;
    }
}
