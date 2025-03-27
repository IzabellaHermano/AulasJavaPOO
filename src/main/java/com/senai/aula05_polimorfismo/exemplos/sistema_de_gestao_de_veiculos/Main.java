package com.senai.aula05_polimorfismo.exemplos.sistema_de_gestao_de_veiculos;

public class Main {
    public static void main(String[] args) {
        realizarManutencao(new Carro("Mercedes AMG 63"));
        realizarManutencao(new Moto("Honda Biz 125"));
        realizarManutencao(new Caminhao("Scania 1659"));
    }
    private static  void  realizarManutencao(Veiculos veiculos){
        veiculos.realizarManutencao();
    }
}
