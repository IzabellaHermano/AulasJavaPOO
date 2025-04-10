package com.senai.aula05_polimorfismo.exercicios.sistema_reservas_hotel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Reserva reserva01 = new ReservaSimples("Ana Luiza",4, 100);
        Reserva reserva02 = new ReservaSimples("Pietra",6, 100);
        Reserva reserva03 = new ReservaVIP("Izabella",3, 100, 35);
        Reserva reserva04 = new ReservaVIP("Nicoly",5, 100, 35);
        int opcaoMenu;
        do {
            String menu = """
                                        _________________________________________________________
                                        |   Escolha uma Opção :                                 |
                                        |       1- Reservas Simples                             |
                                        |       2- Reservas VIP                                 |
                                        |       3- Sair                                         |
                                        |_______________________________________________________|
                    
                    """;
            System.out.println(menu);
            opcaoMenu = scanner.nextInt();
            switch (opcaoMenu){
                case 1:
                    System.out.println("Dados dos Hospedes:");
                    System.out.println("\n|Nome: "+reserva01.getNome()+"\nCusto Total: R$"+ reserva01.custoTotal());
                    System.out.println("\n|Nome: "+reserva02.getNome()+"\nCusto Total: R$"+ reserva02.custoTotal());
                    break;
                case 2:
                    System.out.println("Dados dos Hospedes:");
                    System.out.println("\n|Nome: "+reserva03.getNome()+"\nCusto Total: R$"+ reserva03.custoTotal());
                    System.out.println("\n|Nome: "+reserva04.getNome()+"\nCusto Total: R$"+ reserva04.custoTotal());
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

