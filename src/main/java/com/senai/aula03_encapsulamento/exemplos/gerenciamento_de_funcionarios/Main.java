package com.senai.aula03_encapsulamento.exemplos.gerenciamento_de_funcionarios;

public class Main {
    public static void main(String[] args) {

        System.out.println("____________TESTE 01____________");
        Funcionario funcionario01 = new Funcionario("Izabella",2000,1);
        System.out.println(funcionario01);

        System.out.println("____________TESTE 02____________");
        Funcionario funcionario02 = new Funcionario("",1200,4);
        System.out.println(funcionario02);

        System.out.println("____________TESTE 03____________");
        funcionario01.aumentarSalario(60);


    }


}
