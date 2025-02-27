package com.senai.aula02_colecoes.exercicios.exercicio02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static ArrayList<Produtos> estoque = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcaoMenu;
        do {
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
            switch (opcaoMenu) {
                case 1:
                    cadastroProduto();
                    break;
                case 2:
                    listarProdutos();
                    break;
                case 3:
                    atualizarProdutos();
                    break;
                case 4:
                    removerProduto();
                    break;
                case 5:
                    buscarProduto();
                    break;
                case 6:
                    System.out.println("Fim do programa!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcaoMenu != 6);
    }

    public static void cadastroProduto() {
        System.out.print("Digite o Nome do Produto que Deseja Adicinar: ");
        String nomeProdtutoAdd = scanner.nextLine();

        System.out.print("Digite a Quantidade do Produto que Deseja Adicinar: ");
        int novoQnt = scanner.nextInt();
        estoque.add(new Produtos(nomeProdtutoAdd, novoQnt));
        System.out.println("_____________________PRODUTO CADASTRADO COM SUCESSO_____________________");
    }

    public static void listarProdutos() {
        if (estoque.isEmpty()) {
            System.out.print("Nenhum Produto Adicionado.");
            return;
        }
        System.out.println("PRODUTOS DISPONIVEIS: ");
        for (int i = 0; i < estoque.size(); i++) {
            System.out.println(i + estoque.get(i).toString());

        }
    }

    public static void atualizarProdutos() {
        listarProdutos();
        System.out.print("Digite o Indice do Produto que Deseja Atualizar o Estoque:");
        int indice = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Digite a Nova Quantidadade:");
        int novaQnt = scanner.nextInt();

        estoque.set(indice, new Produtos(novaQnt));
        System.out.println("_____________________PRODUTO ATUALIZADO COM SUCESSO_____________________");

    }

    public static void removerProduto() {
        listarProdutos();
        if (estoque.isEmpty()) return;

        System.out.print("Digite o Indice do Produto que Deseja Remover: ");
        int indice = scanner.nextInt();
        if (indice >= 0 && indice < estoque.size()) {
            estoque.remove(indice);
            System.out.println("_____________________PRODUTO REMOVIDO COM SUCESSO_____________________");
        } else {
            System.out.println("Indice Inválido!");
        }
    }

    public static void buscarProduto() {
        System.out.print("DIGITE O NOME DO PRODUTO QUE DESEJA BUSCAR: ");
        String nomeDigitado = scanner.nextLine();
        List<Produtos> buscarProduto = estoque.stream().filter(e -> e.nomeProduto.toLowerCase().contains(nomeDigitado)).toList();

        System.out.println("PRODUTOS DISPONIVEIS: ");
        for (int i = 0; i < estoque.size(); i++) {
            System.out.println(i + estoque.get(i).toString());
        }
    }
}