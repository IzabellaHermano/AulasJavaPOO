package com.senai.aula04_heranca.exercicios.sistema_de_funcionarios;

import java.util.ArrayList;

public class Coordenador extends Funcionarios {
    private ArrayList <String> equipeProfessores = new ArrayList<>();

    public Coordenador(String nome, double salario, ArrayList<String> equipeProfessores) {
        super(nome, salario);
        this.equipeProfessores = equipeProfessores;
    }

    @Override
    public void exibirDadosFuncionario() {
        System.out.printf("\n-->COORDENADOR:\nNome: %s\nSalário:R$.2%f\nEquipe de Professores:%s",getNome(),getSalario(),equipeProfessores);
    }
}
