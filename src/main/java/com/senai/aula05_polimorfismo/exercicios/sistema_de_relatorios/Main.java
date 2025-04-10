package com.senai.aula05_polimorfismo.exercicios.sistema_de_relatorios;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Relatorios relatorioPDF = new RelatorioPDF();
        Relatorios relatorioCSV = new RelatorioCSV();
        Relatorios relatorioJSON = new RelatorioJSON();

        int opcaoMenu;
        do {
            String menu = """
                                        _________________________________________________________
                                        |   Escolha uma Extensão:                               |
                                        |       1- PDF                                          |
                                        |       2- CSV                                          |
                                        |       3- JSON                                         |
                                        |       4- Sair                                         |
                                        |_______________________________________________________|
                    
                    """;
            System.out.println(menu);
            opcaoMenu = scanner.nextInt();
            switch (opcaoMenu){
                case 1:
                    relatorioPDF.gerarRelatorio();
                    break;
                case 2:
                   relatorioCSV.gerarRelatorio();
                    break;
                case 3:
                    relatorioJSON.gerarRelatorio();
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

