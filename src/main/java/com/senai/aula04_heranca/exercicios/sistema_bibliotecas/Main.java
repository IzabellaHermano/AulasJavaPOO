package com.senai.aula04_heranca.exercicios.sistema_bibliotecas;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LivroFisico livro01 = new LivroFisico("O Homem da Areia","E.T.A. Hoffmann", 88);
        LivroFisico livro02 = new LivroFisico("O Escaravelho de Ouro","Edgar Allan",96);
        LivroFisico livro03 = new LivroFisico("O Alienista","Machado de Assis",72);
        LivroDigital livro04 = new LivroDigital("A Metamorfose", "Franz Kafka", 200);
        LivroDigital livro05 = new LivroDigital("O Pequeno Príncipe", "Antoine de Saint", 196);
        LivroDigital livro06 = new LivroDigital("A Revolução dos Bichos", "George Orwell", 242);

        int opcaoMenu;
        do {
            String menu = """
                                        _________________________________________________________
                                        |   Bem-Vindo a Blibioteca Mário de Andrade!            |
                                        |   Escolha uma Opção :                                 |
                                        |       1- Livros Físicos                               |
                                        |       2- Livros Digitais                              |
                                        |       3- Sair                                         |
                                        |_______________________________________________________|
                    
                    """;
            System.out.println(menu);
            opcaoMenu = scanner.nextInt();
            switch (opcaoMenu){
                case 1:
                    livro01.exibirDadosLivro();
                    livro02.exibirDadosLivro();
                    livro03.exibirDadosLivro();
                    break;
                case 2:
                    livro04.exibirDadosLivro();
                    livro05.exibirDadosLivro();
                    livro06.exibirDadosLivro();
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
