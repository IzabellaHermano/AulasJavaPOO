package com.senai.aula03_encapsulamento.exercicios.gerenciamento_de_funcionarios;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Funcionario [] funcionarios = {
                new Funcionario(13500.00, "Izabella Carolina", "Gerente"),
                new Funcionario(7814.00, "Ana Luiza", "Analista"),
                new Funcionario(4297.00, "Nicoly", "Programador"),
                new Funcionario(4297.00, "Pietra", "Programador"),
                new Funcionario(4297.00, "Andre", "Programador"),
        };
        while (true){
            System.out.println("\nFUNCIONÁRIOS:");
            for (int i = 0; i < funcionarios.length; i++) {
                System.out.println((i+1)+". " +funcionarios[i].getNome());
            }
            System.out.println("0.Sair");
            System.out.print("\nDigite o indice do funcionário que deseja consultar os dados: ");
            int opcao;
            try {
                opcao = scanner.nextInt();
            }catch (NumberFormatException e){
                System.out.println("Resposta Inválida!");
                continue;
            }
            if (opcao ==0){
                System.out.println("Fim do Programa!");
                break;
            }
            if (opcao <1 || opcao > funcionarios.length){
                System.out.println("Resposta Inválida!");
                continue;
            }
            Funcionario funcionarioEscolhido =  funcionarios[opcao - 1];
            System.out.println("\nINFORMAÇÕES DO FUNCIONÁRIO");
            funcionarioEscolhido.infFuncionarios();
        }
    }
}
