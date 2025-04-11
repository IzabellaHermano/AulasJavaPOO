package com.senai.aula05_polimorfismo.exercicios.sistema_beneficio_funcionarios;

public class AuxilioTransporte extends Beneficio{
    protected double desconto;

    public AuxilioTransporte(String nome, double desconto) {
        super(nome);
        this.desconto = desconto;
    }

    @Override
    public double calcularDesconto(double salarioBase) {
        return super.calcularDesconto(salarioBase);
    }
}

