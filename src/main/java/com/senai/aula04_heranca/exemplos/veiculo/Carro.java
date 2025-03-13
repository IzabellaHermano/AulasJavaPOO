package com.senai.aula04_heranca.exemplos.veiculo;

public class Carro  extends Veiculos{
    //extends:Define que uma classe herda de outra.

    private int portas;

    public Carro(String marca, int ano, int portas) {
        super(marca, ano);// super: Permite chamar o construtor ou métodos da classe pai.
        this.portas = portas;
    }

    @Override//Sobrescrever métodos herdados
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("\nPortas: "+portas);
    }
}
