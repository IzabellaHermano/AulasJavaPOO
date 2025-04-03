package com.senai.aula06_abstracao.exemplos.animal;

public class Pato extends Animal {

    public Pato(String nome) {
        super(nome);
    }
    @Override
    void fazerSom() {
        System.out.println("QUAK QUAK");
    }
    void botarOvo(){
        System.out.println(nome+" Virou mamae");
    }
}
