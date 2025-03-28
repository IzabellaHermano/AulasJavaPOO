package com.senai.aula04_heranca.exercicios.sistema_gestao_pedidos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PedidoOnline pedidoOnline01 = new PedidoOnline(1, 65, 10);
        PedidoOnline pedidoOnline02 = new PedidoOnline(2, 87, 9);
        PedidoPresencial pedidoPresencial01 = new PedidoPresencial(3, 192, 0.30);
        PedidoPresencial pedidoPresencial02 = new PedidoPresencial(4, 192, 0);

        int opcaoMenu;
        do {
            String menu = """
                                        _________________________________________________________
                                        |   Escolha uma Opção :                                 |
                                        |       1- Pedidos Online                               |
                                        |       2- Pedidos Presencial                           |
                                        |       3- Sair                                         |
                                        |_______________________________________________________|
                    
                    """;
            System.out.println(menu);
            opcaoMenu = scanner.nextInt();
            switch (opcaoMenu){
                case 1:
                    pedidoOnline01.exibirDadosPedido();
                    pedidoOnline02.exibirDadosPedido();
                    break;
                case 2:
                    pedidoPresencial01.exibirDadosPedido();
                    pedidoPresencial02.exibirDadosPedido();
                    break;
                case 3:
                    System.out.println("Fim do Programa!");
                    break;
                default:
                    System.out.println("Opção Inválida!");
            }
        }while (opcaoMenu!=3);
    }
}