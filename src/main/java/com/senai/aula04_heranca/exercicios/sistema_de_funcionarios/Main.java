package com.senai.aula04_heranca.exercicios.sistema_de_funcionarios;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Professor [] professoresExatas ={
                new Professor("Alice", 4500.00, "Matemática"),
                new Professor("GianLucca", 4500,"Física"),
                new Professor("Maria", 4500.00,"Química"),
                new Professor("Rafael",4500.00, "Biologia")
        };
        Professor [] professoresHumanas = {
                new Professor("Arthur", 4500.00, "História"),
                new Professor("Giulia", 4500,"Geografia"),
                new Professor("Marcos", 4500.00,"Filosofia"),
                new Professor("Rayane",4500.00, "Sociologia")
        };
        Professor [] professoresLinguagens = {
                new Professor("Joana",4500.00,"Português"),
                new Professor("Ricardo", 4500.00,"Inglês")
        };
        ArrayList<String> equipe1 = new ArrayList<>();
        for (Professor professor : professoresExatas) {
            professor.exibirDadosFuncionario();
            equipe1.add(professor.getNome());
        }
        ArrayList<String> equipe2 = new ArrayList<>();
        for (Professor professor : professoresHumanas) {
            professor.exibirDadosFuncionario();
            equipe2.add(professor.getNome());
        }
        ArrayList<String> equipe3 = new ArrayList<>();
        for (Professor professor : professoresLinguagens) {
            professor.exibirDadosFuncionario();
            equipe3.add(professor.getNome());
        }
        Coordenador coordenador1 = new Coordenador("Carlos", 6000.00, equipe1);
        Coordenador coordenador2 = new Coordenador("Fernanda", 6000.00, equipe2);
        Coordenador coordenador3 = new Coordenador("Patrícia", 6000.00, equipe3);
        System.out.println("\nDados dos Coordenadores:");
        coordenador1.exibirDadosFuncionario();
        coordenador2.exibirDadosFuncionario();
        coordenador3.exibirDadosFuncionario();


    }
}
