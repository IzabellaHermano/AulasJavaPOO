package com.senai.aula01_introducao_poo.exercicios.exercicio02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Aluno aluno01 = new Aluno(
                "Izabella",
                15,
                8.6f
        );
        Aluno aluno02 = new Aluno(
                "Ana Luiza",
                14,
                9.1f
        );
        Aluno aluno03 = new Aluno(
                "Nicoly",
                17,
                8.6f
        );
        Aluno aluno04 = new Aluno(
                "Pietra",
                15,
                7.6f
        );
        System.out.println("Atualização de Nota:\nInformações do Aluno:\nNome: "+aluno01.nomeAluno+"\nNota Atual:"+aluno01.notaAluno+"\n");
        System.out.print("Digite a nova nota:");
        float notaAtualizada = scanner.nextFloat();
        aluno01.azualizaNota(notaAtualizada);
        System.out.println("Nota atualizada com sucesso!");
        System.out.println("\n---------------------------------------------------------------");

        System.out.println("Alunos Matriculados:");
        aluno01.exibirInformacoes();
        aluno02.exibirInformacoes();
        aluno03.exibirInformacoes();
        aluno04.exibirInformacoes();

        System.out.println("Resultado Final:");
        //Verificando aprovação aluno01
        boolean aprovacao01 = aluno01.verificarAprovacao();
        if (aprovacao01){
            System.out.println("Aluno " +aluno01.nomeAluno+ " Aprovado!");
        } else if (!aprovacao01){
            System.out.println("Aluno "+aluno01.nomeAluno+" Reprovado!");
        }

        //Verificando aprovação aluno02
        boolean aprovacao02 = aluno02.verificarAprovacao();
        if (aprovacao02){
            System.out.println("Aluno " +aluno02.nomeAluno+ " Aprovado!");
        } else if (!aprovacao02){
            System.out.println("Aluno "+aluno02.nomeAluno+" Reprovado!");
        }

        //Verificando aprovação aluno03
        boolean aprovacao03 = aluno03.verificarAprovacao();
        if (aprovacao03){
            System.out.println("Aluno " +aluno03.nomeAluno+ " Aprovado!");
        } else if (!aprovacao03){
            System.out.println("Aluno "+aluno03.nomeAluno+" Reprovado!");
        }

        //Verificando aprovação aluno04
        boolean aprovacao04 = aluno04.verificarAprovacao();
        if (aprovacao04){
            System.out.println("Aluno " +aluno04.nomeAluno+ " Aprovado!");
        } else if (!aprovacao04){
            System.out.println("Aluno "+aluno04.nomeAluno+" Reprovado!");
        }
        System.out.println("\n---------------------------------------------------------------");

    }

}
