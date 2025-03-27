package com.senai.aula05_polimorfismo.exemplos.sistema_de_gestao_de_veiculos;

public class Caminhao extends Veiculos{
    public Caminhao(String modelo) {
        super(modelo);
    }
    @Override
    public void realizarManutencao() {
        System.out.println("Verificação dos freios realizada para o caminhão "+ getModelo());
    }
}
