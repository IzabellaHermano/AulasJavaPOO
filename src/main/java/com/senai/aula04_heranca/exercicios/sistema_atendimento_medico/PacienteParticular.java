package com.senai.aula04_heranca.exercicios.sistema_atendimento_medico;

public class PacienteParticular extends Paciente {
    private double custoConsulta;

    public PacienteParticular(String nome, int idade, double custoConsulta) {
        super(nome, idade);
        this.custoConsulta = custoConsulta;
    }

    public double getCustoConsulta() {
        return custoConsulta;
    }

    public void setCustoConsulta(double custoConsulta) {
        this.custoConsulta = custoConsulta;
    }

    @Override
    public String toString() {
        return super.toString()+"\n|Custo da Consulta"+custoConsulta;
    }
}
