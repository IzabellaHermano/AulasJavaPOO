package com.senai.aula06_abstracao.exemplos.veiculos;

public abstract class Veiculo {
    private int velocidade;

    public Veiculo() {
        this.velocidade = 0;
    }
    public void acelerar(int incremento){
        velocidade+= incremento;
        System.out.println("Acelerando para "+velocidade+" km/h.");
    }
    abstract void ligar();
}
