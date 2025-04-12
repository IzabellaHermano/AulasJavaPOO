package com.senai.aula06_abstracao.exercicios.exercicios_abstracao.gerenciamento_eventos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Eventos eventoSocial = new EventosSociais();
        Eventos competicao = new Competicoes();
        Eventos desafiosRelampagos = new DesafiosRelampagos();


        int opcaoMenu;
        do {
            String menu = """
                                        _________________________________________________________
                                        |   Bem-Vindo a  GameMasters:                           |
                                        |       Escolha um Evento:                              |
                                        |           1- Eventos Sociais                          |
                                        |           2- Competições                              |
                                        |           3- Desafios Relâmpago                       |
                                        |           4- Sair                                     |
                                        |_______________________________________________________|
                    
                    """;
            System.out.println(menu);
            opcaoMenu = scanner.nextInt();
            switch (opcaoMenu) {
                case 1:
                    eventoSocial.iniciarEvento();
                    eventoSocial.registrarLog();
                    eventoSocial.premiarParticipantes();
                    eventoSocial.finalizarEvento();

                    break;
                case 2:
                    competicao.iniciarEvento();
                    competicao.registrarLog();
                    competicao.premiarParticipantes();
                    competicao.finalizarEvento();

                    break;
                case 3:
                    desafiosRelampagos.iniciarEvento();
                    desafiosRelampagos.registrarLog();
                    desafiosRelampagos.premiarParticipantes();
                    desafiosRelampagos.finalizarEvento();

                    break;
                case 4:
                    System.out.println("Fim do Programa!");
                    break;
                default:
                    System.out.println("Opção Inválida!");
            }
        } while (opcaoMenu != 4);
    }
}
