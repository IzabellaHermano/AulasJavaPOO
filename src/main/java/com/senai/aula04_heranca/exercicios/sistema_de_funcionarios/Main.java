package com.senai.aula04_heranca.exercicios.sistema_de_funcionarios;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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

        ArrayList<Professor> equipeExatas = new ArrayList<>();
        for (Professor professor : professoresExatas) {
            equipeExatas.add(professor);
        }
        ArrayList<Professor> equipeHumanas = new ArrayList<>();
        for (Professor professor : professoresHumanas) {
            equipeHumanas.add(professor);
        }
        ArrayList<Professor> equipeLinguagens = new ArrayList<>();
        for (Professor professor : professoresLinguagens) {
            equipeLinguagens.add(professor);
        }
        Coordenador coordenador1 = new Coordenador("Carlos", 6000.00, equipeExatas);
        Coordenador coordenador2 = new Coordenador("Fernanda", 6000.00, equipeHumanas);
        Coordenador coordenador3 = new Coordenador("Patrícia", 6000.00, equipeLinguagens);

        int opcaoMenu;
        do {
            String menu = """
                                        _________________________________________________________
                                        |   Escolha uma Opção :                                 |
                                        |       1- Professores de Humanas                       |
                                        |       2- Professores de Exatas                        |
                                        |       3- Profesores de Linguagens                     |
                                        |       4- Coordenadores                                |
                                        |       5- Sair                                         |
                                        |_______________________________________________________|
                    
                    """;
            System.out.println(menu);
            opcaoMenu = scanner.nextInt();
            switch (opcaoMenu){
                case 1:
                    System.out.println("\nDados dos Professores:");
                    for (Professor professorHumana : professoresHumanas){
                        professorHumana.exibirDadosFuncionario();
                    }
                    break;
                case 2:
                    System.out.println("\nDados dos Professores:");
                    for (Professor professoresExata : professoresExatas) {
                        professoresExata.exibirDadosFuncionario();
                    }
                    break;
                case 3:
                    System.out.println("\nDados dos Professores:");
                    for (Professor professorLinguagem:professoresLinguagens){
                        professorLinguagem.exibirDadosFuncionario();
                    }
                    break;
                case 4:
                    System.out.println("\nDados dos Coordenadores:");
                    coordenador1.exibirDadosFuncionario();
                    coordenador2.exibirDadosFuncionario();
                    coordenador3.exibirDadosFuncionario();
                    break;
                case 5:
                    System.out.println("Fim do programa!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }while (opcaoMenu !=5 );
    }
}
