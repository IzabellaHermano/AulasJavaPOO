package com.senai.aula02_colecoes.exercicios.exercicio01;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Tarefas> listaTarefa = new ArrayList<>();
    //construindo lista

    static Scanner scanner = new Scanner(System.in);
    // quando esta em static a função pertence a toda classe main

    public static void main(String[] args) {
        int opcaoMenu;
        do {
            String menu = """
                    _________________________________________________________
                    |   Escolha uma opção:                                  |
                    |       1- Adicionar Tarefa                             |
                    |       2- Listar Tarefas                               |
                    |       3- Marcar Tarefas Como Concluída                |
                    |       4- Remover Tarefa                               |
                    |       5- Sair                                         |
                    |_______________________________________________________|
                    """;
            System.out.println(menu);
            opcaoMenu = scanner.nextInt();
            scanner.nextLine();
            switch (opcaoMenu){
                case 1:
                    adicionarTarefas();
                    break;
                case 2:
                    listarTarefas();
                    break;
                case 3:
                    tarefaConcluida();
                    break;
                case 4:
                    removerTarefas();
                    break;
                case 5:
                    System.out.println("Fim do programa!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }while ( opcaoMenu != 5);

    }
    //crud

    public static void adicionarTarefas (){
        System.out.print("Digite a Tarefa que Deseja Adicinar: ");
        String nomeTarefaAdd = scanner.nextLine();
        listaTarefa.add(new Tarefas(nomeTarefaAdd));
        System.out.println("Tarefa Adicionada com Sucesso!");
    }
    public static void listarTarefas(){
        if (listaTarefa.isEmpty()) {
            System.out.print("Nenhuma Tarefa Adicionada.");
            return;
        }
        System.out.println("Lista de Tarefas: ");
        for (int i = 0; i < listaTarefa.size(); i++) {
            System.out.println(( i+ 1) + ". "+ listaTarefa.get(i));

        }
    }
    public static void tarefaConcluida(){
        listarTarefas();
        if (listaTarefa.isEmpty()) return;

        System.out.print("Digite o Número da Tarefa que Deseja Marcar como Concluida: ");
        int indice = scanner.nextInt() -1;
        if (indice >= 0 && indice < listaTarefa.size()){
           listaTarefa.get(indice).tarefaConcluida();
            System.out.println("Tarefa Concluida com Sucesso!");
        }else {
            System.out.println("Número Inválido!");
        }
    }
    public static void removerTarefas(){
        listarTarefas();
        if (listaTarefa.isEmpty()) return;

        System.out.print("Digite o Número da Tarefa que Deseja Remover: ");
        int indice = scanner.nextInt() -1 ;
        if (indice >= 0 && indice < listaTarefa.size()){
            listaTarefa.remove(indice);
            System.out.println("Tarefa Removida com Sucesso!");
        }else {
            System.out.println("Número Inválido!");
        }

    }
}
