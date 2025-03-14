package com.senai.aula03_encapsulamento.exercicios.conta_bancária_com_operações_simples;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaBancaria contaBancaria01 = new ContaBancaria(
                "Izabella",
                1000
        );
        ContaBancaria contaBancaria02 = new ContaBancaria(
                "Ana",
                1000
        );
        System.out.println(contaBancaria01);
        System.out.println(contaBancaria02);
        int opcaoMenu;
        do {
            String menu = """
                                        _________________________________________________________
                                        |   Escolha uma Opção :                                 |
                                        |       1- Depositar                                    |
                                        |       2- Sacar                                        |
                                        |       3- Transferir                                   |
                                        |       4- Sair                                         |
                                        |_______________________________________________________|
                    
                    """;
            System.out.println(menu);
            opcaoMenu = scanner.nextInt();
            switch (opcaoMenu){
                case 1:
                    contaBancaria01.depositar(200);
                    contaBancaria02.depositar(300);
                    break;
                case  2:
                    contaBancaria01.sacar(50);
                    contaBancaria02.sacar(100);
                    break;
                case 3:
                    contaBancaria01.tranferir(20, contaBancaria02);
                    break;
                case 4:
                    System.out.println("Fim do programa!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcaoMenu !=4);
    }
}
