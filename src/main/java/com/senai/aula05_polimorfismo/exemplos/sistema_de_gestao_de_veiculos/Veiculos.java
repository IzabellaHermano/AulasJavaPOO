package com.senai.aula05_polimorfismo.exemplos.sistema_de_gestao_de_veiculos;

public class Veiculos {
    private String modelo;

    public Veiculos(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }
    public void realizarManutencao(){
        System.out.println("Manutenção generica.");
    }
}
