package com.senai.aula03_encapsulamento.exercicios.gerenciamento_de_funcionarios;

public class Funcionario {

    private double salario;
    private String nome;
    private String cargo;
    private String[] listaCargos ={ "Gerente","Analista", "Programador"};

    public Funcionario(double salario, String nome, String cargo) {

        if (salario>=1320){
            this.salario = salario;
        }else {
            System.out.println("O salário deve ser igual ou superior a R$1320,00");
            System.out.println("O campo salário será atribuido como R$1320,00");
            this.salario = 1320;
        }
        if(!nome.isBlank()){
            this.nome = nome;
        }else {
            System.out.println("O campo nome não pode ser nulo ou vazio.");
            System.out.println("O campo nome será atribuido como anônimo!");

        }
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        boolean cargoValido = false;
        for ( String cargos: listaCargos) {
            if (cargos.equalsIgnoreCase(cargo))
                cargoValido = true;
            break;
        }
        if (!cargoValido){
            throw new IllegalArgumentException("Cargo Inválido!");
        }
        this.cargo = cargo;
    }
    public void aumentarSalario(int porcentagemAumento){
        if (porcentagemAumento>0) {
            this.salario += (salario * porcentagemAumento) / 100;
            System.out.println("Aumento do salário do funcionario "+nome+" realizado com sucesso | Valor atualizado: R$"+salario);
        }else {
            System.out.println("Valor Inválido!");
        }
    }
    public void infFuncionarios(){
        System.out.printf("|NOME: %s\n|CARGO: %s\n|SALÁRIO:%.2f\n", nome, cargo, salario);
    }
}
