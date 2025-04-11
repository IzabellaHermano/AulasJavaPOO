package com.senai.aula05_polimorfismo.exercicios.sistema_beneficio_funcionarios;

public class Beneficio {
    protected String nome;
    public Beneficio(String nome) {
        this.nome = nome;
    }
    public double calcularDesconto(double salarioBase) {
        return 0.0;
    }
}
