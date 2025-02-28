package com.senai.aula03_encapsulamento.exemplos.exemplo01;

// Definição da classe Carro

class Carro {

    // Atributo privado: só pode ser acessado dentro da própria classe

     int velocidade;

    // Construtor da classe
    public Carro() {

        velocidade = 0; // Inicialmente o carro está parado

    }

    //Metodo público para obter a velocidade (Getter)
    public int getVelocidade() {
        //getter= retorna o valor (tipo println)

        return velocidade;

    }

    // Metodo público para definir a velocidade (Setter)
    public void setVelocidade(int velocidade) {
        //setter = altera/define o valor (tipo scanner)

        if (velocidade >= 0) { // Regra de negócio: velocidade não pode ser negativa

            this.velocidade = velocidade;

        } else {

            System.out.println("Velocidade inválida!");

        }

    }

}
