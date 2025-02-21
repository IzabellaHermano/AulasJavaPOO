package com.senai.aula02_colecoes.exercicios.exercicio02;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList <Produtos> estoque = new ArrayList<>();
    static Scanner scanner = new Scanner( System.in);

    public static void main(String[] args) {
        int opcaoMenu;
        do{
            String menu = """
                    _________________________________________________________
                    |   Escolha uma opção:                                  |
                    |       1- Cadastrar Novo Produto                       |
                    |       2- Listar Produtos Disponiveis                  |
                    |       3- Atualizar Quantidade de Produto              |
                    |       4- Remover Produto                              |
                    |       5- Buscar Produto                               |
                    |       6- Sair                                         |       
                    |_______________________________________________________|
                    """;
            System.out.println(menu);
            opcaoMenu = scanner.nextInt();
            scanner.nextLine();

        }while (opcaoMenu != 6);
    }

}
