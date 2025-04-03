package com.senai.aula06_abstracao.exemplos.exemplos_classe_abstrata.veiculos;

public class Main {
    public static void main(String[] args) {
        testarVeiculo(new Carro());
        testarVeiculo(new Moto());
    }
    public static void testarVeiculo(Veiculo veiculo){
        veiculo.ligar();
        veiculo.acelerar(10);
        veiculo.acelerar(20);
    }
}
