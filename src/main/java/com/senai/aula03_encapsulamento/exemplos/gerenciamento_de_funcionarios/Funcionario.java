package com.senai.aula03_encapsulamento.exemplos.gerenciamento_de_funcionarios;

import java.util.Arrays;

public class Funcionario {
    private String nome;
    private double salario;
    private String cargo;
    private String[] listaCargos ={ "Gerente","Analista", "Programador"};

    public Funcionario(String nome, double salario, int idCargo) {

        if(!nome.isBlank()){
        this.nome = nome;
        }else {
            System.out.println("O campo nome não pode ser nulo ou vazio.");
            System.out.println("O campo nome será atribuido como anônimo!");

        }if (salario>=1320){
            this.salario = salario;
        }else {
            System.out.println("O salário deve ser igual ou superior a R$1320,00");
            System.out.println("O campo salário será atribuido como R$1320,00");
            this.salario = 1320;
        }
        if(idCargo >= 1 && idCargo <= listaCargos.length){
            this.cargo = listaCargos[idCargo - 1];
        }else {
            System.out.println("Cargo Inválido!");
            System.out.println("O campo cargo será atribuido como 'Programador'");
            this.cargo = listaCargos[2];
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(!nome.isBlank()){
            this.nome = nome;
        }else {
            System.out.println("O campo nome não pode ser nulo ou vazio.");
        }
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario>=1320){
            this.salario = salario;
        }else {
            System.out.println("O salário deve ser igual ou superior a R$1320,00");
        }
    }
    public void aumentarSalario(int porcentagemAumento){
        if (porcentagemAumento>0) {
            this.salario += (salario * porcentagemAumento) / 100;
            System.out.println("Aumento do salário do funcionario "+nome+" realizado com sucesso | Valor atualizado: R$"+salario);
        }else {
            System.out.println("Valor Inválido!");
        }

    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(int idCargo) {
        if(idCargo >= 1 && idCargo <= listaCargos.length){
            this.cargo = listaCargos[idCargo - 1];
        }else {
            System.out.println("Cargo Inválido!");
            System.out.println("O campo cargo será atribuido como 'Programador'");
            this.cargo = listaCargos[2];
        }
    }

    @Override
    public String toString() {
        return "Funcionário: \n"+ "NOME: "+ nome + "\n"+ "CARGO: "+cargo+ "\n"+ "SALÁRIO: "+ salario;
    }
}
