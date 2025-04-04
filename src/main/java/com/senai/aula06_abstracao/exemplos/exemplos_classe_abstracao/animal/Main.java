package com.senai.aula06_abstracao.exemplos.exemplos_classe_abstracao.animal;

public class Main {
    public static void main(String[] args) {
        testeAnimal(new Cachorro("Sury"));
        testeAnimal(new Pato("Alexandre"));
    }
    private static void testeAnimal(Animal animal){
        animal.dormir();
        animal.fazerSom();
        if ( animal instanceof Pato pato){
            pato.botarOvo();
        }
    }
}
