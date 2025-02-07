package com.senai.aula01_introducao_poo.exercicios.exercicio01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Produtos produto01 = new Produtos(
                "Macarrão Instântaneo Galinha Caipira Nissin",
                3.46,
                56
        );
        Produtos produto02 = new Produtos(
                "Qboa - Água Sanitaria",
                5.99,
                42
        );
        System.out.println("Atualize Estoque:");
        System.out.println("Total dispovivel de "+ produto01.nomeProduto+" é de "+ produto01.qntProdutoEstoque);
        System.out.print("Insira o valor que deseja atualzar: ");
        int estoqueAualizado = scanner.nextInt();
        produto01.atualizarEsoque(estoqueAualizado);
        System.out.println("_________________________________________________________________");

        System.out.println("Produtos Disponíveis: ");
        produto01.exibirDetalhes();
        produto02.exibirDetalhes();
        System.out.println("_________________________________________________________________");

        System.out.println("Produtos Disponíveis: ");
        produto01.calcularValorEstoque();
        produto02.calcularValorEstoque();


    scanner.close();
    }
}
