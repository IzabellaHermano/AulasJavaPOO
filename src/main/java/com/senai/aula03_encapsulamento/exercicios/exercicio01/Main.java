package com.senai.aula03_encapsulamento.exercicios.exercicio01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       Produtos produto = new Produtos(
               "Macarrão Instântaneo Galinha Caipira Nissin",
               3.46
       );
        System.out.println("PRODUTOS DISPONIVEIS:");
        System.out.print("Nome: ");
        produto.getNome();
        System.out.print("Preço: ");
        produto.getPreco();

        System.out.println("\nATUALIZE AS INFORMAÇÕES A BAIXO:");
        System.out.print("Nome: ");
        produto.setNome(scanner.nextLine());
        System.out.print("Preço: ");
        produto.setPreco(scanner.nextDouble());
        System.out.println("_____________________PRODUTO ATUALIZADO COM SUCESSO_____________________");
        System.out.print("Nome: ");
        produto.getNome();
        System.out.print("Preço: ");
        produto.getPreco();
    }

}
