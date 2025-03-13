package com.senai.aula04_heranca.exemplos.sistema_de_cadastro_de_funcionarios;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario01 = new Funcionario(
                "Ana Luiza",
                4000
        );
        Funcionario funcionario02 = new Funcionario(
                "Nicoly",
                4000
        );
        Funcionario funcionario03 = new Funcionario(
                "Pietra",
                4000
        );
        Gerente gerente = new Gerente(
                "Izabella",
                5000,
                1500);
        System.out.println("DADOS FOLHA DE PAGAMENTO:\n");
        System.out.println("Gerente: ");
        gerente.exibirDados();
        System.out.println("\n\nFuncionários:");
        funcionario01.exibirDados();
        funcionario02.exibirDados();
        funcionario03.exibirDados();
    }
}
