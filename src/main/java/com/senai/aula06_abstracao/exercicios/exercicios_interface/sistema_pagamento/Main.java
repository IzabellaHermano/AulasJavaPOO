package com.senai.aula06_abstracao.exercicios.exercicios_interface.sistema_pagamento;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MetodoPagamento pagamentoCartaoCredito = new CartaoCredito(1, 300, 11111111);
        MetodoPagamento pagamentoPix = new Pix(2, 800, 1234);
        MetodoPagamento pagamentoCarteiraDigital = new CarteiraDigital(3, 650, 3333);

        int opcaoMenu;
        do {
            String menu = """
                                        _________________________________________________________
                                        |   Bem-Vindo a FinTechPlus:                            |
                                        |       Escolha um Método de Pagamento:                 |
                                        |           1- Cartão de Crédito                        |
                                        |           2- Carteira Digital                         |
                                        |           3- Pix                                      |
                                        |           4- Sair                                     |
                                        |_______________________________________________________|
                    
                    """;
            System.out.println(menu);
            opcaoMenu = scanner.nextInt();
            switch (opcaoMenu) {
                case 1:
                    pagamentoCartaoCredito.autenticarUsuario();
                    pagamentoCartaoCredito.validarAntifraude();
                    pagamentoCartaoCredito.executarPagamento();
                    pagamentoCartaoCredito.registrarLog();

                    break;
                case 2:
                    pagamentoCarteiraDigital.autenticarUsuario();
                    pagamentoCarteiraDigital.validarAntifraude();
                    pagamentoCarteiraDigital.executarPagamento();
                    pagamentoCarteiraDigital.registrarLog();

                    break;
                case 3:
                    pagamentoPix.autenticarUsuario();
                    pagamentoPix.validarAntifraude();
                    pagamentoPix.executarPagamento();
                    pagamentoPix.registrarLog();

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
