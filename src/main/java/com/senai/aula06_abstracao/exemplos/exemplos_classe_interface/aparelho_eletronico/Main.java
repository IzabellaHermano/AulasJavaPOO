package com.senai.aula06_abstracao.exemplos.exemplos_classe_interface.aparelho_eletronico;

public class Main {
    public static void main(String[] args) {
        testarAparelho(new Computador());
        testarAparelho(new Televisao());

    }
    public static void testarAparelho( AparelhoEletronico aparelhoEletronico){
        System.out.println("---------TESTANDO APARELHOS---------");
        aparelhoEletronico.ligar();
        aparelhoEletronico.desligar();

    }
}
