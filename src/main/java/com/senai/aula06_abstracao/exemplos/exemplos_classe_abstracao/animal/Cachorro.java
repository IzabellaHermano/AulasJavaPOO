package com.senai.aula06_abstracao.exemplos.exemplos_classe_abstracao.animal;

public class Cachorro extends Animal{

    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    void fazerSom() {
        System.out.println("AU AU");
    }
}
