package com.senai.aula05_polimorfismo.exemplos.animal;

public class Main {
    public static void main(String[] args) {
       // testarSomAnimal(new Cachorro());
        testarSomAnimal(new Pato());
    }

    public static void testarSomAnimal(Animal animal){
        animal.fazerSom();
        Pato pato = ( Pato) animal;
        pato.voar();
    }

}
