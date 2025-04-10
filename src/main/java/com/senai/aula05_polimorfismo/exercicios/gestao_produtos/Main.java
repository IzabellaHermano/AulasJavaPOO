package com.senai.aula05_polimorfismo.exercicios.gestao_produtos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Produto produto01 = new ProdutoFisico("Garrafa Térmica Digital",45,4);
        Produto produto02 = new ProdutoFisico("Caderno Inteligente",86,4);
        Produto produto03 = new ProdutoDigital("Curso de Programação Orientada a Objetos - JAVA",200,9);
        Produto produto04 = new ProdutoDigital("Curso de Banco de Dados - MYSQL",150,9);
        Produto produto05 = new ProdutoServico("Consutoria Financeira",350,15);
        Produto produto06 = new ProdutoServico("Design Gráfico",550,15);
        int opcaoMenu;
        do {
            String menu = """
                                        _________________________________________________________
                                        |   Bem-Vindo a Amazon:                                 |
                                        |       Escolha um Tipo de Produto:                     |
                                        |           1- Produtos Físicos                         |
                                        |           2- Produtos Digitais                        |
                                        |           3- Produtos Serviços                        |
                                        |           4- Sair                                     |
                                        |_______________________________________________________|
                    
                    """;
            System.out.println(menu);
            opcaoMenu = scanner.nextInt();
            switch (opcaoMenu){
                case 1:
                    System.out.println("Dados dos Produtos Físicos:");
                    System.out.println("\n|Nome: "+ produto01.nome+"\nPreço: R$"+ produto01.precoFinal());
                    System.out.println("\n|Nome: "+ produto02.nome+"\nPreço: R$"+ produto02.precoFinal());
                    break;
                case 2:
                    System.out.println("Dados dos Produtos Digitais:");
                    System.out.println("\n|Nome: "+ produto03.nome+"\nPreço: R$"+ produto03.precoFinal());
                    System.out.println("\n|Nome: "+ produto04.nome+"\nPreço: R$"+ produto04.precoFinal());
                    break;
                case 3:
                    System.out.println("Dados dos Produtos Serviços:");
                    System.out.println("\n|Nome: "+ produto05.nome+"\nPreço: R$"+ produto05.precoFinal());
                    System.out.println("\n|Nome: "+ produto06.nome+"\nPreço: R$"+ produto06.precoFinal());
                    break;
                case 4:
                    System.out.println("Fim do Programa!");
                    break;
                default:
                    System.out.println("Opção Inválida!");
            }
        }while (opcaoMenu!=4);
    }
}
