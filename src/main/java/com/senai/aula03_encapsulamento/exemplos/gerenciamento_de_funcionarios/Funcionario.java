package com.senai.aula03_encapsulamento.exemplos.gerenciamento_de_funcionarios;

public class Funcionario {
    private String nome;
    private double salario;
    private String cargo;
    private String[] listaCargos ={ "Gerente",
            "Analista", "Programador"};

    public Funcionario(String nome, double salario, String cargo) {

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

        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
