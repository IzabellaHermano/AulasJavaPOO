package com.senai.aula05_polimorfismo.exercicios.sistema_beneficio_funcionarios;

public class PlanoDeSaude extends Beneficio{
    protected double desconto;
    public PlanoDeSaude(String nome, double desconto) {
        super(nome);
        this.desconto = desconto;
    }
    @Override
    public double calcularDesconto(double salarioBase) {
        return desconto;
    }
}
