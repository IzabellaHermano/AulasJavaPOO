package com.senai.aula06_abstracao.exemplos.exemplos_classe_interface.veiculo;

public class Carro implements Veiculo {
    @Override
    public void acelerrar() {
        System.out.println("Carro acelerando");
    }
}
