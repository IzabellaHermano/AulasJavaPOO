package com.senai.aula04_heranca.exercicios.sistema_de_funcionarios;

import java.util.ArrayList;

public class Coordenador extends Funcionarios {
    private ArrayList <Professor> equipeProfessores = new ArrayList<>();

    public Coordenador(String nome, double salario, ArrayList<Professor> equipeProfessores) {
        super(nome, salario);
        this.equipeProfessores = equipeProfessores;
    }

    @Override
    public void exibirDadosFuncionario() {
        System.out.printf("\n-->COORDENADOR:\nNome: %s\nSalário:R$%.2f\n\nEquipe de Professores:\n",getNome(),getSalario());
        equipeProfessores.forEach(
                p-> System.out.println(p.getNome()+" - "+p.getDisciplina()));
    }
}
