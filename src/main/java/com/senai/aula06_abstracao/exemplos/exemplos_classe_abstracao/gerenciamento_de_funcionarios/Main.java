package com.senai.aula06_abstracao.exemplos.exemplos_classe_abstracao.gerenciamento_de_funcionarios;

public class Main {
    public static void main(String[] args) {
        testaPagamento(new FuncionarioEfetivo("Izabella",5000,1000));
        testaPagamento(new FuncionarioTemporario("Ana ", 5000,5,100));

    }
    public static void testaPagamento(Funcionario funcionario){
        System.out.println("___________________Funcionários___________________");
        funcionario.exibirDados();
        funcionario.aumentarSalario(10);
        funcionario.exibirDados();
        funcionario.calcularBonus();
        funcionario.exibirDados();

    }
}
