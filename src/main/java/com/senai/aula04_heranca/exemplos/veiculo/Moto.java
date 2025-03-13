package com.senai.aula04_heranca.exemplos.veiculo;

public class Moto extends Veiculos{
    private boolean temPartidaEletrica;

    public Moto(String marca, int ano, boolean temPartidaEletrica) {
        super(marca, ano);
        this.temPartidaEletrica = temPartidaEletrica;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("\nPartidia Eletrica? "+(temPartidaEletrica? "SIM.":"NÃO."));//Operador Ternário
    }
}
