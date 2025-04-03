package com.senai.aula06_abstracao.exemplos.exemplos_classe_abstrata.aparelhos_eletronico;

public class Televisao implements AparelhoEletronico{
    @Override
    public void ligar() {
        System.out.println("Televisao Ligado");
    }

    @Override
    public void desligar() {
        System.out.println("Televisao Desligado");
    }
}
