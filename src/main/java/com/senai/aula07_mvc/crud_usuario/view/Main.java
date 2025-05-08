package com.senai.aula07_mvc.crud_usuario.view;

import com.senai.aula07_mvc.crud_usuario.controller.OperadorController;
import com.senai.aula07_mvc.crud_usuario.controller.SupervisorController;
import com.senai.aula07_mvc.crud_usuario.model.Operador;
import com.senai.aula07_mvc.crud_usuario.model.Supervisor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OperadorController opController = new OperadorController();
        SupervisorController supController = new SupervisorController();

        String menu =
                """
                      ____________________________________
                      |  Menu:                            |
                      |     1 - Cadastrar usuario         | 
                      |     2 - Deletar                   |
                      |     3 - Atualizar                 |
                      |     4 - Exibir usuarios           |
                      |     5 - Ligar máquinas            |
                      |     6 - Demitir operador          |
                      |     7 - Sair                      |
                      |___________________________________|
                """;
        int opcao;
        int escolhaTipo=0;

        do {
            System.out.println(menu);
            opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao > 0 && opcao < 7){
                System.out.println("|Qual tipo de usuario?|");
                System.out.println("|1 - Operador         |");
                System.out.println("|2 - Supervisor       |");
                escolhaTipo = scanner.nextInt();
                scanner.nextLine();
            }
            switch (opcao){
                case 1 :
                    System.out.println("|Preencha os dados a seguir:|");
                    System.out.print("|ID: ");
                    int id=  scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("|Nome:");
                    String nome = scanner.nextLine();

                    if (escolhaTipo == 1 ){
                        System.out.print("|Setor: ");
                        String setor = scanner.nextLine();
                        Operador operador = new Operador(nome, id, setor);
                        if(opController.cadastrarOperador(operador)){
                            System.out.println("Cadastrado com Sucesso!");
                        }
                        else {
                            System.out.println("Não foi possivel cadastrar!");
                        }
                    } else if (escolhaTipo == 2) {
                        System.out.print("|Area:");
                        String area = scanner.nextLine();
                        Supervisor supervisor = new Supervisor(nome, id, area);
                        if(supController.cadastrarSupervisor(supervisor)){
                            System.out.println("Cadastrado com Sucesso!");
                        }
                        else {
                            System.out.println("Não foi possivel cadastrar!");
                        }
                    }
                    break;

                case 2:
                    if (escolhaTipo ==1)
                        opController.listarOperdores().forEach(System.out::println);

                    else if (escolhaTipo == 2)
                        supController.listarSupervisores().forEach(System.out::println);

                    System.out.print("|Escolha um usuario pelo id para deletar:");
                    id = scanner.nextInt();
                    scanner.nextLine();

                    if(escolhaTipo == 1)
                        opController.deletarOperador(id);
                    else if ( escolhaTipo == 2)
                        supController.deletarSupervisor(id);
                    break;

                case 3:
                    if (escolhaTipo ==1)
                        opController.listarOperdores().forEach(System.out::println);

                    else if (escolhaTipo == 2)
                        supController.listarSupervisores().forEach(System.out::println);

                    System.out.print("|Escolha um usuario pelo id para atualizar:");
                    id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("|Atualize as seguintes informações|");
                    System.out.print("|Nome: ");
                    nome = scanner.nextLine();

                    if (escolhaTipo == 1){
                        System.out.print("|Setor: ");
                        String setor = scanner.nextLine();
                        Operador operador = new Operador(nome,id,setor);
                        opController.atualizarOperador(operador);
                    }
                    else if (escolhaTipo == 2 ){
                        System.out.print("|Area: ");
                        String area = scanner.nextLine();
                        Supervisor supervisor = new Supervisor( nome, id, area);
                        supController.atualizarSupervisor(supervisor);
                    }
                    System.out.println("Usuário atualizado com sucesso!");
                    break;

                case 4:
                    if (escolhaTipo ==1)
                        opController.listarOperdores().forEach(System.out::println);

                    else if (escolhaTipo == 2)
                        supController.listarSupervisores().forEach(System.out::println);
                    break;

                case 5:

                    break;
                case 6:

                    break;
                case 7:
                    System.out.println("Encerrando o programa...");
                    scanner.close();
                    break;
                default:
                    System.out.println("Opção invalida!\n|Insira uma opção válida: ");
            }
        }while (opcao != 7);
    }
}